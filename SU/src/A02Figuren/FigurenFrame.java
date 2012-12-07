package A02Figuren;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 * Klasse die das Panel und das GUI in ein Fenster packt und anzeigt
 * 
 * @author Alexander Rieppel
 * @version 2012-11-07  v1.1
 */
public class FigurenFrame extends JFrame{
	public static void main(String []args){
		JFrame f = new JFrame("Figuren");
		FigurenPanel fp = new FigurenPanel();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Standardoperation zum Schließen
		f.getContentPane().add(fp, BorderLayout.CENTER);
		f.pack();//Fenstergröße wird auf den Inhalt abgestimmt
		f.setVisible(true);
	}
}
