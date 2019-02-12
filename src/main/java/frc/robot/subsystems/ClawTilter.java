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

public class ClawTilter extends Subsystem {
  //INTANCE VARIABLES 
  //-Motors
  TalonSRX tiltMotor;
  //-Limit Switches
  DigitalInput topLimit;
  DigitalInput bottomLimit;
  //GETTERS
  //-Motors
  public TalonSRX getTiltMotor() { return tiltMotor; }
  //-Limit Switches
  //public boolean getTopLimit() { return topLimit.get(); }
  //public boolean getBottomLimit() { return bottomLimit.get(); }

  public ClawTilter(){
    //Setup tiler claw
    tiltMotor = new TalonSRX(RobotMap.MOTOR_CLAW_TILT);
    tiltMotor.setInverted(false);
    tiltMotor.configPeakCurrentDuration(0, 30);
    tiltMotor.setSelectedSensorPosition(0);
    //Limit Switches
    //topLimit = new DigitalInput(RobotMap.DIGITAL_CLAW_TILTER_TOP);
    //bottomLimit = new DigitalInput(RobotMap.DIGITAL_CLAW_TILTER_BOTTOM);
  }

  //Set speed of tilt motor
  public void setPercentage(double per){
    tiltMotor.set(ControlMode.PercentOutput, per);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
