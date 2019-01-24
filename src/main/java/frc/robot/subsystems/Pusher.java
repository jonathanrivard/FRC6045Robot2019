/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.RotatePusher;
import edu.wpi.first.wpilibj.Spark;
/**
 * Add your docs here.
 */
public class Pusher extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  Spark pushMotor = null;
  RotatePusher pusherCommand = null;
  boolean motorToggel = true;
  

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand( new RotatePusher());
  }
  public void rotatePusher(double degrees){
    if (motorToggel == true){
      pushMotor.set(0.5);
      motorToggel = false;
    }  
    else if (motorToggel == false){
      pushMotor.set(0.0);
      motorToggel = true;
    }
  }
    

  public Pusher(){

    pushMotor = new Spark(RobotMap.MOTOR_PUSHER);
    pushMotor.setInverted(false);
  }
}
