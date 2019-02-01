/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.cameraserver.CameraServer;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
//import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.subsystems.Lift;
import frc.robot.subsystems.Drivetrain;
import frc.robot.commands.ArcadeDrive;

public class Robot extends TimedRobot {
<<<<<<< HEAD
  //Subsystems
  public static Drivetrain m_drivetrain = new Drivetrain();
  public static Lift m_lift;
  //OI
  public static OI m_oi;
  //Commands
  public static ArcadeDrive m_arcadeDrive;
=======
  public static OI m_oi = new OI();
>>>>>>> 4572bd93b244909665777bff0953a68b40451dfb

  
  Command m_autonomousCommand;
  SendableChooser<Command> m_chooser = new SendableChooser<>();

  //This function is run when the robot starts up
  @Override
  public void robotInit() {
<<<<<<< HEAD
    m_drivetrain = new Drivetrain();
    m_lift = new Lift();
    m_oi = new OI();
    m_arcadeDrive = new ArcadeDrive();
=======
<<<<<<< HEAD
   


=======
    m_oi = new OI();
>>>>>>> 08a1ec76eeab3d34d6146a05c7b7f2f409352963
>>>>>>> 4572bd93b244909665777bff0953a68b40451dfb
    //m_chooser.setDefaultOption("Default Auto", new ExampleCommand());
    // chooser.addOption("My Auto", new MyAutoCommand());
    //SmartDashboard.putData("Auto mode", m_chooser);
   
    SmartDashboard.putData("Auto mode", m_chooser);
    CameraServer.getInstance().startAutomaticCapture(); //Setup camera
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
    //m_autonomousCommand = m_chooser.getSelected();

    /*
     * String autoSelected = SmartDashboard.getString("Auto Selector",
     * "Default"); switch(autoSelected) { case "My Auto": autonomousCommand
     * = new MyAutoCommand(); break; case "Default Auto": default:
     * autonomousCommand = new ExampleCommand(); break; }
     */

    // schedule the autonomous command (example)
    /*if (m_autonomousCommand != null) {
      m_autonomousCommand.start();
    } */
  }

  //This function is called periodically during autonomous.
  @Override
  public void autonomousPeriodic() {
    Scheduler.getInstance().run();
  }

  @Override
  public void teleopInit() {
    // This makes sure that the autonomous stops running when
    // teleop starts running. If you want the autonomous to
    // continue until interrupted by another command, remove
    // this line or comment it out.
    /*if (m_autonomousCommand != null) {
      m_autonomousCommand.cancel();
    } */
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
