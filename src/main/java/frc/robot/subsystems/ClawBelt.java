/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

public class ClawBelt extends Subsystem {
  //INSTANCE VARIABLES
  //-Motors
  VictorSPX beltMotorLeft;
  VictorSPX beltMotorRight;
  //GETTERS 
  //-Motors
  public VictorSPX getLeftBeltMotor() { return beltMotorLeft; }
  public VictorSPX getRightBeltMotor() { return beltMotorRight; }

  //Constuctor
  public ClawBelt(){
    beltMotorLeft = new VictorSPX(RobotMap.MOTOR_CLAW_BELT_LEFT);
    beltMotorLeft.setInverted(false);
    beltMotorRight = new VictorSPX(RobotMap.MOTOR_CLAW_BELT_RIGHT);
    beltMotorRight.setInverted(false);
  }

  //Set speed of belt motor
  public void setPercentage(double per){
    beltMotorLeft.set(ControlMode.PercentOutput, per);
    beltMotorRight.set(ControlMode.PercentOutput, per);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
