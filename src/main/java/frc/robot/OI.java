/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.*;
import frc.robot.commands.MoveLift;
import frc.robot.commands.RotatePusher;
import frc.robot.commands.TestCommand;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
  public Joystick joystick = new Joystick(0);
  Button button1 = new JoystickButton(joystick, RobotMap.BUTTON_TRIGGER);
  Button button2 = new JoystickButton(joystick, RobotMap.BUTTON_THUMB);
  Button button3 = new JoystickButton(joystick, RobotMap.BUTTON_THREE);
  Button position1 = new JoystickButton(joystick, RobotMap.LIFT_POSITION_ONE);
  Button position2 = new JoystickButton(joystick, RobotMap.LIFT_POSITION_TWO);
  Button position3 = new JoystickButton(joystick, RobotMap.LIFT_POSITION_THREE);
  Button position4 = new JoystickButton(joystick, RobotMap.LIFT_POSITION_FOUR);
  Button position5 = new JoystickButton(joystick, RobotMap.LIFT_POSITION_FIVE);
  Button position6 = new JoystickButton(joystick, RobotMap.LIFT_POSITION_SIX);
  Button position7 = new JoystickButton(joystick, RobotMap.LIFT_POSITION_SEVEN);
  Button position8 = new JoystickButton(joystick, RobotMap.LIFT_POSITION_EIGHT);
public OI(){
  
  button1.whileHeld(new MoveLift(4096 * 2));
  button2.whileHeld(new MoveLift(0));
  /*
  position1.whileHeld(command);
  position2.whileHeld(command);
  position3.whileHeld(command);
  position4.whileHeld(command);
  position5.whileHeld(command);
  position6.whileHeld(command);
  position7.whileHeld(command);
  position8.whileHeld(command); */
}
  //// CREATING BUTTONS
  // One type of button is a joystick button which is any button on a
  //// joystick.
  // You create one by telling it which joystick it's on and which button
  // number it is.
  // Joystick stick = new Joystick(port);
  // Button button = new JoystickButton(stick, buttonNumber);

  // There are a few additional built in buttons you can use. Additionally,
  // by subclassing Button you can create custom triggers and bind those to
  // commands the same as any other Button.

  //// TRIGGERING COMMANDS WITH BUTTONS
  // Once you have a button, it's trivial to bind it to a button in one of
  // three ways:

  // Start the command when the button is pressed and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenPressed(new ExampleCommand());

  // Run the command while the button is being held down and interrupt it once
  // the button is released.
  // button.whileHeld(new ExampleCommand());

  // Start the command when the button is released and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenReleased(new ExampleCommand());
}

