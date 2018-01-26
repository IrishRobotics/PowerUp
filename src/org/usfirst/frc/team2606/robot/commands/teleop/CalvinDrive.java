package org.usfirst.frc.team2606.robot.commands.teleop;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc.team2606.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class CalvinDrive extends Command {

    public CalvinDrive() {
        requires(Robot.drive);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        int direction;
        if (Robot.oi.getRightTriggerValue() < -.75) {
            Robot.drive.move(Robot.oi.getLeftAnalogYValue(), Robot.oi.getRightAnalogYValue());
            direction = -1;
            SmartDashboard.putNumber("Reverse", Robot.oi.getRightTriggerValue());
        } else {
            direction = 1;
            SmartDashboard.putNumber("straight", Robot.oi.getRightTriggerValue()
                    * direction);
        }
        Robot.drive.move(Robot.oi.getLeftAnalogYValue() * direction,
                Robot.oi.getRightAnalogYValue() * direction);
    }

    // TODO be able to finish?
    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
        Robot.drive.move(0, 0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        end();
    }
}