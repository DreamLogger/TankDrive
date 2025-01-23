// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.TankDriveSubsystem;
import edu.wpi.first.wpilibj2.command.Command;
import java.util.function.Supplier;

public class DyanmicCommand extends Command {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private final TankDriveSubsystem m_tankDriveSubsystem;
  Supplier <Double> setSpeedLeft;
  Supplier <Double> setSpeedRight;
  /**
   * Creates a new ExampleCommand.
   *
   * @param tankDriveSubsystem The subsystem used by this command.
   */
  public DyanmicCommand(TankDriveSubsystem tankDriveSubsystem, Supplier <Double> new_SetSpeedLeft, Supplier <Double> new_SetSpeedRight) {
    m_tankDriveSubsystem = tankDriveSubsystem;
    setSpeedLeft = new_SetSpeedLeft;
    setSpeedRight = new_SetSpeedRight;

    addRequirements(tankDriveSubsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_tankDriveSubsystem.setSpeedMotorDyanmic(setSpeedLeft.get(),setSpeedRight.get());
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
