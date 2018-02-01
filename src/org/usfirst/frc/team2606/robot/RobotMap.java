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
    public static int FRONT_LEFT_MOTOR = 0;
    public static int BACK_LEFT_MOTOR = 1;
    public static int FRONT_RIGHT_MOTOR = 2;
    public static int BACK_RIGHT_MOTOR = 3;

    public static int XBOX_CONTROLLER = 0;

    public static int XBOX_A = 1;
    public static int XBOX_B = 2;
    public static int XBOX_X = 3;
    public static int XBOX_Y = 4;
    public static int LEFT_BUMPER = 5;
    public static int RIGHT_BUMPER = 6;
    public static int SELECT = 7;
    public static int START = 8;
    public static int PRESS_LEFT_ANALOG = 9;
    public static int PRESS_RIGHT_ANALOG = 10;

    public static int LEFT_ANALOG_X_AXIS = 0;
    public static int RIGHT_ANALOG_X_AXIS = 4;
    public static int LEFT_TRIGGER_X_AXIS = 2;
    public static int RIGHT_TRIGGER_X_AXIS = 3;

    public static int LEFT_ANALOG_Y_AXIS = 1;
    public static int RIGHT_ANALOG_Y_AXIS = 5;
    public static int LEFT_TRIGGER_Y_AXIS = 2;
    public static int RIGHT_TRIGGER_Y_AXIS = 3;

    public static int DRIVE_GYRO = 0;
    public static int LIMIT_SWITCH = 9;

    // TODO later for encoders
    //public static Encoder LEFT_DRIVE = new Encoder(2,3,false,CounterBase.EncodingType.k4X);
    //public static Encoder RIGHT_DRIVE = new Encoder(4,5,false,CounterBase.EncodingType.k4X);
}
