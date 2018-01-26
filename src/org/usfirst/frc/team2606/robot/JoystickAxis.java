package org.usfirst.frc.team2606.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.buttons.Trigger;

public class JoystickAxis extends Trigger {
    private final GenericHID joystick;
    private final int xAxisNumber, yAxisNumber;

    /**
     * Create a joystick button for triggering commands.
     * @param joystick    The GenericHID object that has the button (e.g. Joystick, KinectStick, etc)
     * @param xAxisNumber The button number (see {@link GenericHID#getRawAxis(int) }
     */
    public JoystickAxis(GenericHID joystick, int xAxisNumber, int yAxisNumber) {
        this.joystick = joystick;
        this.xAxisNumber = xAxisNumber;
        this.yAxisNumber = yAxisNumber;
    }

    /**
     * @return value of joystick axis
     */
    public double getX() {
        return joystick.getRawAxis(xAxisNumber);
    }

    public double getY() {
        return joystick.getRawAxis(yAxisNumber);
    }

    public boolean get() {
        return (getX() != 0 || getY() != 0);
    }
}
