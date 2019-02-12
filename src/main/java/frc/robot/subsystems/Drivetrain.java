/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotMap;
import frc.robot.commands.TankDrive;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

public class Drivetrain extends Subsystem {

  //INSTANCE VARIABLES
  //-Motors
  public WPI_TalonSRX frontLeftMotor;
  WPI_TalonSRX backLeftMotor;
  WPI_TalonSRX frontRightMotor;
  WPI_TalonSRX backRightMotor;
  //-Motor Groups
  SpeedControllerGroup leftMotors;
  SpeedControllerGroup rightMotors;
  //-Drive
  DifferentialDrive drive;

  public Drivetrain(){
    //Create Motors
    frontLeftMotor = new WPI_TalonSRX(RobotMap.MOTOR_LEFT_FRONT);
    backLeftMotor = new WPI_TalonSRX(RobotMap.MOTOR_LEFT_BACK);
    frontRightMotor = new WPI_TalonSRX(RobotMap.MOTOR_RIGHT_FRONT);
    backRightMotor = new WPI_TalonSRX(RobotMap.MOTOR_RIGHT_BACK);
    //Create motor sides
    leftMotors = new SpeedControllerGroup(frontLeftMotor, backLeftMotor);
    rightMotors = new SpeedControllerGroup(frontRightMotor, backRightMotor);
    //Create drive
    drive = new DifferentialDrive(leftMotors, rightMotors);
  }

  //Arcade Drive Method
  public void arcadeDrive(double xSpeed, double zRotation){
    drive.arcadeDrive(xSpeed, zRotation);
  }

  //Tank Drive Method
  public void tankDrive(double leftSpeed, double rightSpeed){
    drive.tankDrive(leftSpeed, rightSpeed);
  }

  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new TankDrive()); //Default command is the arcade drive
  }
}
