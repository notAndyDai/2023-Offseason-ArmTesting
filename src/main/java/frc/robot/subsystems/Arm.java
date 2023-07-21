// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.TalonFXControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Arm extends SubsystemBase {

  private static Arm mInstance;
  private WPI_TalonFX armMotor;
  private DigitalInput limitSwitch;

  public static Arm getInstance() {
    if (mInstance == null) {
      mInstance = new Arm();
    }
    return mInstance;
  }

  /** Creates a new Arm. */
  protected Arm() {
    armMotor = new WPI_TalonFX(0);
    armMotor.setSelectedSensorPosition(0);
    armMotor.setNeutralMode(NeutralMode.Brake);

    limitSwitch = new DigitalInput(9);
  }

  public void setAngle(double angle) {
    armMotor.set(TalonFXControlMode.Position, angleToTicks(angle));
  }

  public double angleToTicks(double angle) {
    return (Constants.MOTOR_TICKS_PER_REV / 360) * angle * Constants.ARM_GEAR_RATIO;
  }

  public double getPositionRaw() {
    return armMotor.getSelectedSensorPosition();
  }

  private double ticksToAngle(double angle) {
    return (Constants.MOTOR_TICKS_PER_REV / 360) * angle * Constants.ARM_GEAR_RATIO;
  }

  public void setCoast() {
    armMotor.setNeutralMode(NeutralMode.Coast);
  }

  public void setBrake() {
    armMotor.setNeutralMode(NeutralMode.Brake);
  }
}
