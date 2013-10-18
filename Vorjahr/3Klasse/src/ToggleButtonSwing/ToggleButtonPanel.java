package ToggleButtonSwing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Klasse die eine grafische Oberfläche erstellt, ein Label, einen JButton mit Bild 
 * und einen JToggleButton mit Bild enthält.
 * 
 * @author RIEPPEL
 * @version 2011-10-16
 */
public class ToggleButtonPanel extends JPanel {
	
	private ImageIcon image = new ImageIcon("src/ToggleButtonSwing/green.gif");
	private ImageIcon image1 = new ImageIcon("src/ToggleButtonSwing/red.gif");
	private JButton random = new JButton("Random", image);
	private JToggleButton toggle = new JToggleButton("Toggle the Button", image1);
	private JLabel label = new JLabel("Wert: 00");
	private int z=2;
	
	/**
	 * Erstellt die graphische Oberfläche
	 */
	public ToggleButtonPanel() {
		this.setLayout(new BorderLayout());
		random.addActionListener(new ActionHandler());
		toggle.addActionListener(new ActionHandler());
		JPanel p1 = new JPanel();
		p1.setLayout(new FlowLayout());
		p1.add(toggle);
		p1.add(random);
		p1.add(label);
		this.add(p1, BorderLayout.CENTER);
	}
	/**
	 * Klasse mit dem ActionHandler für die Buttons
	 */
	private class ActionHandler implements ActionListener {
		/**
		 * Wenn der JToggleButton gedrückt wird, wird je nach Wert der Zählvariable 
		 * der Button deaktiviert oder aktiviert
		 * 
		 * @param arg0	wird für das Ereignis bei einem Button-Druck benötigt
		 */
		@Override
		public void actionPerformed(ActionEvent arg0) {
			if(arg0.getSource() == random) {
				String txt = "";
				txt+=(int)(Math.random()*45+1);
				label.setText("Wert: "+txt);
			}
			if(arg0.getSource() == toggle) {
				if(z%2==0)
					random.setEnabled(false);
				if(z%2!=0)
					random.setEnabled(true);
				z++;
			}
		}
	}
}