// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.TalonSRXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.TalonSRXConfiguration;
import com.ctre.phoenix6.configs.Slot0Configs;
import com.ctre.phoenix6.configs.TalonFXConfiguration;
import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.tankDriveConstants;


public class TankDriveSubsystem extends SubsystemBase {
  TalonSRX tLeftMotor;
  TalonSRX bLeftMotor;
  TalonSRX tRightMotor;
  TalonSRX bRightMotor;
  
// TalonFXConfiguration pidConfiguration = new TalonFXConfiguration().withSlot0(new Slot0Configs().withKP(tankDriveConstants.kTankP).withKI(tankDriveConstants.kTankI).withKD(tankDriveConstants.kTankD));

  public TankDriveSubsystem() {
    tLeftMotor = new TalonSRX(tankDriveConstants.tLeftMotorPort);
    bLeftMotor = new TalonSRX(tankDriveConstants.bLeftMotorPort);
    tRightMotor = new TalonSRX(tankDriveConstants.tRightMotorPort);
    bRightMotor = new TalonSRX(tankDriveConstants.bRightMotorPort);
    // tLeftMotor.getConfigurator().apply(pidConfiguration);
    // bLeftMotor.getConfigurator().apply(pidConfiguration);
    // tRightMotor.getConfigurator().apply(pidConfiguration);
    // bRightMotor.getConfigurator().apply(pidConfiguration);
  }

  public void setSpeedMotorDyanmic (double setSpeedRight, double setSpeedLeft){
    tLeftMotor.set(TalonSRXControlMode.PercentOutput, setSpeedLeft);
    bLeftMotor.set(TalonSRXControlMode.PercentOutput, setSpeedLeft);
    tRightMotor.set(TalonSRXControlMode.PercentOutput, -setSpeedRight);
    bRightMotor.set(TalonSRXControlMode.PercentOutput,-setSpeedRight);
  }

  /**
   * Example command factory method.
   *
   * @return a command
   */
  public Command exampleMethodCommand() {
    // Inline construction of command goes here.
    // Subsystem::RunOnce implicitly requires `this` subsystem.
    return runOnce(
        () -> {
          /* one-time action goes here */
        });
  }

  /**
   * An example method querying a boolean state of the subsystem (for example, a digital sensor).
   *
   * @return value of some boolean subsystem state, such as a digital sensor.
   */
  public boolean exampleCondition() {
    // Query some boolean state, such as a digital sensor.
    return false;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
