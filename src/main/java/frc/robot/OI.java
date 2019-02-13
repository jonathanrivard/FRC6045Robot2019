/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.*;
import frc.robot.commands.ManualLift;
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
  Button button4 = new JoystickButton(joystick, 4);
  Button position1 = new JoystickButton(joystick, RobotMap.LIFT_POSITION_ONE);
  Button position2 = new JoystickButton(joystick, RobotMap.LIFT_POSITION_TWO);
  Button position3 = new JoystickButton(joystick, RobotMap.LIFT_POSITION_THREE);
  Button position4 = new JoystickButton(joystick, RobotMap.LIFT_POSITION_FOUR);
  Button position5 = new JoystickButton(joystick, RobotMap.LIFT_POSITION_FIVE);
  Button position6 = new JoystickButton(joystick, RobotMap.LIFT_POSITION_SIX);
  Button position7 = new JoystickButton(joystick, RobotMap.LIFT_POSITION_SEVEN);
  Button position8 = new JoystickButton(joystick, RobotMap.LIFT_POSITION_EIGHT);

  public OI(){
    button1.whileHeld(new MoveLift(40000));
    button2.whileHeld(new MoveLift(0));
    button3.whileHeld(new TestCommand(0.8));
    button4.whileHeld(new TestCommand(-0.8));

    //Lift Positions
    /*
    position1.whileHeld(command);
    position2.whileHeld(command);
    position3.whileHeld(command);
    position4.whileHeld(command);
    position5.whileHeld(command);
    position6.whileHeld(command);
    position7.whileHeld(command);
    position8.whileHeld(command); 
    */
  }

  public int getLiftDirection(){
    int input = joystick.getPOV();
    int output;

    if(input == -1){
      output = 0; //Nothing/Middle
    }else if (input == 0){
      output = 1; //Up
    }else if(input == 180){
      output = -1; //Down
    }else {
      output = 0;
    }
    
    return output;
  }
}

