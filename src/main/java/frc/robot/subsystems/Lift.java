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
import frc.robot.commands.ManualLift;

public class Lift extends Subsystem {

  //Instance Varibles
  TalonSRX liftMotor;
  TalonSRX encoderMotor;
  DigitalInput topLimit;
  DigitalInput bottomLimit;
  //Getters
  public TalonSRX getLiftMotor() { return liftMotor; }
  public TalonSRX getEncoderMotor() { return encoderMotor; }
  public boolean getTopLimit() { return topLimit.get(); }
  public boolean getBottomLimit() { return bottomLimit.get(); }

  //Constuctor
  public Lift(){
    encoderMotor = new TalonSRX(0);
    liftMotor = new TalonSRX(1);
    liftMotor.setInverted(false);
    encoderMotor.configPeakCurrentDuration(0, 30);
    encoderMotor.setSelectedSensorPosition(0);
  }

  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new ManualLift());
  }

  //Methods
  public void setPosition(int pos){
    liftMotor.set(ControlMode.Position, pos);
  }

  public void setPercentage(double per){
    liftMotor.set(ControlMode.PercentOutput, per);
    /*
    if(per > 0){
      //liftMotor.setInverted(false);
      //liftMotor.setSensorPhase(false);
      liftMotor.set(ControlMode.PercentOutput, per);
    }else if(per < 0){
      //liftMotor.setInverted(true);
      //liftMotor.setSensorPhase(true);
      liftMotor.set(ControlMode.PercentOutput, per);
    }else {
      //liftMotor.setInverted(false);
      //liftMotor.setSensorPhase(false);
      liftMotor.set(ControlMode.PercentOutput, 0);
    }
    */
  }

  public void setCurrentPosition(int pos){
    liftMotor.setSelectedSensorPosition(pos);
  }
}
