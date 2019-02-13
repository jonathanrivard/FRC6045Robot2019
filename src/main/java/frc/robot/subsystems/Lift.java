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
import frc.robot.commands.ManualLift;

public class Lift extends Subsystem { //Subsystem for elevator lift

  //INSTANCE VARIABLES
  //-Motors
  TalonSRX liftMotor;
  //-Limit Switches
  DigitalInput topLimit;
  DigitalInput bottomLimit;
  //GETTERS
  //-Motors
  public TalonSRX getLiftMotor() { return liftMotor; }
  //-Limit Switches
  public boolean getTopLimit() { return topLimit.get(); }
  public boolean getBottomLimit() { return bottomLimit.get(); }

  //Constuctor
  public Lift(){
    //Setup Motor
    liftMotor = new TalonSRX(13);
    liftMotor.setInverted(false); //Positive value lifts up
    liftMotor.configPeakCurrentDuration(0, 30);
    liftMotor.setSelectedSensorPosition(0);
    //topLimit = new DigitalInput(RobotMap)
  }

  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new ManualLift()); //Manual Lift Control by default
  }

  //Set the position of the motor
  //Currently Unused
  public void setPosition(int pos){
    liftMotor.set(ControlMode.Position, pos);
  }

  //Set the motor using percentage output
  public void setPercentage(double per){
    liftMotor.set(ControlMode.PercentOutput, per);
  }

  //Set the encoders current position
  public void setCurrentPosition(int pos){
    liftMotor.setSelectedSensorPosition(pos);
  }
}
