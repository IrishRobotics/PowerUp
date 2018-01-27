package org.usfirst.frc.team2606.robot.commands.teleop;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc.team2606.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class CalvinDrive extends Command {

    public CalvinDrive() {
        requires(Robot.drive);
    }

    private double analogMultiplier, triggerMultiplier, speedMultiplier;

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {

        //decalres multilpiers from left analog and trigger input
        analogMultiplier = (double) -2 * Math.abs(Robot.oi.getRightAnalogXValue()) + 1;
        triggerMultiplier = (double) 2 * (Robot.oi.getRightTriggerValue - Robot.oi.getRightTriggerValue());
        speedMultiplier = analogMultiplier * triggerMultiplier;

        if (Robot.oi.getLeftAnalogXValue() < 0.45  ) {
            Robot.drive.move(speedMultiplier, triggerMultiplier);
        } else if (Robot.oi.getLeftAnalogXValue() > 0.55){
            Robot.drive.move(triggerMultiplier, speedMultiplier);
        }
        Robot.drive.move(triggerMultiplier, triggerMultiplier);
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