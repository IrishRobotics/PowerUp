package org.usfirst.frc.team2606.robot.commands.teleop;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc.team2606.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class TankDrive extends Command {
    private Joystick leftJoystick;

    public TankDrive() {
        requires(Robot.drive);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        leftJoystick = Robot.oi.getLeftJoystick();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        int direction;
        if (leftJoystick.getRawAxis(3) < -.75) {
            Robot.drive.move(leftJoystick.getRawAxis(1), leftJoystick.getRawAxis(5));
            direction = 1;
            SmartDashboard.putNumber("Reverse", leftJoystick.getRawAxis(3));
        } else {
            direction = -1;
            SmartDashboard.putNumber("straight", leftJoystick.getRawAxis(3)
                    * direction);
        }
        Robot.drive.move(leftJoystick.getRawAxis(1) * direction,
                leftJoystick.getRawAxis(5) * direction);
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
