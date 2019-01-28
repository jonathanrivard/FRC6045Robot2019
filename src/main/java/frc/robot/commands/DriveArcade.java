/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;


public class DriveArcade extends Command {
  public DriveArcade(){
    requires(Robot.m_drivetrain);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    double throttleValue = Robot.m_oi.joystick.getThrottle();
    throttleValue = (throttleValue * -1 + 1) / 2; //Scale value (original is from -1 to 1, up is -1)
    double moveSpeed = Robot.m_oi.joystick.getY() * throttleValue;
    double rotateSpeed = Robot.m_oi.joystick.getX() * throttleValue;
  

    // change to driveArcade()
    Robot.m_drivetrain.arcadeDrive(moveSpeed * - 0.5, rotateSpeed * 0.5);
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {

    // change to driveArcade()
    Robot.m_drivetrain.arcadeDrive(0, 0);
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    end();
  }
}
