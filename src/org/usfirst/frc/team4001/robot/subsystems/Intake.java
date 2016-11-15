package org.usfirst.frc.team4001.robot.subsystems;

import org.usfirst.frc.team4001.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.CANTalon;

/**
 *
 */
public class Intake extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	private final CANTalon motor = RobotMap.intake_motor;
	

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void reel_in()
    {
    	motor.set(0.3);
    }
    
    public void stop()
    {
    	motor.set(0);
    }
    
}

