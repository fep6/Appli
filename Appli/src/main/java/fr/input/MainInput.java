package fr.input;
/**
 * https://www.glfw.org/docs/latest/input_guide.html#joystick
 * @author fep
 *
 */

public class MainInput {

	 public MainInput() {
		
		InputDetection iDetection = new InputDetection();
		iDetection.doDetection();
		iDetection.printDetection();
		
		
		// Fermeture de la bibliotheque
		iDetection.exitGLFW();
	}

}
