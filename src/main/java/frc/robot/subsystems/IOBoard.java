// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DigitalOutput;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IOBoard extends SubsystemBase {
  /** Creates a new OnBoardIO. */

  private final DigitalOutput greenled = new DigitalOutput(1);// Definds LED
  private final DigitalOutput redled = new DigitalOutput(2);
  private final DigitalOutput yellowled = new DigitalOutput(3);

  private final DigitalOutput EXT0Pin = new DigitalOutput(8);
  private final DigitalOutput EXT1Pin = new DigitalOutput(9);
  private final DigitalOutput EXT2Pin = new DigitalOutput(10);

  private final DigitalInput EXT3Pin = new DigitalInput(11);
  private final DigitalInput EXT4Pin = new DigitalInput(12);
  // private final Servo servo = new Servo(2);// defines servo
  /*
   * CHANNEL 3 (A4)
   * channel 2 (A3)
   */

  public IOBoard() {
  }

  public void setGreenLed(boolean value) {// Sets green LED, TRUE or FALSE
    greenled.set(value);
  }

  public void setRedLed(boolean value) {// Sets red LED, TRUE or FALSE
    redled.set(value);
  }

  public void setYellowLed(boolean value) {// Sets yellow LED, TRUE or FALSE
    yellowled.set(value);
  }

  public void EXTValue0(boolean value) {
    EXT0Pin.set(value);
  }
  public void EXTValue1(boolean value) {
    EXT1Pin.set(value);
  }
  public void EXTValue2(boolean value) {
    EXT2Pin.set(value);
  }
  public boolean EXTValue3() {
    return EXT3Pin.get();
  }
  public boolean EXTValue4() {
    return EXT4Pin.get();
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

}
