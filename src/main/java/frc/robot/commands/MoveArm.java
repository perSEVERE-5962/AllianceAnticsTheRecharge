// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Arm;

public class MoveArm extends CommandBase {
  /** Creates a new ArmUp. */

  private int m_speed = 0;
  private Arm m_arm;
  private long m_startTime;
  private long m_duration;

  public MoveArm(int speed, Arm arm, long duration) {
    // Use addRequirements() here to declare subsystem dependencies.
    m_speed = speed;
    m_arm = arm;
    addRequirements(m_arm);
    m_duration = duration;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    m_arm.setSpeed(m_speed);
    m_startTime = System.currentTimeMillis();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_arm.setSpeed(m_speed);
  }

  // Called once the command ends or is interrupted. boop.
  @Override
  public void end(boolean interrupted) {
    m_arm.setSpeed(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return (System.currentTimeMillis() - m_startTime) > m_duration;
  }
}
