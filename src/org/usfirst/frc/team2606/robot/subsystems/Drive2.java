package org.usfirst.frc.team2606.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import org.usfirst.frc.team2606.robot.RobotMap;
import org.usfirst.frc.team2606.robot.Robot;

public class Drive2 extends Subsystem {
    private DifferentialDrive MainDrive = new DifferentialDrive(RobotMap.LEFT_TANK_DRIVE, RobotMap.RIGHT_TANK_DRIVE);

    // Put methods for controlling this subsystem
    // here. Call these from Commands.


    public void initDefaultCommand() {
        // TODO: Set the default command, if any, for a subsystem here. Example:
        //    setDefaultCommand(new MySpecialCommand());
    }

    public void Go(){
        double xSpeed = (RobotMap.R_TRIGGER - RobotMap.L_TRIGGER) * Robot.scale * Robot.orientation;
		double zRotation = RobotMap.L_STICK  * Robot.scale * Robot.orientation;

        MainDrive.arcadeDrive(xSpeed, zRotation);


    }

    public void Stop(){

    }
}

