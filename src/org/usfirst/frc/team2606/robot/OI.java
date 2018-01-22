/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team2606.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    private Joystick leftJoystick = RobotMap.LEFT_JOYSTICK;
    private Joystick rightJoystick = RobotMap.RIGHT_JOYSTICK;

    OI() {
        //Joystick Mapping
        JoystickButton XBOX_A = new JoystickButton(leftJoystick, 1);
        JoystickButton XBOX_B = new JoystickButton(leftJoystick, 2);
        JoystickButton XBOX_X = new JoystickButton(leftJoystick, 3);
        JoystickButton XBOX_Y = new JoystickButton(leftJoystick, 4);

        JoystickButton trigger = new JoystickButton(rightJoystick, 1);

        JoystickButton TOP_UP = new JoystickButton(rightJoystick, 3);
        JoystickButton TOP_DOWN = new JoystickButton(rightJoystick, 2);
        JoystickButton TOP_LEFT = new JoystickButton(rightJoystick, 4);
        JoystickButton TOP_RIGHT = new JoystickButton(rightJoystick, 5);

        JoystickButton BOTTOM_MID_LEFT = new JoystickButton(rightJoystick, 8);
        JoystickButton BOTTOM_MID_RIGHT = new JoystickButton(rightJoystick, 9);

        JoystickButton BOTTOM_LEFT_UP = new JoystickButton(rightJoystick, 6);
        JoystickButton BOTTOM_LEFT_DOWN = new JoystickButton(rightJoystick, 7);

        JoystickButton BOTTOM_RIGHT_UP = new JoystickButton(rightJoystick, 11);
        JoystickButton BOTTOM_RIGHT_DOWN = new JoystickButton(rightJoystick, 10);

        //Xbox Mapping

        // TODO Reverse drive with trigger
        if (rightJoystick.getY() > .125) {
            Robot.drive.move(rightJoystick.getY() * -.5,
                    rightJoystick.getY() * -.5);
        }
    }

    public Joystick getLeftJoystick() {
        return leftJoystick;
    }

    public Joystick getRightJoystick() {
        return rightJoystick;
    }
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);

	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.

	//// TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());
}
