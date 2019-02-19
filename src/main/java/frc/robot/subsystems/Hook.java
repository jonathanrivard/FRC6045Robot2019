/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;


import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.Robot;
import frc.robot.RobotMap;
import frc.robot.commands.ManualHook;

public class Hook extends Subsystem {
  //INSTANCE VARIABLES
  TalonSRX tiltMotor;
  //GETTERS
  public TalonSRX getTiltMotor() { return tiltMotor; }

  public Hook(){
    //Setup tilt motor
    tiltMotor = new TalonSRX(RobotMap.MOTOR_HOOK);
    tiltMotor.setInverted(false);
  }

  public void setPercentage(double per){
    tiltMotor.set(ControlMode.PercentOutput, per * RobotMap.SCALER_HOOK * Robot.m_oi.getLeftThrottleScaler());
  }

  @Override
  public void initDefaultCommand() {
   setDefaultCommand(new ManualHook());
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
