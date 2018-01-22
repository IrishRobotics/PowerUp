package org.usfirst.frc.team2606.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team2606.robot.Robot;
import org.usfirst.frc.team2606.robot.RobotMap;


public class CalvinDrive extends Command {
    public CalvinDrive() {
        requires(Robot.CalvinsDrive);
    }

    @Override
    protected void initialize() {

    }

    @Override
    protected void execute() {
        Robot.CalvinsDrive.Go(RobotMap.xSpeed, RobotMap.zRotation);

    }

    @Override
    protected boolean isFinished() {
        // TODO: Make this return true when this Command no longer needs to run execute()
        return false;
    }

    @Override
    protected void end() {
        Robot.CalvinsDrive.Stop();
    }

    @Override
    protected void interrupted() {
        end();
    }

}
