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

public class Lift extends Subsystem {

  //Instance Varibles
  TalonSRX motor;
  DigitalInput topLimit;
  DigitalInput bottomLimit;
  //Getters
  public TalonSRX getMotor() { return motor; }
  

  //Constuctor
  public Lift(){
    motor = new TalonSRX(0);
    motor.setInverted(false);
    motor.configPeakCurrentDuration(0, 30);
    motor.setSelectedSensorPosition(0);
  }

  @Override
  public void initDefaultCommand() {
    // setDefaultCommand(new MySpecialCommand());
  }

  //Methods
  public void setPosition(int pos){
    motor.set(ControlMode.Position, pos);
  }

  public void setPercentage(double per){
    motor.set(ControlMode.PercentOutput, per);
  }

  public void setCurrentPosition(int pos){
    motor.setSelectedSensorPosition(pos);
  }
}
