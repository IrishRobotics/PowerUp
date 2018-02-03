package org.usfirst.frc.team2606.robot.subsystems;

import org.usfirst.frc.team2606.robot.RobotMap;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Intake extends Subsystem {
	SpeedController leftIntakeMotor = RobotMap.LEFT_INTAKE_MOTOR;
	SpeedController rightIntakeMotor = RobotMap.RIGHT_INTAKE_MOTOR;

	public Intake() {
		super();
	}

	public void initDefaultCommand() {
		hold();
	}

	public void collect() {
		leftIntakeMotor.set(-1);
		rightIntakeMotor.set(1);
	}

	public void release() {
		leftIntakeMotor.set(1);
		rightIntakeMotor.set(-1);
	}
	
	public void hold(){
		leftIntakeMotor.set(0);
		rightIntakeMotor.set(0);
	}

}
