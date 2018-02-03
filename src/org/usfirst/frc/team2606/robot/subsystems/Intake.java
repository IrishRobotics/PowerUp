/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team2606.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team2606.robot.RobotMap;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class Intake extends Subsystem {

	private SpeedController left, right;
	// Put methods for controlling this subsystem
	// here. Call these from Commands.

	public Intake() {
		super();
		left = new Spark(RobotMap.LEFT_INTAKE_MOTOR);
		right = new Spark(RobotMap.RIGHT_INTAKE_MOTOR);
	}

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}
}