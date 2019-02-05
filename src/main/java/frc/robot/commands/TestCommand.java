/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.RobotMap;
import frc.robot.subsystems.*;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class TestCommand extends Command {

  Encoder enc;
  TalonSRX motor;
  double speed;

  public TestCommand(double speed){
    requires(Robot.m_subsystem);
    System.out.println("TestCommand Made");
    
    this.speed = speed;
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    System.out.println("TestCommand Init");
    enc = Robot.m_subsystem.getEnc();
    motor = Robot.m_subsystem.getMotor();
  }

   

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    motor.set(ControlMode.PercentOutput, 1);
    
    System.out.println(motor.getSelectedSensorVelocity());
    //System.out.println(motor.getSensorCollection());
    System.out.println();

    /*
    int count = enc.get();
    double rate = enc.getRate();
    boolean direction = enc.getDirection();
    boolean stopped = enc.getStopped();
    System.out.println(count + " count" );
    System.out.println(rate + " rate");
    System.out.println(direction + " diretion");
    System.out.println(stopped + " stopped"); 
    */
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;

  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    motor.set(ControlMode.PercentOutput, 0.0);
    System.out.println("TestCommand Ended");
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    end();
  }
}
