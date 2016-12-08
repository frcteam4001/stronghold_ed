package org.usfirst.frc.team4001.robot.subsystems;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import org.usfirst.frc.team4001.robot.RobotMap;
/**
 *
 */
public class Intake extends Subsystem {
	
	//Define components
	private CANTalon intake_motor;
	private DigitalInput intake_switch;
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	public Intake(){
		//Initialize components
		intake_motor = new CANTalon(RobotMap.intake_motor_port);
		intake_switch = new DigitalInput(RobotMap.intake_switch);
		LiveWindow.addActuator("Intake", "intake_motor", intake_motor);
	}
	
	public void receive(){
		intake_motor.set(0.3);
	}
	
	
	public void stop(){
		intake_motor.set(0);
	}
	
	public boolean isBallSet(){
		return !intake_switch.get();
	}
	
	

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

