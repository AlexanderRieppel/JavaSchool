package xml;

import java.awt.*;
import javax.swing.JFrame;

/**
 * Klasse erstellt ein Fenster mit Hilfe von swing
 * 
 * @author RIEPPEL,DIMITRIJEVIC,ALY
 * @version 2013-01-10
 */
public class XMLFrame extends JFrame {
	public static void main(String[] args) {
		XMLGUI tbp = new XMLGUI();
		JFrame f = new JFrame("XML");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().add(tbp, BorderLayout.CENTER);
		f.pack();
		f.setVisible(true);
	}
}
