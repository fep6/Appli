package fr.input;

import static org.lwjgl.glfw.GLFW.*;

import java.nio.ByteBuffer;

import org.lwjgl.glfw.GLFWErrorCallback;

public class InputDetection {
	  private boolean joystickPresent1;
	  private boolean joystickPresent2;
	  private String nameJoystick1;
	  private String nameJoystick2;
	  private ByteBuffer buttonsJ1;
	  private ByteBuffer buttonsJ2;
	  
	  InputDetection(){
		  init();
		  doDetection();
	  }
	  
	void init(){
			// indique que le joystick a un chapeau chinois
			glfwInitHint ( GLFW_JOYSTICK_HAT_BUTTONS , GLFW_FALSE );
			
			// Setup an error callback. The default implementation
			// will print the error message in System.err.
			GLFWErrorCallback.createPrint(System.err).set();

			// Initialize GLFW. Most GLFW functions will not work before doing this.
			if ( !glfwInit() )
				throw new IllegalStateException("Unable to initialize GLFW"); 
			
	  }
	void doDetection() {
		  joystickPresent1 = glfwJoystickPresent (GLFW_JOYSTICK_1);
		  joystickPresent2 = glfwJoystickPresent (GLFW_JOYSTICK_2);
		  nameJoystick1= glfwGetJoystickName(GLFW_JOYSTICK_1);
		  nameJoystick2= glfwGetJoystickName(GLFW_JOYSTICK_2);
		  buttonsJ1=glfwGetJoystickButtons(GLFW_JOYSTICK_1);
		  buttonsJ2=glfwGetJoystickButtons(GLFW_JOYSTICK_2);
	}
	void printDetection() {
		
	}

	public void exitGLFW() {
		glfwTerminate();
	}
	  String nameDetectJ1(){
		  return nameJoystick1;
	  }
	  String nameDetectJ2(){
		  return nameJoystick2;
	  }
	  boolean joystick1Present() {
		  return joystickPresent1;
	  }

	  boolean joystick2Present() {
		  return joystickPresent2;
	  }

}
