package Backhausen_Dimitrijevic.Gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * Dieses GUI ist das ZeichenGui indem die Zeichnung sowie die vorhandenen Figuren in der Zeichung angezeigt wird
 * @author Daniel
 */
public class DanielGui extends JPanel {
	
		private JButton aendern,hinzufuegen,loeschen;
		private JList gzo;
		private Controller c;
		private JTextArea logger;
		private ArrayList<String> fo;
		/**
		 * KOnstruktor zum aufbauen der GUI
		 * @param c der Controller um auf die Methoden zugreifen zu können
		 * @param z die Zeichung die angezeigt werden soll
		 */
		public DanielGui(Controller c,Zeichnung z) {
			this.c = c;
			
			fo = new ArrayList();
			gzo = new JList(fo.toArray());
			
			logger = new JTextArea(10,10);
			JScrollPane sp = new JScrollPane(logger);
			logger.setEditable(false);
			
			JPanel oben= new JPanel();
			oben.setLayout(new GridLayout(1,3,10,10));
			
			aendern = new JButton("Ändern");
			hinzufuegen = new JButton("Hinzufügen");
			loeschen = new JButton("Löschen");
			
			ActionHandler a= new ActionHandler();
			hinzufuegen.addActionListener(a);
			loeschen.addActionListener(a);
			aendern.addActionListener(a);
		
			this.setLayout(new BorderLayout());
			
			oben.add(hinzufuegen);
			oben.add(aendern);
			oben.add(loeschen);
			
			this.add(z,BorderLayout.CENTER);
			this.add(oben,BorderLayout.NORTH);
			this.add(gzo,BorderLayout.EAST);
			this.add(sp,BorderLayout.SOUTH);
		}
		/**
		 * Diese Methode aktualisiert die Liste der Elemente
		 * @param list
		 */
		public void addFig(ArrayList<Figuren> list){
			fo = new ArrayList();
			for(int i = 0; i < list.size(); i++){
				fo.add((i+1) +": "+list.get(i).getClass().getSimpleName());
			}
			gzo.setListData(fo.toArray());
		}
		/**
		 * Diese Methode Fügt den Logger eine neue Nachricht hinzu
		 * @param t
		 */
		public void addLogger(String t){
			this.logger.setText(this.logger.getText() + t + "\n");
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
				if (event.getSource() == hinzufuegen) {
					c.openEdit();
				}
				if (event.getSource() == aendern) {
					c.setEdit(gzo.getSelectedIndex());
				}
				if (event.getSource() == loeschen) {
					c.deletef(gzo.getSelectedIndex());
				}
				repaint();
			}

		}

	
	}

