// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Subsystem;
import frc.robot.subsystems.IOBoard;

/* You should consider using the more terse Command factories API instead https://docs.wpilib.org/en/stable/docs/software/commandbased/organizing-command-based.html#defining-commands */
public class EXT1Input extends Command {
  /** Creates a new EXT1. */
    private final IOBoard s_IoBoard;
  Boolean state1;
  public EXT1Input(IOBoard d_IoBoard, boolean state2) {
    // Use addRequirements() here to declare subsystem dependencies.
    s_IoBoard = d_IoBoard;
    state1=state2;
    addRequirements(s_IoBoard);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {

     s_IoBoard.EXTValue3(state1);
     s_IoBoard.EXTValue4(state1);
    System.out.println("EXT1: " + state1);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return true;
  }
}
