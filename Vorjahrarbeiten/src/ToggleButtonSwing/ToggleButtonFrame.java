package ToggleButtonSwing;

import java.awt.*;
import javax.swing.JFrame;

/**
 * Klasse erstellt ein Fenster mit Hilfe von swing
 * 
 * @author RIEPPEL
 * @version 2011-10-16
 */
public class ToggleButtonFrame extends JFrame{
	public static void main(String []args){
		ToggleButtonPanel tbp = new ToggleButtonPanel();
		JFrame f = new JFrame("ToggleButton");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().add(tbp, BorderLayout.CENTER);
		f.pack();
		f.setVisible(true);
	}
}