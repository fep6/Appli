package fr.input;

import static org.lwjgl.glfw.GLFW.GLFW_JOYSTICK_1;
import static org.lwjgl.glfw.GLFW.GLFW_JOYSTICK_2;
import static org.lwjgl.glfw.GLFW.glfwJoystickPresent;

import org.lwjgl.*;
import org.lwjgl.glfw.*;
import org.lwjgl.opengl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.glfw.Callbacks.*;
import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;


import org.lwjgl.glfw.GLFWErrorCallback;

public class InputDetection {
	  private boolean joystickPresent1;
	  private boolean joystickPresent2;
	  InputDetection(){
		  init();
		  joystickPresent1 = glfwJoystickPresent ( GLFW_JOYSTICK_1 );
		  joystickPresent2 = glfwJoystickPresent ( GLFW_JOYSTICK_2 );
	  }
	  void init(){

			// Setup an error callback. The default implementation
			// will print the error message in System.err.
			GLFWErrorCallback.createPrint(System.err).set();

			// Initialize GLFW. Most GLFW functions will not work before doing this.
			if ( !glfwInit() )
				throw new IllegalStateException("Unable to initialize GLFW"); 
	  }
	  boolean joystick1Present() {
		  return joystickPresent1;
	  }

	  boolean joystick2Present() {
		  return joystickPresent2;
	  }
}
