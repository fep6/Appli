package fr.input;


public class MainInput {

	public static void main(String[] args) {
		boolean inputDetection1;
		boolean inputDetection2;
		
		InputDetection IDetection = new InputDetection();
		inputDetection1=IDetection.joystick1Present();
		System.out.println("detection joystick 1 :" + inputDetection1);
		inputDetection2=IDetection.joystick2Present();
		System.out.println("detection joystick 2 :" + inputDetection2);
		

	}

}
