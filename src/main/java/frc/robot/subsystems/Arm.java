// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Arm extends SubsystemBase {
  /** Creates a new Arm. */

  private int m_channel = 3;
  private Servo m_servo = new Servo(m_channel);
  public Arm() {}

  public void setSpeed(int speed) {
    m_servo.set(speed);
  }

  public void setAngle(double angle) {
    m_servo.setAngle(angle);
  }

  public double getAngle() {
    return m_servo.getAngle();
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}

