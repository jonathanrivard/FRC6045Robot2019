/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;


import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.RobotMap;
import frc.robot.commands.*;
import frc.robot.subsystems.*;

public class GrabToPosition extends Command {
   long ticks;
  public GrabToPosition(int position) {
    requires(Robot.m_claw);
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    switch(position){
      case 1: ticks = RobotMap.CLAW_OPEN_POSITION;
      break;
      case 2: ticks = RobotMap.CLAW_CLOSED_POSITION;
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
    int threshold = 1000;
    double clawSpeed = 0.1;
    long current = Robot.m_claw.getClawMotor().getSelectedSensorPosition();
    long error = ticks - current;

    if(error > threshold){
      Robot.m_lift.setPercentage(clawSpeed);
    }else if (error < -1 * threshold){
      Robot.m_lift.setPercentage(clawSpeed);
    }else {
      Robot.m_lift.setPercentage(0);
    }
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
