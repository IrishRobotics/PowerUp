/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team2606.robot;

import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc.team2606.robot.sensor.driver.ADIS16448_IMU;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    private Joystick xboxController = new Joystick(RobotMap.XBOX_CONTROLLER);
    private JoystickButton xboxA;
    private JoystickButton xboxB;
    private JoystickButton xboxX;
    private JoystickButton xboxY;
    private JoystickButton leftBumper;
    private JoystickButton rightBumper;
    private JoystickButton select;
    private JoystickButton start;
    private JoystickButton pressLeftAnalog;
    private JoystickButton pressRightAnalog;
    private JoystickAxis leftAnalog;
    private JoystickAxis rightAnalog;
    private JoystickAxis leftTrigger;
    private JoystickAxis rightTrigger;

    OI() {
        //Joystick Mapping
        xboxA = new JoystickButton(xboxController, RobotMap.XBOX_A);
        xboxB = new JoystickButton(xboxController, RobotMap.XBOX_B);
        xboxX = new JoystickButton(xboxController, RobotMap.XBOX_X);
        xboxY = new JoystickButton(xboxController, RobotMap.XBOX_Y);

        leftBumper = new JoystickButton(xboxController, RobotMap.LEFT_BUMPER);
        rightBumper = new JoystickButton(xboxController, RobotMap.RIGHT_BUMPER);
        select = new JoystickButton(xboxController, RobotMap.SELECT);
        start = new JoystickButton(xboxController, RobotMap.START);
        pressLeftAnalog = new JoystickButton(xboxController, RobotMap.PRESS_LEFT_ANALOG);
        pressRightAnalog = new JoystickButton(xboxController, RobotMap.PRESS_RIGHT_ANALOG);
        leftAnalog = new JoystickAxis(xboxController, RobotMap.LEFT_ANALOG_X_AXIS, RobotMap.LEFT_ANALOG_Y_AXIS);
        rightAnalog = new JoystickAxis(xboxController, RobotMap.RIGHT_ANALOG_X_AXIS, RobotMap.RIGHT_ANALOG_Y_AXIS);
        leftTrigger = new JoystickAxis(xboxController, RobotMap.LEFT_TRIGGER_X_AXIS, RobotMap.LEFT_TRIGGER_Y_AXIS);
        rightTrigger = new JoystickAxis(xboxController, RobotMap.RIGHT_TRIGGER_X_AXIS, RobotMap.RIGHT_TRIGGER_Y_AXIS);
    }

    public Joystick getXboxController() {
        return xboxController;
    }

    public JoystickButton getXboxA() {
        return xboxA;
    }

    public JoystickButton getXboxB() {
        return xboxB;
    }

    public JoystickButton getXboxX() {
        return xboxX;
    }

    public JoystickButton getXboxY() {
        return xboxY;
    }

    public JoystickButton getLeftBumper() {
        return leftBumper;
    }

    public JoystickButton getRightBumper() {
        return rightBumper;
    }

    public JoystickButton getSelect() {
        return select;
    }

    public JoystickButton getStart() {
        return start;
    }

    public JoystickButton getPressLeftAnalog() {
        return pressLeftAnalog;
    }

    public JoystickButton getPressRightAnalogValue() {
        return pressRightAnalog;
    }

    public double getLeftAnalogXValue() {
        return leftAnalog.getX();
    }
    public double getLeftAnalogYValue() {
        return leftAnalog.getY();
    }

    public double getRightAnalogXValue() {
        return rightAnalog.getX();
    }
    public double getRightAnalogYValue() {
        return rightAnalog.getY();
    }

    public double getLeftTriggerValue() {
        return leftTrigger.getX();
    }
    public double getRightTriggerValue() {
        return rightTrigger.getX();
    }
}
