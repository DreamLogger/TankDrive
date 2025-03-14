// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.TalonSRXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.TalonSRXConfiguration;
import com.ctre.phoenix6.configs.Slot0Configs;
import com.ctre.phoenix6.configs.TalonFXConfiguration;
import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.coralOutputConstants;

public class CoralOutputSubsystem extends SubsystemBase {
  TalonSRX coralMotor;
  /** Creates a new CoralOutputSubsystem. */
  public CoralOutputSubsystem() {
    coralMotor = new TalonSRX(coralOutputConstants.coralMotorPort);
  }

  public void shootCoralStatic (){
    coralMotor.set(TalonSRXControlMode.PercentOutput, coralOutputConstants.setShootingSpeed);
  }

  public void stopshotCoralStatic (){
    coralMotor.set(TalonSRXControlMode.PercentOutput, 0);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
