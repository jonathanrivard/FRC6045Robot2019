/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotMap;
import frc.robot.commands.DriveArcade;

/**
 * Add your docs here.
 */
public class DriveTrain extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  VictorSP leftFrontMotor = null;
  VictorSP leftBackMotor = null;
  Talon rightFrontMotor = null;
  Talon rightBackMotor = null;
  DifferentialDrive diff = null;
 
  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new DriveArcade());
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }

  

  public void arcadeDrive(double xValue, double yValue) {
    diff.arcadeDrive(xValue, yValue);

  }

  public DriveTrain() {
    leftFrontMotor = new VictorSP(RobotMap.MOTOR_LEFT_FRONT);
    leftFrontMotor.setInverted(false);
    leftBackMotor = new VictorSP(RobotMap.MOTOR_LEFT_BACK);
    leftBackMotor.setInverted(false);
    rightFrontMotor = new Talon(RobotMap.MOTOR_RIGHT_FRONT);
    rightFrontMotor.setInverted(false);
    rightBackMotor = new Talon(RobotMap.MOTOR_RIGHT_BACK);
    rightBackMotor.setInverted(false);

    SpeedControllerGroup leftMotors = new SpeedControllerGroup(leftFrontMotor, leftBackMotor);
    SpeedControllerGroup rightMotors = new SpeedControllerGroup(rightFrontMotor, rightBackMotor);

    diff = new DifferentialDrive(leftMotors, rightMotors);

  }
}
