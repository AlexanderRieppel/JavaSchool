package Backhausen_Dimitrijevic.Gui;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Diese Klasse Öffnet ein Fenster und fügt das ZeichnenGui(DanielGui) hinzu
 * @author Daniel
 */
public class MyFrame extends JFrame {
	
	/**
	 * Konstruktur
	 * 
	 */
	public MyFrame(DanielGui myPanel) {
		
		// festlegung der Überschrift im Frame   
		setTitle("Figuren GUI");
		// Standardoperation für das Schließen des Frames festlegen
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Die erstellten Panels werden im ContentPane des Frames platziert
		this.getContentPane().add(BorderLayout.CENTER,myPanel);
		// Größe des Frames wird auf 600 x 700 Pixel gestellt
		this.setSize(600, 700);
		// Nach dem Aufbau, wird der Frame nun auch sichtbar
		this.setVisible(true);
	}

}
