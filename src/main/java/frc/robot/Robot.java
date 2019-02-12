/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.cameraserver.CameraServer;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import frc.robot.subsystems.*;

public class Robot extends TimedRobot {
  //Subsystems
  public static Drivetrain m_drivetrain;
  public static Lift m_lift;
  public static ClawBelt m_clawBelt;
  public static ClawGrabber m_clawGrabber;
  public static ClawTilter m_clawTilter;
  //OI
  public static OI m_oi;

  //This function is run when the robot starts up
  @Override
  public void robotInit() {
    m_drivetrain = new Drivetrain();
    m_lift = new Lift();
    m_clawGrabber = new ClawGrabber();
    m_clawBelt = new ClawBelt();
    m_clawTilter = new ClawTilter();
    m_oi = new OI();
    CameraServer.getInstance().startAutomaticCapture();
  }

  //This function is called every robot packet, no matter the mode
  //Use this for stuff like diagnostics 
  @Override
  public void robotPeriodic() {
  }

  //This function is called each time the robot enter Disabled mode
  @Override
  public void disabledInit() {
  }

  @Override
  public void disabledPeriodic() {
    Scheduler.getInstance().run();
  }

  /**
   * This autonomous (along with the chooser code above) shows how to select
   * between different autonomous modes using the dashboard. The sendable
   * chooser code works with the Java SmartDashboard. If you prefer the
   * LabVIEW Dashboard, remove all of the chooser code and uncomment the
   * getString code to get the auto name from the text box below the Gyro
   *
   * <p>You can add additional auto modes by adding additional commands to the
   * chooser code above (like the commented example) or additional comparisons
   * to the switch structure below with additional strings & commands.
   */
  @Override
  public void autonomousInit() {
  }

  //This function is called periodically during autonomous.
  @Override
  public void autonomousPeriodic() {
    Scheduler.getInstance().run();
  }

  @Override
  public void teleopInit() {
  }

  //This function is called periodically during operator control.
  @Override
  public void teleopPeriodic() {
    Scheduler.getInstance().run();
  }
  
  //This function is called periodically during test mode.
  @Override
  public void testPeriodic() {
  }
}
