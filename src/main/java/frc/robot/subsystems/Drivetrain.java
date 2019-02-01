/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class Drivetrain extends Subsystem {

  TalonSRX frontLeftMotor;
  TalonSRX backLeftMotor;
  TalonSRX frontRightMotor;
  TalonSRX backRightMotor;


  public Drivetrain(){

  }

  @Override
  public void initDefaultCommand() {
    //setDefaultCommand(new MySpecialCommand());
  }
}
