/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team2606.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	    public static SpeedController driveTrain_SubsystemFrontLeft;
	    public static SpeedController driveTrain_SubsystemRearLeft;
	    public static SpeedControllerGroup driveTrain_SubsystemLeftDrive;
	    public static SpeedController driveTrain_SubsystemFrontRight;
	    public static SpeedController driveTrain_SubsystemRearRight;
	    public static SpeedControllerGroup driveTrain_SubsystemRightDrive;
	    public static DifferentialDrive driveTrain_SubsystemDifferentialDrive1;
	    public static SpeedController wheelIntake_SubsystemLeftWheel;
	    public static SpeedController wheelIntake_SubsystemRightWheel;
	    public static SpeedController lifter_SubsystemSpeedController1;

	public static void init () {
		
    driveTrain_SubsystemFrontLeft = new Talon(0);
    driveTrain_SubsystemFrontLeft.setInverted(false);
    driveTrain_SubsystemRearLeft = new Talon(1);
    driveTrain_SubsystemRearLeft.setInverted(false);
    driveTrain_SubsystemLeftDrive = new SpeedControllerGroup(driveTrain_SubsystemFrontLeft, driveTrain_SubsystemRearLeft  );
    
    driveTrain_SubsystemFrontRight = new Talon(2);
    driveTrain_SubsystemFrontRight.setInverted(false);
    driveTrain_SubsystemRearRight = new Talon(3);
    driveTrain_SubsystemRearRight.setInverted(false);
    driveTrain_SubsystemRightDrive = new SpeedControllerGroup(driveTrain_SubsystemFrontRight, driveTrain_SubsystemRearRight  );
    
    driveTrain_SubsystemDifferentialDrive1 = new DifferentialDrive(driveTrain_SubsystemLeftDrive, driveTrain_SubsystemRightDrive);
    driveTrain_SubsystemDifferentialDrive1.setSafetyEnabled(true);
    driveTrain_SubsystemDifferentialDrive1.setExpiration(0.1);
    driveTrain_SubsystemDifferentialDrive1.setMaxOutput(1.0);
    
    wheelIntake_SubsystemLeftWheel = new Spark(4);
    wheelIntake_SubsystemLeftWheel.setInverted(false);
    wheelIntake_SubsystemRightWheel = new Spark(5);
    wheelIntake_SubsystemRightWheel.setInverted(true);
	}
}
