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

  // top left corner pins

  private final DigitalOutput EXT0 = new DigitalOutput(8);
  private final DigitalOutput EXT1 = new DigitalOutput(9);
  private final DigitalOutput EXT2 = new DigitalOutput(10);
  //private final DigitalOutput EXT3 = new DigitalOutput(11);
  //private final DigitalOutput EXT4 = new DigitalOutput(12);

  private final DigitalInput EXT5 = new DigitalInput(11);
  private final DigitalInput EXT6 = new DigitalInput(12);

  private final Servo servo = new Servo(2);// defines servo
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

  public void Servo(double degrees) {// Sets sevro, 0 to 180 degrees
    servo.set(degrees);
  }

  public void TestEXT(boolean value) { //test for on board pins 
    EXT0.set(value);
    EXT1.set(value);
    EXT2.set(value);
    //EXT3.set(value);
    //EXT4.set(value);
  }

  public void setEXT0(boolean value) { //EXT on and off
    EXT0.set(value);
  }
  public void setEXT1(boolean value) { //EXT on and off
    EXT1.set(value);
  }
  public void setEXT2(boolean value) { //EXT on and off
    EXT2.set(value);
  }
  public void setEXT3(boolean value) { //EXT on and off
   // EXT3.set(value);
  }
  public void setEXT4(boolean value) { //EXT on and off
    //EXT4.set(value);
  }

  public boolean inEXT5() { //EXT on and off
    //EXT4.set(value);
    System.out.println("inEXT5");
    return EXT5.get();
  }
  
  public boolean inEXT6() { //EXT on and off
    //EXT4.set(value);
    System.out.println("inEXT6");
    return EXT6.get();
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

}
