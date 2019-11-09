package fr.affichage;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;

public class DrawKB extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	private FrKBTouchSimp frkbps;
	private JButton[][] bouton= new JButton[21][6];
	private JButton boutonSimple;
	private JPanel panel = new JPanel();
	/**
	 * Abcisse clavier
	 */
	private int abcisseClavier=0;
	/**
	 * Ordonnée clavier
	 */
	private int ordonnéeClavier=0;
	/**
	 * Largeur de la touche
	 */
	private int largeurTouche;
	/**
	 * Largeur variable de la touche
	 */
	private int largVariableTouche;
	/**
	 * Hauteur de la touche
	 */
	private int hauteurTouche;	
	/**
	 * Hauteur variable de la touche
	 */
	private int hauteurVariableTouche;
	
	DrawKB(){
		super();
		frkbps = new FrKBTouchSimp();
		panel = new JPanel();
		abcisseClavier=0;
		largeurTouche=50;
		ordonnéeClavier=0;
		hauteurTouche=50;
	}
	
	JComponent doDrawKB(){
		

		//Support dessin
		JPanel mainScreen = new JPanel();
		mainScreen.setLayout(null);

		// hauteurTouche https://www.developpez.net/forums/d817138/java/interfabcisseClavieres-graphiques-java/awt-swing/composants/tableau-2-dimension-jbutton/
		
		// Dessin de chaque bouton
		for (int j=0;j<6;j++) {
			for (int i=0;i<bouton.length;i++) {
				// initialisation de la largeur de la touche
				largVariableTouche=largeurTouche;
				hauteurVariableTouche=hauteurTouche;
				
				//Dessin selon les lignes du clavier
				if (j==0) gestionligne1(i);
				if (j==1) gestionligne2(i);			
				if (j==2) gestionligne3(i);			
				if (j==3) gestionligne4(i);			
				if (j==4) gestionligne5(i);		
				if (j==5) gestionligne6(i);
				//Titre du bouton
				bouton [i][j]= new JButton(frkbps.getTouche(i,j));
				// Dessin du bouton : x ,y, width, HauteurTouche
				bouton[i][j].setBounds(abcisseClavier,ordonnéeClavier,largVariableTouche,hauteurVariableTouche);
				mainScreen.add(bouton[i][j]);
				// incrémentation en abcisse de la touche
				abcisseClavier= abcisseClavier + largeurTouche;
				//On teste si on est en fin de la ligne considérée
				i= test (i,j);
			}
			// Ligne suivante (on met un esp abcisseClaviere entre la 1ere ligne et la deuxième)
			abcisseClavier=0;
			if (j!=0) {
				ordonnéeClavier=ordonnéeClavier+hauteurTouche;
			} else {
				ordonnéeClavier=(int) (ordonnéeClavier+1.2*hauteurTouche);
			}
		}
		//Rafraichissement de l'écran
		//mainScreen.repaint();
		return mainScreen;
	}	
	// test fin de chaque ligne
	int test (int i, int j) {
		if ((j==0 && i==15)|| (j==1 && i==20)||(j==3 && i==16) || (j==4 &&i ==17)||(j== 5 && i==11)) i=21;
		return i;
	}
	//Traitement par ligne
	void gestionligne1(int i) {
		if (i==1||i==5||i==9) abcisseClavier= (int) (abcisseClavier+largeurTouche*0.67);
		else if (i==13) abcisseClavier= abcisseClavier + largeurTouche;
		}
	void gestionligne2(int i){
		if (i==13) largVariableTouche=(largeurTouche*2);
		else if (i==14) abcisseClavier= abcisseClavier + largeurTouche*2;
		else if (i==17)	abcisseClavier= abcisseClavier + largeurTouche;
		}
	void gestionligne3(int i){
		if (i==0) largVariableTouche=(int) (largeurTouche*1.5); 
		else if (i==1) abcisseClavier= (int) (abcisseClavier + largeurTouche*0.5);
		else if (i==13) {
			abcisseClavier= (int) (abcisseClavier + largeurTouche*0.25);
			largVariableTouche=(int)(largeurTouche*1.25);
			hauteurVariableTouche=(int)(hauteurTouche*2);
		}
		else if (i==14) abcisseClavier= (int) (abcisseClavier + largeurTouche*1.27);
		else if (i==17) abcisseClavier= (int) (abcisseClavier+largeurTouche);
		else if (i==20) hauteurVariableTouche=(int)(hauteurTouche*2);
	}
	void gestionligne4(int i){
		if (i==0) largVariableTouche=(int) (largeurTouche*1.75); 
		else if (i==1) abcisseClavier= (int) (abcisseClavier + largeurTouche*0.75);
		else if (i==13) abcisseClavier= (int) (abcisseClavier + largeurTouche*6.25);
		else if (i==17) abcisseClavier= (int) (abcisseClavier + largeurTouche*2.5);
	}
	void gestionligne5(int i){
		if (i==0) largVariableTouche=(int) (largeurTouche*1.25); 
		else if (i==1) abcisseClavier=(int)(abcisseClavier + largeurTouche*0.25);
		else if (i==12) largVariableTouche=(int)(largeurTouche*2.75);
		else if (i==13)	abcisseClavier=(int)(abcisseClavier + largeurTouche*3.75);
		else if (i==14)	abcisseClavier=(int)(abcisseClavier + 2*largeurTouche);
		else if (i==17) hauteurVariableTouche=(int)(hauteurTouche*2);
	}
	void gestionligne6(int i){
		if (i==0) largVariableTouche=(int) (largeurTouche*1.5); 
		else if (i==1||i==2) {
			abcisseClavier= (int) (abcisseClavier + largeurTouche*0.5);
			largVariableTouche=(int) (largeurTouche*1.5);
		}
		// Space 
		else if (i==3) {
			abcisseClavier= (int) (abcisseClavier + largeurTouche*0.5);
			largVariableTouche=(int) (largeurTouche*6);
		}
		// AltGr
		else if (i==4) {
			abcisseClavier= (int) (abcisseClavier + largeurTouche*5);
			largVariableTouche=(int) (largeurTouche*1.5);
		}
		// win
		else if (i==5) {
			abcisseClavier= (int) (abcisseClavier + largeurTouche*0.5);
			largVariableTouche=(int) (largeurTouche*1.25);
		//  RCtrl
		} else if (i==6) {
			abcisseClavier= (int) (abcisseClavier + largeurTouche*0.25);
			largVariableTouche=(int) (largeurTouche*1.75);
			// L arrow
		}else if (i==7) {
			abcisseClavier= (int) (abcisseClavier + largeurTouche*1.75);
			// 0
		}else if (i==10) {
			abcisseClavier=(int)(abcisseClavier+largeurTouche);
			largVariableTouche=(int) (largeurTouche*2);
		} // .
		 else if (i==11) abcisseClavier=(int)(abcisseClavier+largeurTouche);
	}
}