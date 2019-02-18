/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import frc.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class ArcadeDrive extends Command {

  public ArcadeDrive() {
    requires(Robot.m_drivetrain); //Require the drivetrain
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    //Get each axis
    double xSpeed = Robot.m_oi.controlJoystick.getY(); //Forward axis
    double zRotate = Robot.m_oi.controlJoystick.getX(); //Side to side for rotation axis
    //Get the throttle value
    double scaler = Robot.m_oi.getControlThrottleScaler();
    Robot.m_drivetrain.arcadeDrive(xSpeed * -1 * scaler, zRotate * scaler); //Use arcade drive
   
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
  }
}
