/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

public class ClawTilter extends Subsystem {
  //INTANCE VARIABLES 
  //-Motors
  Spark tiltMotor;
  //-Limit Switches
  DigitalInput topLimit;
  DigitalInput bottomLimit;
  //GETTERS
  //-Motors
  public Spark getTiltMotor() { return tiltMotor; }
  //-Limit Switches
  public boolean getTopLimit() { return topLimit.get(); }
  public boolean getBottomLimit() { return bottomLimit.get(); }

  public ClawTilter(){
    //Setup tiler claw
    tiltMotor = new Spark(RobotMap.MOTOR_CLAW_TILT);
    tiltMotor.setInverted(false);
    //Limit Switches
    topLimit = new DigitalInput(RobotMap.DIGITAL_CLAW_TILTER_TOP);
    bottomLimit = new DigitalInput(RobotMap.DIGITAL_CLAW_TILTER_BOTTOM);
  }

  //Set speed of tilt motor
  public void setPercentage(double per){
    tiltMotor.set(per);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
