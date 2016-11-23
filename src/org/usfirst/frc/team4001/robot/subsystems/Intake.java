package org.usfirst.frc.team4001.robot.subsystems;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

import org.usfirst.frc.team4001.robot.RobotMap;


/**
 *
 */
public class Intake extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	public static final CANTalon intake_motor = new CANTalon(RobotMap.intake_motor_CANport);
	
	public Intake(){
		LiveWindow.addActuator("Intake", "intake_motor", intake_motor);
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void recieve(){
    	intake_motor.set(0.3);
    }
}

