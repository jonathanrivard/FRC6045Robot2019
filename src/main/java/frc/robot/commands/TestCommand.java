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

public class TestCommand extends Command {

    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    Talon testMotor = null;
    Encoder enc;
  

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }
  public TestCommand(){
    testMotor = new Talon(RobotMap.TEST_MOTOR);
    testMotor.setInverted(false);
    enc = new Encoder(0,1,false, Encoder.EncodingType.k4X);
    enc.setMaxPeriod(.1);
enc.setMinRate(10);
enc.setDistancePerPulse(5);
enc.setReverseDirection(true);
enc.setSamplesToAverage(7);
  }
  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
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
