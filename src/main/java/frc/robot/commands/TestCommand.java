/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.RobotMap;
import  frc.robot.subsystems.*;

public class TestCommand extends Command {

    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    
  

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }
  public TestCommand(){
   

  }
  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
System.out.println(count + "count" );
System.out.println(rate + "rate");
System.out.println(direction + "diretion");
System.out.println(stopped + "stopped");
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    end();
    return false;

  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    testMotor.set(0);

  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
