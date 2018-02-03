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
import org.usfirst.frc.team2606.robot.Robot;
import org.usfirst.frc.team2606.robot.RobotMap;
import org.usfirst.frc.team2606.robot.commands.teleop.TankDrive;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc.team2606.robot.sensor.driver.ADIS16448_IMU;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class Drive extends Subsystem {

    private SpeedController frontLeft, backLeft, frontRight, backRight;
    private SpeedControllerGroup left, right;
    private DifferentialDrive drive;
    private ADIS16448_IMU gyro;
    private double gyroDesiredHeading;
    private Ultrasonic ultrasonic;
    //private Encoder leftEncoder;
    //private Encoder rightEncoder;

    public Drive() {
        super();
        frontLeft = new VictorSP(RobotMap.FRONT_LEFT_MOTOR);
        backLeft = new VictorSP(RobotMap.BACK_LEFT_MOTOR);
        frontRight = new VictorSP(RobotMap.FRONT_RIGHT_MOTOR);
        backRight = new VictorSP(RobotMap.BACK_RIGHT_MOTOR);
        left = new SpeedControllerGroup(frontLeft, backLeft);
        right = new SpeedControllerGroup(frontRight, backRight);
        drive = new DifferentialDrive(left, right);
        gyro = new ADIS16448_IMU();
        ultrasonic = new Ultrasonic(RobotMap.ULTRASONIC_OUTPUT, RobotMap.ULTRASONIC_INPUT);
        //leftEncoder = RobotMap.LEFT_ENCODER;
        //rightEncoder = RobotMap.RIGHT_ENCODER;
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
        double angle=gyro.getAngle();
        double angleSuper=gyro.getAngle();
        double range=ultrasonic.getRangeInches();
        SmartDashboard.putNumber("gyro angle:",angle);
        SmartDashboard.putNumber("angleSuper",angleSuper);
        SmartDashboard.putNumber("Angle X", gyro.getAngleX());
        SmartDashboard.putNumber("Angle Y", gyro.getAngleY());
        SmartDashboard.putNumber("Angle Z", gyro.getAngleZ());
        SmartDashboard.putNumber("range?",range);
    }

    public void updateDashboard(){
        Robot.table.putNumber("yaw", gyro.getAngleZ());
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

    /**
     * Reset the robots sensors to the zero states.
     */
    public void reset() {
        //leftEncoder.reset();
        //rightEncoder.reset();
        gyro.reset();
    }

    public double getGyroAngle() {
        return gyro.getAngle();
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
