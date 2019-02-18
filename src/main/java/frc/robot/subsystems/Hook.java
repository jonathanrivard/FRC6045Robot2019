/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

public class Hook extends Subsystem {
  //INSTANCE VARIABLES
  Spark tiltMotor;
  //GETTERS
  public Spark getTiltMotor() { return tiltMotor; }

  public Hook(){
    //Setup tilt motor
    tiltMotor = new Spark(RobotMap.MOTOR_HOOK);
    tiltMotor.setInverted(false);
  }

  public void setPercentage(double per){
    tiltMotor.set(per * RobotMap.SCALER_HOOK);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
