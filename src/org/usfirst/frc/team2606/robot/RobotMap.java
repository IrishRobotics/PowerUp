/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team2606.robot;


import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.interfaces.Gyro;
import org.usfirst.frc.team2606.robot.sensor.driver.ADIS16448_IMU;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    private static SpeedController FRONT_LEFT_MOTOR = new Talon(1);
    private static SpeedController BACK_LEFT_MOTOR = new Talon(0);
    private static SpeedController FRONT_RIGHT_MOTOR = new Spark(3);
    private static SpeedController BACK_RIGHT_MOTOR = new Talon(2);
    private static SpeedController LEFT_INTAKE_MOTOR = new Talon(4);
    private static SpeedController RIGHT_INTAKE_MOTOR = new Talon(5);
    public static SpeedControllerGroup LEFT_TANK_DRIVE = new SpeedControllerGroup(FRONT_LEFT_MOTOR, BACK_LEFT_MOTOR);
    public static SpeedControllerGroup RIGHT_TANK_DRIVE = new SpeedControllerGroup(FRONT_RIGHT_MOTOR, BACK_RIGHT_MOTOR);
	

    public static Joystick XBOX_CONTROLLER = new Joystick(0);

    public static AnalogGyro DRIVE_GYRO = new AnalogGyro(0);
    public static ADIS16448_IMU SUPER_GYRO = new ADIS16448_IMU();

    public static DigitalInput LIMIT_SWITCH = new DigitalInput(9);


    // TODO later for encoders
    //public static Encoder LEFT_DRIVE = new Encoder(2,3,false,CounterBase.EncodingType.k4X);
    //public static Encoder RIGHT_DRIVE = new Encoder(4,5,false,CounterBase.EncodingType.k4X);

    // For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
}
