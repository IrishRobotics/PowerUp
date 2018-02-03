/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team2606.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.SpeedController;
import org.usfirst.frc.team2606.robot.Robot;
import org.usfirst.frc.team2606.robot.RobotMap;

/**
 *
 */
public class Intake extends Subsystem {
	SpeedController leftIntakeMotor;
	SpeedController rightIntakeMotor;

	public Intake() {
		super();
		leftIntakeMotor = new Spark(RobotMap.LEFT_INTAKE_MOTOR);
		rightIntakeMotor = new Spark(RobotMap.RIGHT_INTAKE_MOTOR);
	}

	public void initDefaultCommand() {
	}

	public void setIntakeMotors(double left, double right) {
		leftIntakeMotor.set(left);
		rightIntakeMotor.set(right);
	}
}