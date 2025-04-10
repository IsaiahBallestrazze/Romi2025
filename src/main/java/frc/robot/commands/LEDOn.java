// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.IOBoard;

public class LEDOn extends Command {
  /** Creates a new LEDOn. */
  private final IOBoard s_IoBoard;

  public LEDOn(IOBoard d_IoBoard) {
    // Use addRequirements() here to declare subsystem dependencies.
    s_IoBoard = d_IoBoard;
    addRequirements(s_IoBoard);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    s_IoBoard.setGreenLed(true);
    s_IoBoard.setRedLed(true);
    s_IoBoard.setYellowLed(true);

    //s_IoBoard.TestEXT(true);
    s_IoBoard.setEXT0(true);
    s_IoBoard.setEXT1(true);
    s_IoBoard.setEXT2(true);
    s_IoBoard.setEXT3(false);
    s_IoBoard.setEXT4(false);

    System.out.println("EXT 3 Input: " + s_IoBoard.inEXT5());
    System.out.println("EXT 4 Input: " + s_IoBoard.inEXT6());

    s_IoBoard.Servo(180);

    System.out.println("BUTTON PRESSED");

  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return true;
  }
}
