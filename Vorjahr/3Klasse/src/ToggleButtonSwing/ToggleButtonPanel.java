package ToggleButtonSwing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Klasse die eine grafische Oberfl�che erstellt, ein Label, einen JButton mit Bild 
 * und einen JToggleButton mit Bild enth�lt.
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
	 * Erstellt die graphische Oberfl�che
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
	 * Klasse mit dem ActionHandler f�r die Buttons
	 */
	private class ActionHandler implements ActionListener {
		/**
		 * Wenn der JToggleButton gedr�ckt wird, wird je nach Wert der Z�hlvariable 
		 * der Button deaktiviert oder aktiviert
		 * 
		 * @param arg0	wird f�r das Ereignis bei einem Button-Druck ben�tigt
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