/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.RobotMap;

public class TankDrive extends Command {
  public TankDrive() {
    requires(Robot.m_drivetrain); //Require the drivestrain system
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    //Get the two joystick axis
    double leftSpeed = Robot.m_oi.leftJoystick.getY();
    double rightSpeed = Robot.m_oi.rightJoystick.getY();
    //Get the throttle from the left joystick
    double scaler = Robot.m_oi.leftJoystick.getThrottle();
    //Trun the scaler into something we can use
    scaler = ((scaler * -1 + 1) / 2) * RobotMap.SCALER_DRIVE; 
    //Send values to drivetrain for tankdrive
    Robot.m_drivetrain.tankDrive(leftSpeed * scaler * -1, rightSpeed * scaler * -1);
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    end();
  }
}
