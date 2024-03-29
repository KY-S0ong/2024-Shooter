// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;


import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Shooter;

/** An example command that uses an example subsystem. */
public class ShooterCMD extends Command {
  
  private final Shooter m_subsystem;
  private XboxController xc;

  /**
   * Creates a new ExampleCommand.
   *
   * @param subsystem The subsystem used by this command.
   */
  public ShooterCMD(Shooter subsystem, XboxController x) {
    m_subsystem = subsystem;
    xc = x;

    addRequirements(subsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {

  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {

    //m_subsystem.ShooterController(100*xc.getLeftY());
    //m_subsystem.ShooterController(-100*xc.getLeftTriggerAxis());
   //m_subsystem.ShooterController(100*xc.getRightTriggerAxis());
    

    //m_subsystem.ShooterController(100*xc.getRightTriggerAxis());
    //m_subsystem.ShooterController(100*xc.getLeftTriggerAxis());

  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_subsystem.ShooterController(0);

  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
