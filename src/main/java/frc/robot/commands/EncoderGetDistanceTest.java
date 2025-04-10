// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Drivetrain;

/* You should consider using the more terse Command factories API instead https://docs.wpilib.org/en/stable/docs/software/commandbased/organizing-command-based.html#defining-commands */
public class EncoderGetDistanceTest extends Command {
  /** Creates a new EncoderGetDistanceTest. */
  Drivetrain s_Drivetrain;
  public EncoderGetDistanceTest(Drivetrain d_Drivetrain) {
    // Use addRequirements() here to declare subsystem dependencies.
    s_Drivetrain = d_Drivetrain;
    addRequirements(s_Drivetrain);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    //s_Drivetrain.resetEncoders();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    double encoderTestDistance = s_Drivetrain.getRawEncoderTest();
    System.out.println("Test Motor: " + encoderTestDistance);

    double RightMotorDistance = s_Drivetrain.getRawEncoderRight();
    System.out.println("Right Motor: " + RightMotorDistance);

    // double LeftMotorDistance = s_Drivetrain.getRawEncoderleft();
    // System.out.println("Left Motor: " + LeftMotorDistance);
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
