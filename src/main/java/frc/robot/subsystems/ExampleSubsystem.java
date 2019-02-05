/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.TestCommand;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

/**
 * Add your docs here.
 */
public class ExampleSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  TalonSRX testMotor = null;
	Encoder enc;
	
	public Encoder getEnc() { return enc; }
	public TalonSRX getMotor() { return testMotor; }
  
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
  
  public ExampleSubsystem(){
		//Create motor
		testMotor = new TalonSRX(RobotMap.TEST_MOTOR);
    testMotor.setInverted(false);
		
		//Create encoder
		enc = new Encoder(0,1,false, Encoder.EncodingType.k4X);
		enc.setPIDSourceType(PIDSourceType.kRate);
    enc.setMaxPeriod(.1);
		enc.setMinRate(10);
		enc.setDistancePerPulse(5);
		enc.setReverseDirection(true);
		enc.setSamplesToAverage(7);

	

	}
	public void setRate(){
			
	}
  
/*
package frc.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotMap;
import frc.robot.commands.DriveArcade;

public class Drivetrain extends Subsystem {
	// Put methods for controlling this subsystem
	// here. Call these from Commands.

	Talon leftFrontTalon = null;
	Talon leftBackTalon = null;
	Talon rightFrontTalon = null;
	Talon rightBackTalon = null;

	DifferentialDrive differentialDrive = null;

	public Drivetrain() {
		leftFrontTalon = new Talon(RobotMap.DRIVETRAIN_LEFT_FRONT_TALON);
		leftBackTalon = new Talon(RobotMap.DRIVETRAIN_LEFT_BACK_TALON);
		rightFrontTalon = new Talon(RobotMap.DRIVETRAIN_RIGHT_FRONT_TALON);
		rightBackTalon = new Talon(RobotMap.DRIVETRAIN_RIGHT_BACK_TALON);

		SpeedControllerGroup leftMotors = new SpeedControllerGroup(leftFrontTalon, leftBackTalon);
		SpeedControllerGroup rightMotors = new SpeedControllerGroup(rightFrontTalon, rightBackTalon);

		differentialDrive = new DifferentialDrive(leftMotors, rightMotors);
	}

	public void arcadeDrive(double moveSpeed, double rotateSpeed) {
		differentialDrive.arcadeDrive(moveSpeed, rotateSpeed);
	}

	@Override
	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
    setDefaultCommand(new DriveArcade());
*/
}

