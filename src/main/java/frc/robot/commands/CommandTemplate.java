import edu.wpi.first.wpilibj.command.Command; //Get the command class

import frc.robot.Robot; //Get our main Robot class
import frc.robot.RobotMap; //Get our RobotMappings

public class CommandTemplate extends Command{
    public CommandTemplate(){ //Constuctor 
        //requires(Robot.subsubsystemVariableInRobot); 
    }

    protected void initialize() { //Called when command is initialized
		
	}

	protected void execute() { //Called periodicly by scheduler(every 20ms)

	}
	
	protected void interrupted() { //Called when the subsystem being used is needed by another command
		end();
	}
	
	protected void end() { 
		
	}
	
	protected boolean isFinished() {
		return false;
	}
}