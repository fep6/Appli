package fr.input;


public class MainInput {

	public static void main(String[] args) {
		Boolean inputDetection;
		
		InputDetection IDetection = new InputDetection();
		inputDetection=IDetection.joystickPresent();
		System.out.println(inputDetection);
		

	}

}
