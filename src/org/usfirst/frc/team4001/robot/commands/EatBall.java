package org.usfirst.frc.team4001.robot.commands;

import org.usfirst.frc.team4001.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class EatBall extends Command {

    public EatBall() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.intake);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	//Turn the intake motor
    	Robot.intake.receive();
    	
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	//Check to see if thhe ball is in the firing chamber
        return Robot.intake.isBallSet();
    }

    // Called once after isFinished returns true
    protected void end() {
    	//Stop the intake motor to end the command
    	Robot.intake.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
