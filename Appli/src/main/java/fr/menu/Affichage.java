package fr.menu;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class Affichage  {
	
	public Affichage() throws UnsupportedLookAndFeelException {
	// Application du look nimbus
	 UIManager.setLookAndFeel(new NimbusLookAndFeel());
	
	//Début de la création de fenêtre
	Window window = new Window();
	window.setVisible(true);
	
	}
}
