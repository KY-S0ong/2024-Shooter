// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.math.filter.SlewRateLimiter;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Shooter;

public class RunShooterForwards extends Command {
  /** Creates a new RunShooterF. */
  private final Shooter shooter;
  private final XboxController xc;
  private final SlewRateLimiter filter = new SlewRateLimiter(130);
  
  public RunShooterForwards(Shooter shooter, XboxController x) {
    // Use addRequirements() here to declare subsystem dependencies.
    this.shooter = shooter;
    xc = x;
    addRequirements(shooter);
  }
  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    //shooter.ShooterController(filter.calculate(100));
    shooter.ShooterController(filter.calculate(300*xc.getRightTriggerAxis()));
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    shooter.shooterZero();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
