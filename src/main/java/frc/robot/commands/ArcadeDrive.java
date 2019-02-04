/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import frc.robot.OI;
import frc.robot.Robot;
import frc.robot.subsystems.Drivetrain;

import edu.wpi.first.wpilibj.command.Command;

public class ArcadeDrive extends Command {

  public ArcadeDrive() {
    requires(Robot.m_drivetrain);
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    double xSpeed = Robot.m_oi.controlJoystick.getY();
    double zRotate = Robot.m_oi.controlJoystick.getX();
    double scaler = Robot.m_oi.controlJoystick.getThrottle();
    scaler = (scaler * -1 + 1) / 2;
    Robot.m_drivetrain.arcadeDrive(xSpeed * -1 * scaler, zRotate * scaler);
   
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
