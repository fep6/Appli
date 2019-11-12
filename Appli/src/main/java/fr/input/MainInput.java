package fr.input;
/**
 * https://www.glfw.org/docs/latest/input_guide.html#joystick
 * @author fep
 *
 */

public class MainInput {

	public static void main(String[] args) {
		boolean inputDetection1;
		boolean inputDetection2;
		String typeJ1;
		String typeJ2;
		
		InputDetection iDetection = new InputDetection();
		inputDetection1=iDetection.joystick1Present();
		inputDetection2=iDetection.joystick2Present();
		typeJ1=iDetection.nameDetectJ1();
		typeJ2=iDetection.nameDetectJ2();
		System.out.println("detection joystick 1 :" + inputDetection1+". Il s'agit d'un :"+typeJ1);
		System.out.println("detection joystick 2 :" + inputDetection2+". Il s'agit d'un :"+typeJ2);
		
		// Fermeture de la bibliotheque
		iDetection.exitGLFW();
	}

}
