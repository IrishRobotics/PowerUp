package org.usfirst.frc.team2606.robot.subsystems;

import org.usfirst.frc.team2606.robot.RobotMap;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Lift extends Subsystem {
	SpeedController liftMoter = RobotMap.LIFT_MOTOR;

	public Lift() {
		super();
	}

	public void initDefaultCommand() {
		hold();
	}

	public void ascend() {
		liftMoter.set(1);
	}

	public void descend() {
		liftMotor.set(-1);
	}
	
	public void hold(){
		liftMotor.set(0);
	}

}
