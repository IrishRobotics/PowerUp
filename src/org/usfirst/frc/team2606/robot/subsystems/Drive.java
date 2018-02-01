/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

//TODO Impliment Calvins drive style in here or another command with pre existing variables
package org.usfirst.frc.team2606.robot.subsystems;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import org.usfirst.frc.team2606.robot.RobotMap;
import org.usfirst.frc.team2606.robot.commands.teleop.TankDrive;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class Drive extends Subsystem {

    private SpeedController frontLeft, backLeft, frontRight, backRight;
    private SpeedControllerGroup left, right;
    private DifferentialDrive drive;
    private AnalogGyro gyro;
    private double gyroDesiredHeading;
    //private Encoder leftEncoder = RobotMap.LEFT_TANK;
    //private Encoder rightEncoder = RobotMap.RIGHT_DRIVE;

    public Drive() {
        super();
        frontLeft = new VictorSP(RobotMap.FRONT_LEFT_MOTOR);
        backLeft = new VictorSP(RobotMap.BACK_LEFT_MOTOR);
        frontRight = new VictorSP(RobotMap.FRONT_RIGHT_MOTOR);
        backRight = new VictorSP(RobotMap.BACK_RIGHT_MOTOR);
        left = new SpeedControllerGroup(frontLeft, backLeft);
        right = new SpeedControllerGroup(frontRight, frontLeft);
        drive = new DifferentialDrive(left, right);
        gyro = new AnalogGyro(RobotMap.DRIVE_GYRO);
        //leftEncoder.setDistancePerPulse((0.5 * Math.PI) / 360.0);
        //rightEncoder.setDistancePerPulse((0.5 * Math.PI) / 360.0);
    }

    /**
     * When no other command is running let the operator drive around using the
     * PS3 joystick.
     */
    public void initDefaultCommand() {
        setDefaultCommand(new TankDrive());
    }

    /**
     * The log method puts interesting information to the SmartDashboard.
     */
    public void log() {
        //SmartDashboard.putNumber("Left Distance", -leftEncoder.getDistance());
        //SmartDashboard.putNumber("Right Distance", rightEncoder.getDistance());
        //SmartDashboard.putNumber("Left Speed", -leftEncoder.getRate());
        //SmartDashboard.putNumber("Right Speed", rightEncoder.getRate());
        SmartDashboard.putNumber("Gyro", gyro.getAngle());
    }

    /**
     * Tank style driving for the DriveTrain.
     *
     * @param left  Speed in range [-1,1]
     * @param right Speed in range [-1,1]
     */
    public void move(double left, double right) {
        drive.tankDrive(left, right);
    }

    public void move(Joystick joystick, int numJoystick) {
        move(joystick.getY() * .25, joystick.getY() * .25);
    }

    /**
     * Start Code for Calvin's Drive
     */
    public void calvin() {

    }

    /**
     * Reset the robots sensors to the zero states.
     */
    public void reset() {
        //leftEncoder.reset();
        //rightEncoder.reset();
        gyro.reset();
    }

    public void setGyroDesiredHeading() {
        gyroDesiredHeading = gyro.getAngle();
    }

    public double getGyroRealHeading() {
        return gyro.getAngle();
    }

    public double GyroAngleError() {
        return gyro.getAngle() - gyroDesiredHeading;
    }

    //public double getDistanceInFeet() {
    //    return (-leftEncoder.getDistance() + rightEncoder.getDistance()) / 2.0;
    //}

    //public double getDistanceInInches() {
    //    return (-leftEncoder.getDistance() + rightEncoder.getDistance()) * 6.0;
    //}
}
