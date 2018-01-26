/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team2606.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    private Joystick XBOX_CONTROLLER = RobotMap.XBOX_CONTROLLER;
    private JoystickButton XBOX_A;
    private JoystickButton XBOX_B;
    private JoystickButton XBOX_X;
    private JoystickButton XBOX_Y;
    private JoystickButton LEFT_BUMPER;
    private JoystickButton RIGHT_BUMPER;
    private JoystickButton SELECT;
    private JoystickButton START;
    private JoystickButton PRESS_LEFT_ANALOG;
    private JoystickButton PRESS_RIGHT_ANALOG;
    private JoystickAxis LEFT_ANALOG;
    private JoystickAxis RIGHT_ANALOG;
    private JoystickAxis LEFT_TRIGGER;
    private JoystickAxis RIGHT_TRIGGER;

    OI() {
        //Joystick Mapping
        XBOX_A = new JoystickButton(XBOX_CONTROLLER, 1);
        XBOX_B = new JoystickButton(XBOX_CONTROLLER, 2);
        XBOX_X = new JoystickButton(XBOX_CONTROLLER, 3);
        XBOX_Y = new JoystickButton(XBOX_CONTROLLER, 4);

        LEFT_BUMPER = new JoystickButton(XBOX_CONTROLLER, 5);
        RIGHT_BUMPER = new JoystickButton(XBOX_CONTROLLER, 6);
        SELECT = new JoystickButton(XBOX_CONTROLLER, 7);
        START = new JoystickButton(XBOX_CONTROLLER, 8);
        PRESS_LEFT_ANALOG = new JoystickButton(XBOX_CONTROLLER, 9);
        PRESS_RIGHT_ANALOG = new JoystickButton(XBOX_CONTROLLER, 10);
        LEFT_ANALOG = new JoystickAxis(XBOX_CONTROLLER, 0, 1);
        RIGHT_ANALOG = new JoystickAxis(XBOX_CONTROLLER, 4, 5);
        LEFT_TRIGGER = new JoystickAxis(XBOX_CONTROLLER, 2, 2);
        RIGHT_TRIGGER = new JoystickAxis(XBOX_CONTROLLER, 3, 3);

        SmartDashboard.putBoolean("A Button:", XBOX_A.get());
        SmartDashboard.putBoolean("B Button:", XBOX_B.get());
        SmartDashboard.putBoolean("X Button:", XBOX_X.get());
        SmartDashboard.putBoolean("Y Button:", XBOX_Y.get());
        SmartDashboard.putBoolean("Left Bumper:", LEFT_BUMPER.get());
        SmartDashboard.putBoolean("Right Bumper:", RIGHT_BUMPER.get());
        SmartDashboard.putBoolean("Select:", SELECT.get());
        SmartDashboard.putBoolean("Start:", START.get());
        SmartDashboard.putBoolean("Left Analog Pressed:", PRESS_LEFT_ANALOG.get());
        SmartDashboard.putBoolean("Right Analog Pressed:", PRESS_RIGHT_ANALOG.get());
        SmartDashboard.putNumber("Left Analog X:", LEFT_ANALOG.getX());
        SmartDashboard.putNumber("Left Analog Y:", LEFT_ANALOG.getY());
        SmartDashboard.putNumber("Right Analog X:", RIGHT_ANALOG.getX());
        SmartDashboard.putNumber("Right Analog Y", RIGHT_ANALOG.getY());
        SmartDashboard.putNumber("Left Trigger", LEFT_TRIGGER.getX());
        SmartDashboard.putNumber("Right Trigger", RIGHT_TRIGGER.getX());
    }
    public Joystick getXboxController() {
        return XBOX_CONTROLLER;
    }

    public JoystickButton getXboxA() {
        return XBOX_A;
    }

    public JoystickButton getXboxB() {
        return XBOX_B;
    }

    public JoystickButton getXboxX() {
        return XBOX_X;
    }

    public JoystickButton getXboxY() {
        return XBOX_Y;
    }

    public JoystickButton getLeftBumper() {
        return LEFT_BUMPER;
    }

    public JoystickButton getRightBumper() {
        return RIGHT_BUMPER;
    }

    public JoystickButton getSelect() {
        return SELECT;
    }

    public JoystickButton getStart() {
        return START;
    }

    public JoystickButton getPressLeftAnalog() {
        return PRESS_LEFT_ANALOG;
    }

    public JoystickButton getPressRightAnalogValue() {
        return PRESS_RIGHT_ANALOG;
    }

    public double getLeftAnalogXValue() {
        return LEFT_ANALOG.getX();
    }
    public double getLeftAnalogYValue() {
        return LEFT_ANALOG.getY();
    }

    public double getRightAnalogXValue() {
        return RIGHT_ANALOG.getX();
    }
    public double getRightAnalogYValue() {
        return RIGHT_ANALOG.getY();
    }

    public double getLeftTriggerValue() {
        return LEFT_TRIGGER.getX();
    }

    public double getRightTriggerValue() {
        return RIGHT_TRIGGER.getX();
    }
}
