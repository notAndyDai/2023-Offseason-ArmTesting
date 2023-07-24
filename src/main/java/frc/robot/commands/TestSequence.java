// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import frc.robot.subsystems.Arm;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class TestSequence extends SequentialCommandGroup {
  private Arm arm;

  /** Creates a new TestSequence. */
  public TestSequence() {
    arm = Arm.getInstance();
    // Add your commands in the addCommands() call, e.g.
    // addCommands(new FooCommand(), new BarCommand());
    addCommands(new HomeSequence(), new WaitCommand(1), new InstantCommand(() -> arm.setAngle(90)), new WaitCommand(2),
        new InstantCommand(() -> arm.setAngle(180)), new WaitCommand(10), new InstantCommand(() -> arm.setAngle(90)));
  }
}
