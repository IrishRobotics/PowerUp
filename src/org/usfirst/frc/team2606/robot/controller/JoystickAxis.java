package org.usfirst.frc.team2606.robot.controller;

/*----------------------------------------------------------------------------*/
/* Copyright (c) 2008-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.buttons.Trigger;

public class JoystickAxis extends Trigger {
    private final GenericHID m_joystick;
    private final int m_xAxisNumber, m_yAxisNumber;

    /**
     * Create a joystick button for triggering commands.
     *
     * @param joystick     The GenericHID object that has the button (e.g. Joystick, KinectStick,
     *                     etc)
     * @param xAxisNumber The button number (see {@link GenericHID#getRawAxis(int) }
     */
    public JoystickAxis(GenericHID joystick, int xAxisNumber, int yAxisNumber) {
        m_joystick = joystick;
        m_xAxisNumber = xAxisNumber;
        m_yAxisNumber = yAxisNumber;
    }

    /**
     * Gets the value of the joystick button.
     *
     * @return The value of the joystick button
     */
    public double getX() {
        return m_joystick.getRawAxis(m_xAxisNumber);
    }

    public double getY(){
        return m_joystick.getRawAxis(m_yAxisNumber);
    }

    public boolean get(){
        if(getX()!=0||getY()!=0) {
            return true;
        } return false;
    }
}
