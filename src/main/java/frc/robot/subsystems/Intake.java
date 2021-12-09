// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Intake extends SubsystemBase {
  /** Creates a new Intake. */
  private int m_channel = 2;
  private Spark m_spark = new Spark(m_channel);
  public Intake() {}

  public void setSpeed(double d) {
    m_spark.set(d);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
