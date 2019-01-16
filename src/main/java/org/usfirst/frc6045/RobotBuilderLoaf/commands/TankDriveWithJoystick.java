package org.usfirst.frc6045.RobotBuilderLoaf.commands;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

import org.usfirst.frc6045.RobotBuilderLoaf.Robot;
import org.usfirst.frc6045.RobotBuilderLoaf.subsystems.Drivetrain;

public class TankDriveWithJoystick extends Command {
    DifferentialDrive drive;

    public TankDriveWithJoystick(){
        
    }

    //Init 
    @Override
    protected void initialize() {
    }

    //Repeatedly called after start
    @Override
    protected void execute() {

    }

    //Make this return true when this Command no longer needs to run execute()
    @Override
    protected boolean isFinished() {
        return false;
    }

    //Called once after isFinished returns true
    @Override
    protected void end() {
    }

    //Called when another command needs this subsystem
    @Override
    protected void interrupted() {
    }
}