// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.CoralOutputSubsystem;

public class AutoCoralOutput extends Command {

    private final CoralOutputSubsystem m_CoralOutputSubsystem;
    Timer m_timer;
    Double m_duration;

  public AutoCoralOutput(CoralOutputSubsystem coralOutputSubsystem, double duration) {
    m_CoralOutputSubsystem = coralOutputSubsystem;
    m_timer = new Timer();
    m_duration = duration;
    
    addRequirements(coralOutputSubsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    m_CoralOutputSubsystem.shootCoralStatic();
    m_timer.reset();
    m_timer.start();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_CoralOutputSubsystem.stopshotCoralStatic();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return m_timer.get()>m_duration;
  }
}
