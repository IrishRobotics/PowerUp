package org.usfirst.frc.team2606.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import org.usfirst.frc.team2606.robot.Robot;
import org.usfirst.frc.team2606.robot.RobotMap;
import org.usfirst.frc.team2606.robot.commands.CalvinDrive;

import static org.usfirst.frc.team2606.robot.RobotMap.zRotation;

public class Drive2 extends Subsystem {
    private DifferentialDrive MainDrive = new DifferentialDrive(RobotMap.LEFT_TANK_DRIVE, RobotMap.RIGHT_TANK_DRIVE);

    // Put methods for controlling this subsystem
    // here. Call these from Commands.


    public void initDefaultCommand() {
        setDefaultCommand(new CalvinDrive());
    }

    public void Go(double xSpeed , double zRotation){
        MainDrive.arcadeDrive(RobotMap.xSpeed, RobotMap.zRotation);


    }

    public void Stop(){
        MainDrive.arcadeDrive(0,0);

    }
}

