/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.GrabToPosition;
import frc.robot.commands.MoveLift;
import frc.robot.commands.RunBelt;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
  //JOYSTICKS
  public Joystick controlJoystick = new Joystick(RobotMap.CONTROL_JOYSTICK);
  public Joystick leftJoystick = new Joystick(RobotMap.LEFT_JOYSTICK);
  public Joystick rightJoystick = new Joystick(RobotMap.RIGHT_JOYSTICK);
  //BUTTONS
  //-Control Joystick Buttons
  Button controlButtonTrigger = new JoystickButton(controlJoystick, RobotMap.CONTROL_JOYSTICK_TRIGGER);
  Button controlButtonThumb = new JoystickButton(controlJoystick, RobotMap.CONTROL_JOYSTICK_THUMB);
  //-Position Buttons
  Button buttonPositionOne = new JoystickButton(rightJoystick, RobotMap.RIGHT_POS_ONE);
  Button buttonPositionTwo = new JoystickButton(rightJoystick, RobotMap.RIGHT_POS_TWO);
  Button buttonPositionThree = new JoystickButton(rightJoystick, RobotMap.RIGHT_POS_THREE);
  Button buttonPositionFour = new JoystickButton(rightJoystick, RobotMap.RIGHT_POS_FOUR);
  Button buttonPositionFive = new JoystickButton(rightJoystick, RobotMap.RIGHT_POS_FIVE);
  Button buttonPositionSix = new JoystickButton(rightJoystick, RobotMap.RIGHT_POS_SIX);
  Button buttonPositionSeven = new JoystickButton(rightJoystick, RobotMap.RIGHT_POS_SEVEN);
  Button buttonPositionEight = new JoystickButton(rightJoystick, RobotMap.RIGHT_POS_EIGHT);
  //-Claw Button
  Button buttonClawPositionHatchPos = new JoystickButton(controlJoystick, RobotMap.GRAB_HATCH_POS);
  public OI(){
    //Belt Buttons
    controlButtonTrigger.whileHeld(new RunBelt(1));
    controlButtonThumb.whileHeld(new RunBelt(-1));
    //Create the position buttons
    buttonPositionOne.whileHeld(new MoveLift(1));
    buttonPositionTwo.whileHeld(new MoveLift(2));
    buttonPositionThree.whileHeld(new MoveLift(3));
    buttonPositionFour.whileHeld(new MoveLift(4));
    buttonPositionFive.whileHeld(new MoveLift(5));
    buttonPositionSix.whileHeld(new MoveLift(6));
    buttonPositionSeven.whileHeld(new MoveLift(7));
    buttonPositionEight.whileHeld(new MoveLift(8));
    buttonClawPositionHatchPos.whileHeld(new GrabToPosition(9));

    //Testing using position buttons
    //buttonPositionOne.whileHeld(new TestLift());
    //buttonPositionTwo.whileHeld(new TestGrab());
    //buttonPositionThree.whileHeld(new TestTilt());
    //buttonPositionFour.whileHeld(new TestBelt());
  }

  public double getControlThrottleScaler(){
    double scaler = controlJoystick.getThrottle();
    scaler = (scaler * -1 + 1) / 2; //Change the scaler to a usable value

    return scaler;
  }

  public double getLeftThrottleScaler(){
    double scaler = leftJoystick.getThrottle();
    scaler = (scaler * -1 + 1) / 2; //Change the scaler to a usable value

    return scaler;
  }

  public double getRightThrottleScaler(){
    double scaler = rightJoystick.getThrottle();
    scaler = (scaler * -1 + 1) / 2; //Change the scaler to a usable value

    return scaler;
  }
}