// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Intake;

public class moveIntake extends CommandBase {
  /** Creates a new moveIntake. */

  private int m_speed = 0;
  private long m_duration;
  private Intake m_intake;
  private long m_startTime;

  public moveIntake(int speed, Intake intake, long duration) {
    // Use addRequirements() here to declare subsystem dependencies.
    m_speed = speed;
    m_intake = intake;
    addRequirements(m_intake);
    m_duration = duration;

  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    m_intake.setSpeed(m_speed);
    m_startTime = System.currentTimeMillis();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_intake.setSpeed(m_speed);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_intake.setSpeed(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return (System.currentTimeMillis() - m_startTime) > m_duration;
  }
}
