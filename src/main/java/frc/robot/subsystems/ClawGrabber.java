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
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

public class ClawGrabber extends Subsystem {
  //INSTANCE VARIABLES
  //-Motors
  TalonSRX grabMotor;
  //-Limit Switches
  DigitalInput openLimit;
  DigitalInput closedLimit;
  //GETTERS
  //-Motors
  public TalonSRX getGrabMotor() { return grabMotor; }
  //-Limit Switches
  //public boolean getOpenLimit() { return openLimit.get(); }
  //public boolean getClosedLimit() { return closedLimit.get(); }

  //Constructor
  public ClawGrabber(){
    //Setup Claw Motor
    grabMotor = new TalonSRX(RobotMap.MOTOR_CLAW);
    grabMotor.setInverted(false);
    grabMotor.configPeakCurrentDuration(0, 30);
    grabMotor.setSelectedSensorPosition(0);
  }

  //Set speed of grab motor
  public void setPercentage(double per){
    grabMotor.set(ControlMode.PercentOutput, per);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
