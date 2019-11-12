package fr.input;

import static org.lwjgl.glfw.GLFW.*;

import org.lwjgl.glfw.GLFWErrorCallback;

public class InputDetection {
	  private boolean joystickPresent1;
	  private boolean joystickPresent2;
	  private String nameJoystick1;
	  private String nameJoystick2;
	  private int buttonsJ1;
	  private int count;
	  
	  InputDetection(){
		  init();
		  joystickPresent1 = glfwJoystickPresent (GLFW_JOYSTICK_1);
		  joystickPresent2 = glfwJoystickPresent (GLFW_JOYSTICK_2);
		  nameJoystick1= glfwGetJoystickName(GLFW_JOYSTICK_1);
		  nameJoystick2= glfwGetJoystickName(GLFW_JOYSTICK_2);
		  buttonsJ1=glfwGetJoystickButtons(GLFW_JOYSTICK_1,count);
	  }
	  
	void init(){

			glfwInitHint ( GLFW_JOYSTICK_HAT_BUTTONS , GLFW_FALSE );
			
			// Setup an error callback. The default implementation
			// will print the error message in System.err.
			GLFWErrorCallback.createPrint(System.err).set();

			// Initialize GLFW. Most GLFW functions will not work before doing this.
			if ( !glfwInit() )
				throw new IllegalStateException("Unable to initialize GLFW"); 
			
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

	public void exitGLFW() {
		glfwTerminate();
	}
}
