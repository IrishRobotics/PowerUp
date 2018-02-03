/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team2606.robot;

import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.interfaces.Gyro;
import edu.wpi.first.wpilibj.networktables.NetworkTable;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc.team2606.robot.subsystems.Drive;
import org.usfirst.frc.team2606.robot.commands.autonomous.*;
import org.usfirst.frc.team2606.robot.commands.teleop.*;


/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.properties file in the
 * project.
 */
public class Robot extends TimedRobot {

	private String[] autoSelector;
	private String[] teleSelector;
	private Command autonomousCommand;
	private Command teleCommand;

	public UsbCamera frontCamera, backCamera;
	public static NetworkTable table;
	public static OI oi;
	public static Drive drive;
	public static double scale;
	public static double orientation;

	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	@Override
	public void robotInit() {
		oi = new OI();
		drive = new Drive();
		table = NetworkTable.getTable("Dashboard");
		frontCamera = CameraServer.getInstance().startAutomaticCapture("Forward Camera", RobotMap.FRONT_CAMERA);
		backCamera = CameraServer.getInstance().startAutomaticCapture("Backward Camera", RobotMap.BACK_CAMERA);
		autoSelector = new String[RobotMap.AUTO_MODES-1];
		teleSelector = new String[RobotMap.TELE_MODES-1];

		//autoChooser.addObject("Break the Plane", new BreakPlane());
		table.putStringArray("autonomousModes", autoSelector);
		table.putStringArray("teleModes", teleSelector);

		// Initialize global constants
		scale = 0.7;
		orientation = 1.0;
	}

	/**
	 * This function is called once each time the robot enters Disabled mode.
	 * You can use it to reset any subsystem information you want to clear when
	 * the robot is disabled.
	 */
	@Override
	public void disabledInit() {
	}

	@Override
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

	/**
	 * This autonomous (along with the chooser code above) shows how to select
	 * between different autonomous modes using the dashboard. The sendable
	 * chooser code works with the Java SmartDashboard. If you prefer the
	 * LabVIEW Dashboard, remove all of the chooser code and uncomment the
	 * getString code to get the auto name from the text box below the Gyro
	 *
	 * <p>You can add additional auto modes by adding additional commands to the
	 * chooser code above (like the commented example) or additional comparisons
	 * to the switch structure below with additional strings & commands.
	 */
	@Override
	public void autonomousInit() {
		String autoSelected = table.getString("autonomousSelected", "Default");
		switch (autoSelected) {
			case "Place Cube on Switch":
				autonomousCommand = new SwitchPlace();
				break;
			case "Default":
			default:
				autonomousCommand = new BreakPlane();
				break;
		}

		// schedule the autonomous command (example)
		if (autonomousCommand != null) {
			autonomousCommand.start();
		}
	}

	/**
	 * This function is called periodically during autonomous.
	 */

	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
	}

	@Override
	public void teleopInit() {

		String teleSelected = table.getString("teleSelected", "Default");
		switch (teleSelected) {
			case "Calvin Drive":
				autonomousCommand = new SwitchPlace();
				break;
			case "Tank Drive":
			default:
				autonomousCommand = new BreakPlane();
				break;
		}

		if (autonomousCommand != null) {
			autonomousCommand.cancel();
		}

		if (teleCommand != null) {
			teleCommand.start();
		}
		drive.reset();
	}

	/**
	 * This function is called periodically during operator control.
	 */
	@Override
	public void teleopPeriodic() {
		Scheduler.getInstance().run();
		drive.log();
		updateDashboard();
	}

	/**
	 * This function is called periodically during test mode.
	 */
	@Override
	public void testPeriodic() {
	}

	//Updates the FRCDashboard
	private void updateDashboard() {
		table.putNumber("time", Timer.getMatchTime());
		drive.updateDashboard();

	}

	public void log() {
		drive.log();
	}

	public void reset(){
		drive.reset();
	}
}
