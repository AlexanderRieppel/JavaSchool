package Backhausen_Dimitrijevic.Gui;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JFrame;
import javax.swing.JPanel;




public class NewFrame extends JFrame {
		
	/**
	 * Konstruktur
	 * 
	 */
	public NewFrame(GuiHinzu myPanel) {
		
		// festlegung der �berschrift im Frame   
		setTitle("Hinzuf�gen/Bearbeiten von Figuren");
		// Standardoperation f�r das Schlie�en des Frames festlegen
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		// Die erstellten Panels werden im ContentPane des Frames platziert
		this.getContentPane().add(BorderLayout.CENTER,myPanel);
		// Gr��e des Frames wird auf 650 x 450 Pixel gestellt
		this.setSize(650, 450);
		// Nach dem Aufbau, wird der Frame nun auch sichtbar
		this.setVisible(true);
	}
}
