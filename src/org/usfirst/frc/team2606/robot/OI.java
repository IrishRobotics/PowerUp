package org.usfirst.frc.team2606.robot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import org.usfirst.frc.team2606.robot.controller.JoystickAxis;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
* This class is the glue that binds the controls on the physical operator
* interface to the commands and command groups that allow control of the robot.
*/

public class OI {
   private Joystick XboxController = RobotMap.XboxController;
	
   public OI(){
       JoystickButton ButtonA = new JoystickButton(XboxController, 1);
       JoystickButton ButtonB = new JoystickButton(XboxController, 2);
       JoystickButton ButtonX = new JoystickButton(XboxController, 3);
       JoystickButton ButtonY = new JoystickButton(XboxController, 4);
       JoystickButton LeftBumper = new JoystickButton(XboxController, 5);
       JoystickButton RightBumper = new JoystickButton(XboxController, 6);
       JoystickButton Select = new JoystickButton(XboxController, 7);
       JoystickButton Start = new JoystickButton(XboxController, 8);
       JoystickButton PressLeftAnalog = new JoystickButton(XboxController, 9);
       JoystickButton PressRightAnalog = new JoystickButton(XboxController, 10);
       JoystickAxis LeftAnalog = new JoystickAxis(XboxController, 1, 2);
       JoystickAxis RightAnalog = new JoystickAxis(XboxController, 4, 5);
       JoystickAxis LeftTrigger = new JoystickAxis(XboxController, 2, 2);
       JoystickAxis RightTrigger = new JoystickAxis(XboxController, 3, 3);
       SmartDashboard.putBoolean("A Button:", ButtonA.get());
       SmartDashboard.putBoolean("B Button:", ButtonB.get());
       SmartDashboard.putBoolean("X Button:", ButtonX.get());
       SmartDashboard.putBoolean("Y Button:", ButtonY.get());
       SmartDashboard.putBoolean("Left Bumper:", LeftBumper.get());
       SmartDashboard.putBoolean("Right Bumper:", RightBumper.get());
       SmartDashboard.putBoolean("Select:", Select.get());
       SmartDashboard.putBoolean("Start:", Start.get());
       SmartDashboard.putBoolean("Left Analog Pressed:", PressLeftAnalog.get());
       SmartDashboard.putBoolean("Right Analog Pressed:", PressRightAnalog.get());
       SmartDashboard.putNumber("Left Analog X:", LeftAnalog.getX());
       SmartDashboard.putNumber("Left Analog Y:", LeftAnalog.getY());
       SmartDashboard.putNumber("Right Analog X:", RightAnalog.getX());
       SmartDashboard.putNumber("Right Analog Y", RightAnalog.getY());
   }
	
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

    public Joystick getXboxController() {
        return XboxController;
    }

}
