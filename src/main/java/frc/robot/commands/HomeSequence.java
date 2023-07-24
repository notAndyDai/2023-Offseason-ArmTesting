// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Arm;

public class HomeSequence extends CommandBase {
  private Arm arm;

  /** Creates a new HomeSequence. */
  public HomeSequence() {
    arm = Arm.getInstance();
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    arm.setPower(-0.07);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    arm.setPower(0);
    arm.resetArmPosition();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return arm.getFrontSwitchPressed();
  }
}
