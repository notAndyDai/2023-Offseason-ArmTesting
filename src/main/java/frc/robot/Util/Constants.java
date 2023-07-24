// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Util;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide
 * numerical or boolean
 * constants. This class should not be used for any other purpose. All constants
 * should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>
 * It is advised to statically import this class (or one of its inner classes)
 * wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static final int ARM_MOTOR_ID = 0;
  public static final int LIMIT_SWITCH_PORT = 9;

  public static final int MOTOR_TICKS_PER_REV = 2048;
  public static final double ARM_GEAR_RATIO = 129.26;

  public static final double ARM_RESET_ANGLE_DEGREES = 57;

  // p: 0.086 i: 0.00001

}
