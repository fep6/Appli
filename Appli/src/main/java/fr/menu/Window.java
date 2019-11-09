package fr.menu;

// https://www.youtube.com/watch?v=-UvxwleNA20&t=221s
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.JTree;
import javax.swing.RootPaneContainer;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
/**
 * BorderLayout
 * TextArea	
 */
public class Window extends JFrame{
	private static final long serialVersionUID = -6906441042070858585L;
		
		private JFrame fenetre = new JFrame();
		private DrawKB dkb = new DrawKB();
		private JButton[][] bouton= new JButton[21][6];
		private JButton boutonSimple;
		private JPanel panel = new JPanel();
		private String date = String.format("%1$tI:%1$tM %1$Tp, %1$te %1$tb %1$tY", new java.util.Date());
		

	public Window() {

		super( "Gestion du KeyBinding" ); 
		//Pour terminerl'application (à la fermeture de la fenêtre)
		// Contrairement à EXIT_ON_CLOSE, DISPOSE_ON_CLOSE permet de ne pas tout fermer
		this.setDefaultCloseOperation(fenetre.DISPOSE_ON_CLOSE);
		// Parametrage de la fenêtre
		this.setSize(600,400);
		// Le centrage doit de faire après la taille de la fenêtre
		this.setLocationRelativeTo(null);
		
		//permet d'avoir le contenu principal de la fenêtre (au delà du bandeau supérieur et de la barre de menu)
		JPanel contentPane = (JPanel) this.getContentPane();
		
		// 
		contentPane.setLayout(new BorderLayout());

		// Création des éléments
		JScrollPane westComponent = new JScrollPane (new JTree());
		westComponent.setPreferredSize(new Dimension(100,0));
		
		//JPanel jp = new JPanel(dkb.doDrawKB());
		JScrollPane mainScreen = new JScrollPane (dkb.doDrawKB());
		
		//Affichage boutons (createToolbar() au Nord et SOUTH prend toute la largeur
		// et se cale sur le contenu pour la hauteur
		// C'est l'inverse pour EAST et WEST
		contentPane.add(westComponent,BorderLayout.WEST);
		contentPane.add(createToolbar(),BorderLayout.NORTH);
		contentPane.add(createRightPanel(), BorderLayout.EAST);
		contentPane.add(createStatusBar(),BorderLayout.SOUTH);
		

		contentPane.add(mainScreen,BorderLayout.CENTER);
	}	
	
	private JToolBar createToolbar() {
		JToolBar toolBar = new JToolBar();
		// Création des éléments
		JButton btnPushMe = new JButton ("Push me!");
		JButton btnClickMe = new JButton ("Click me!");
		JCheckBox chkCheckMe = new JCheckBox("Check me!!!!!!!!!!");
		JTextField editMe = new JTextField("Edit Me!!!!!!!");
		editMe.setPreferredSize(new Dimension(140,30));
		
		toolBar.add(btnPushMe);
		toolBar.add(btnClickMe);
		toolBar.add(chkCheckMe);
		toolBar.add(editMe,BorderLayout.EAST);
			
		return toolBar;
	}
	
	private JPanel createStatusBar() {
		JPanel statusBar = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		JLabel lblStatus1 = new JLabel ("Message 1");
		lblStatus1.setPreferredSize(new Dimension(100,30));
		statusBar.add(lblStatus1);

		JLabel lblStatus2 = new JLabel ("Message 2");
		lblStatus2.setPreferredSize(new Dimension(100,30));
		statusBar.add(lblStatus2);
		

		JLabel lblStatus3 = new JLabel (date);
		lblStatus3.setPreferredSize(new Dimension(200,30));
		statusBar.add(lblStatus3);
		
		return statusBar;
	}
	
	private JPanel createRightPanel() {
		JPanel rightPanel = new JPanel(new GridLayout(4,1));
		rightPanel.add(new JButton("Bouton 1"));
		rightPanel.add(new JButton("Bouton 2"));
		rightPanel.add(new JButton("Bouton 3"));
		rightPanel.add(new JButton("Bouton 4"));
		
		return rightPanel;
	}



}
