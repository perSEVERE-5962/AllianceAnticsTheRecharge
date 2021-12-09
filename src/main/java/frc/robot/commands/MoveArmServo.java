package frc.robot.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Arm;

public class MoveArmServo extends CommandBase {

  private Arm m_arm;
  private Joystick m_controller;

  public MoveArmServo(Arm arm, Joystick controller) {
    m_arm = arm;
    m_controller = controller;
    addRequirements(m_arm);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {

  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if (m_controller.getRawButton(1)) {
        m_arm.setAngle(160);
    }
    
    if (m_controller.getRawButton(2)) {
        m_arm.setAngle(60);
    }
  }

  // Called once the command ends or is interrupted. boop.
  @Override
  public void end(boolean interrupted) {

  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
      return false;
  }
}
