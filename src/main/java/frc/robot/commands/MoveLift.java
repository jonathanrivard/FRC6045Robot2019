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

public class MoveLift extends Command { //Moves the lift to the desired position over time

  long ticks; //Goal ticks for encoder

  public MoveLift(int position) {
    requires(Robot.m_lift); //Require the lift subsystem from Robot

    //Turn position into it's tick value stored in RobotMap
    switch (position){
      case 1:
        ticks = RobotMap.POS_ONE;
        break;
      case 2:
        ticks = RobotMap.POS_TWO;
        break;
      case 3:
        ticks = RobotMap.POS_THREE;
        break;
      case 4:
        ticks = RobotMap.POS_FOUR;
        break;
      case 5:
        ticks = RobotMap.POS_FIVE;
        break;
      case 6:
        ticks = RobotMap.POS_SIX;
        break;
      case 7:
        ticks = RobotMap.POS_SEVEN;
        break;
      case 8:
        ticks = RobotMap.POS_EIGHT;
        break;
      default:
        ticks = RobotMap.POS_EIGHT;
        break;
    }
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    int threshold = 600;
    long current = Robot.m_lift.getLiftMotor().getSelectedSensorPosition(); //Get current position
    long error = ticks - current; //Find the error of the current position and our desired position

    //Debugging Print Statement
    //System.out.println(error + " ; " + current);
    /*
    //Use limit switches for safety
    if(Robot.m_lift.getTopLimit() && error > 0){
      ticks = current;
    }else if(Robot.m_lift.getBottomLimit() && error < 0){
      ticks = current;
    }*/

    //Go to the desired position, within the threshold to prevent osolation 
    if(error > threshold){
      Robot.m_lift.setPercentage(RobotMap.SCALER_LIFT_AUTO * Robot.m_oi.getRightThrottleScaler());
    }else if (error < -1 * threshold){
      Robot.m_lift.setPercentage(-1 * (RobotMap.SCALER_LIFT_AUTO * Robot.m_oi.getRightThrottleScaler()));
    }else {
      Robot.m_lift.setPercentage(0);
    }
    System.out.println(current);

  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    Robot.m_lift.setPercentage(0); //Set lift power to 0
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    end();
  }
}