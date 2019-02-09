/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class MoveLift extends Command {

  int position;

  public MoveLift(int position) {
    requires(Robot.m_Lift);
    this.position = position;
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    System.out.println("Setting to position: " + position);
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    int current = Robot.m_Lift.getLiftMotor().getSelectedSensorPosition();
    int error = position - current;

    if(error > 4096){
      Robot.m_Lift.setPercentage(0.2);
    }else if (error > 4096){
      Robot.m_Lift.setPercentage(-0.2);
    }else {
      Robot.m_Lift.setPercentage(0);
    }




    //Robot.m_Lift.setPosition(position);
    System.out.println(Robot.m_Lift.getLiftMotor().getSelectedSensorPosition());
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    Robot.m_Lift.setPercentage(0);
    System.out.println("Ended " + position);
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    end();
  }
}
