package fr.input;

import static org.lwjgl.glfw.GLFW.GLFW_JOYSTICK_1;
import static org.lwjgl.glfw.GLFW.glfwJoystickPresent;

public class InputDetection {
	  private boolean joystickPresent;
	  InputDetection(){
		  joystickPresent = glfwJoystickPresent ( GLFW_JOYSTICK_1 );
	  }
	  boolean joystickPresent() {
		  return joystickPresent;
	  }
}
