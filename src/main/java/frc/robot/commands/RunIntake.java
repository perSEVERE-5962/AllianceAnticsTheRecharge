// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Intake;

public class RunIntake extends CommandBase {
  /** Creates a new RunIntake. */
  private Intake m_intake;
  private Joystick m_controller;

  public RunIntake(Intake intake, Joystick controller) { //Constructor
    // Use addRequirements() here to declare subsystem dependencies.
    m_intake = intake;
    m_controller = controller;
    addRequirements(m_intake); //Tell the command that the intake is required. 
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if (m_controller.getRawAxis(2) > 0.2) {
      m_intake.setSpeed((m_controller.getRawAxis(2)) / 2);
    }
    else if (m_controller.getRawAxis(3) > 0.2) {
      m_intake.setSpeed((m_controller.getRawAxis(3)) / 2);
    } 
    else {
      m_intake.setSpeed(0);
    }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
