package Backhausen_Dimitrijevic.Gui;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Das ist die HInzufügen GUI zum editieren und eingeben von INformationen für die Figuren
 * @author Dominik
 *
 */
public class GuiHinzu extends JPanel {
	
		private JTextField xkor,ykor, zu1, zu2;
		private JColorChooser cc;
		private JButton fertig, bes;
		private JComboBox wo;
		private int objekt1 = -1;
		private JLabel zu1l,zu2l;
		private Controller c;
		private boolean neu;
		private int bi;
		private JCheckBox cb;
		
		/**
		 * Der KOnstruktor zum aufbauen der Gui
		 * @param c
		 */
		public GuiHinzu(Controller c) {
			neu = true;
			bi = -2;
			this.c = c;
			this.setLayout(new BorderLayout());
			
			JPanel haupt = new JPanel(new GridLayout(4,1,10,10));
			
			String[] ol ={"Kreis","Rechteck","Linie","Mensch"};
			wo = new JComboBox(ol);
			
			
			ActionHandler ah = new ActionHandler();
			fertig = new JButton("Fertig!");
			fertig.addActionListener(ah);
			bes = new JButton("Auswählen!");
			bes.addActionListener(ah);
			
			xkor = new JTextField();
			ykor = new JTextField();
			
			JPanel ausw = new JPanel(new GridLayout(1,2,10,10));
			ausw.add(wo);
			ausw.add(bes);
			
			JPanel kord = new JPanel(new GridLayout(1,4,10,10));
			JPanel zukord = null;
			
			JLabel l1 = new JLabel("xKordinate");
			kord.add(l1);
			kord.add(xkor);
			JLabel l2 = new JLabel("yKordinate");
			kord.add(l2);
			kord.add(ykor);
			
			
			zukord = new JPanel(new GridLayout(1,2,10,10));
			zu1l = new JLabel("");
			zukord.add(zu1l);
			zu1 = new JTextField();
			zu1.setVisible(false);
			zukord.add(zu1);
			zu2l = new JLabel("");
			zukord.add(zu2l);
			zu2 = new JTextField();
			zu2.setVisible(false);
			zukord.add(zu2);
			cb = new JCheckBox("Gefüllt");
			cb.setVisible(false);
			
			
			haupt.add(ausw);
			haupt.add(kord);
			haupt.add(zukord);
			haupt.add(cb);
			
			
			cc = new JColorChooser(Color.BLACK);
			
			
			this.add(haupt,BorderLayout.NORTH);
			this.add(cc,BorderLayout.CENTER);
			this.add(fertig,BorderLayout.SOUTH);
			
			refresh();
		}
		
		/**
		 * Diese Methode Aktuallisiert die Hinzufügengui
		 */
		public void refresh(){
			objekt1 = wo.getSelectedIndex();
			if(objekt1 == 0){
				zu1.setVisible(true);
				zu2.setVisible(false);
				zu1l.setText("Radius");
				zu2l.setText("");
				cb.setVisible(true);
			}else
			if(objekt1 == 1){
				zu1.setVisible(true);
				zu2.setVisible(true);
				zu1l.setText("Länge");
				zu2l.setText("Breite");
				cb.setVisible(true);
			}else
			if(objekt1 == 2){
				zu1.setVisible(true);
				zu2.setVisible(true);
				zu1l.setText("2. xKordinate");
				zu2l.setText("2. yKordinate");
				cb.setVisible(false);
			}else
			if(objekt1 == 3){
				zu1.setVisible(true);
				zu2.setVisible(false);
				zu1l.setText("Größe");
				zu2l.setText("");
				cb.setVisible(true);
			}
			if(neu)
				fertig.setText("Hinzufügen!");
			else
				fertig.setText("Ändern! von Element: " + (bi+1));
		}
		
		/**
		 * Diese Methode wird generiert eine Figur mit den eingegebenen werten und übergibt sie dem controller
		 */
		public void eingabe(){
			if(neu){
				switch(wo.getSelectedIndex()){
					case 0:
						c.addfigur(new Kreis(Integer.parseInt(xkor.getText()),Integer.parseInt(ykor.getText()),Integer.parseInt(zu1.getText()),cc.getColor(),cb.isSelected()));
						break;
					case 1:
						c.addfigur(new Rechteck(Integer.parseInt(xkor.getText()),Integer.parseInt(ykor.getText()),Integer.parseInt(zu1.getText()),Integer.parseInt(zu2.getText()),cc.getColor(),cb.isSelected()));
						break;
					case 2:
						c.addfigur(new Linie(Integer.parseInt(xkor.getText()),Integer.parseInt(ykor.getText()),Integer.parseInt(zu1.getText()),Integer.parseInt(zu2.getText()),cc.getColor()));
						break;
					case 3:
						c.addfigur(new Mensch(Integer.parseInt(xkor.getText()),Integer.parseInt(ykor.getText()),Integer.parseInt(zu1.getText()),cc.getColor(),cb.isSelected()));
						break;
				}
			}else{
				switch(wo.getSelectedIndex()){
				case 0:
					c.setfigur(bi,new Kreis(Integer.parseInt(xkor.getText()),Integer.parseInt(ykor.getText()),Integer.parseInt(zu1.getText()),cc.getColor(),cb.isSelected()));
					break;
				case 1:
					c.setfigur(bi,new Rechteck(Integer.parseInt(xkor.getText()),Integer.parseInt(ykor.getText()),Integer.parseInt(zu1.getText()),Integer.parseInt(zu2.getText()),cc.getColor(),cb.isSelected()));
					break;
				case 2:
					c.setfigur(bi,new Linie(Integer.parseInt(xkor.getText()),Integer.parseInt(ykor.getText()),Integer.parseInt(zu1.getText()),Integer.parseInt(zu2.getText()),cc.getColor()));
					break;
				case 3:
					c.setfigur(bi,new Mensch(Integer.parseInt(xkor.getText()),Integer.parseInt(ykor.getText()),Integer.parseInt(zu1.getText()),cc.getColor(),cb.isSelected()));
					break;
				}
				neu = true;
				bi = -2;
			}
			this.refresh();
		}
		
		/**
		 * Diese Methode setzt den Inhalt der EingabeFelder auf die Werte einer vorhandenen Figur um diese zu editieren
		 * @param i index der zu editierenden Figur
		 * @param f die Figur die editiert werden soll
		 */
		public void setAll(int i,Figuren f){
			bi = i;
			neu = false;
			switch(f.getClass().getSimpleName()){
			case "Kreis":
				wo.setSelectedIndex(0);
				this.xkor.setText(""+f.getXkor());
				this.ykor.setText(""+f.getYkor());
				this.cc.setColor(f.getFarbe());
				this.zu1.setText(""+((Kreis) (f)).getRadius());
				this.cb.setSelected(f.getGefuellt());
				break;
			case "Rechteck":
				wo.setSelectedIndex(1);
				this.xkor.setText(""+f.getXkor());
				this.ykor.setText(""+f.getYkor());
				this.cc.setColor(f.getFarbe());
				this.zu1.setText(""+((Rechteck) (f)).getLaenge());
				this.zu2.setText(""+((Rechteck) (f)).getBreite());
				this.cb.setSelected(f.getGefuellt());
				break;
			case "Linie":
				wo.setSelectedIndex(2);
				this.xkor.setText(""+f.getXkor());
				this.ykor.setText(""+f.getYkor());
				this.cc.setColor(f.getFarbe());
				this.zu1.setText(""+((Linie) (f)).getXkor2());
				this.zu2.setText(""+((Linie) (f)).getYkor2());
				this.cb.setSelected(f.getGefuellt());
				break;
			case "Mensch":
				wo.setSelectedIndex(3);
				this.xkor.setText(""+f.getXkor());
				this.ykor.setText(""+f.getYkor());
				this.cc.setColor(f.getFarbe());
				this.zu1.setText(""+((Mensch) (f)).getSize());
				this.cb.setSelected(f.getGefuellt());
				break;
			}
			
			this.refresh();
		}
		/**
		 * Actionhandler der die Buttondruck dazu bring das es die Funktionen
		 * erfühlt die gefordert sind
		 * 
		 */
		private class ActionHandler implements ActionListener {
			/**
			 * Diese Methode wird ausgeführt wenn ein Button gedrückt wird
			 */
			@Override
			public void actionPerformed(ActionEvent event) {
				if (event.getSource() == fertig) {
					eingabe();
				}
				if (event.getSource() == bes) {
					refresh();
				}
			}
		}
		
}		