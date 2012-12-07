package figuren;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

/**
 * Klasse für die eigentliche Erstellung des GUI und Verarbeitung der Figuren
 * 
 * @author Alexander Rieppel
 * @version 2012-11-07  v1.1
 */
public class FigurenPanel extends JPanel {
	
	private JButton submit = new JButton("Zeichnen");
	private JTextField jtf1 = new JTextField(),jtf2 = new JTextField(); //Textfelder für X- und Y-Koordinate
	private JPanel p1,p2,p3,p4,hp;
	private ArrayList<Figur> ALF = new ArrayList<Figur>();//Collection zur Verwaltung und Speicherung der Figuren
	private String[] names = new String[5];
	private JComboBox jcb;//Drop-Down Menu
	private JLabel jl1 = new JLabel("X:"),jl2 = new JLabel("Y:");
	private JColorChooser jcc= new JColorChooser();//GUI-Element zur Auswahl der Farbe
	
	/**
	 * Konstruktor für das GUI und die Grafischen Elemente der dann alles zu einem zusammenfügt
	 */
	public FigurenPanel() {
		hp=new JPanel();
		hp.setLayout(new BorderLayout());
		names[0]="--Figur wählen--";
		names[1]="Rechteck";
		names[2]="Dreieck";
		names[3]="Oval";
		names[4]="Polygon";
		jcb = new JComboBox(names);
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		p4 = new JPanel(); 
		p1.setLayout(new GridLayout(15,1));
		p2.setLayout(new BorderLayout());
		p3.setLayout(new BorderLayout());
		p4.setLayout(new FlowLayout());
		
		jtf1.setToolTipText("Geben Sie eine Koordinate für x ein!");
		jtf2.setToolTipText("Geben Sie eine Koordinate für y ein!");
		jcc.setColor(Color.BLACK);//Standardfarbe Schwarz
		p2.setBackground(Color.WHITE);
		submit.addActionListener(new ActionHandler());
		
		p1.add(jcb);
		p4.add(jcc);
		p4.add(submit);
		p1.add(jl1);
		p1.add(jtf1);
		p1.add(jl2);
		p1.add(jtf2);
		hp.add(p1,BorderLayout.WEST);
		hp.add(p2,BorderLayout.CENTER);
		hp.add(p3,BorderLayout.EAST);
		hp.add(p4,BorderLayout.SOUTH);
		this.setLayout(new BorderLayout());
		this.add(hp,BorderLayout.CENTER);
	}
	
	/**
	 * Erstellt auf Knopfdruck Figuren und zeichnet sie innerhalb der weißen Fläche im GUI
	 */
	private class ActionHandler implements ActionListener {
		
		/**
		 * Sobald der "Zeichnen"-Button gedrückt wird, führt sich folgende Methode aus.
		 * Sie ist dafür zuständig, dass Figuren erzeugt werden und ohne Fehler 
		 * ihren Platz auf der weißen Fläche finden.
		 * 
		 * Werden ungültige Werte in die Textfelder eingegeben oder eine Koordinate außerhalb des sichtbaren 
		 * Bereichs definiert, wird eine entsprechende Fehlermeldung angezeigt.
		 * 
		 * Es ist bei jeder Figur der gleiche Ablauf.
		 */
		@Override
		public void actionPerformed(ActionEvent arg0) {
			if(arg0.getSource() == submit) {
				
				
				//Rechteck
				
				
				if(jcb.getSelectedItem().toString() == "Rechteck"){
					Rechteck r;
					try{
					r = new Rechteck(p2.getX()+Integer.parseInt(jtf1.getText()),p2.getY()+Integer.parseInt(jtf2.getText()), jcc.getColor());
					//Eingegebene Werte und die Farbe wird geholt und mit diesen ein neues Rechteck-Objekt erzeugt
					if(Integer.parseInt(jtf1.getText()) < p2.getWidth()-150){
						if(Integer.parseInt(jtf2.getText()) < p2.getHeight()-150){
							if(Integer.parseInt(jtf1.getText())>=0&&Integer.parseInt(jtf2.getText())>=0){
							r.draw(getGraphics());//Nur wenn die Figur im sichtbaren Bereich wäre wird sie gezeichnet
							ALF.add(r);//Figur wird gespeichert
							jtf1.setText("");//Die Textfelder und das Drop Down Menu werden wieder zurückgesetzt
							jtf2.setText("");
							jcb.setSelectedIndex(0);
							}else{
								JOptionPane.showMessageDialog(null, "Bitte zulässige Werte eingeben!", "Fehler", JOptionPane.ERROR_MESSAGE);
							}
						}else{
							JOptionPane.showMessageDialog(null, "Koordinate liegt außerhalb des Bereichs.\n" +
									"Bitte nur Y-Koordinaten kleiner als " + (p2.getHeight()-150), "Fehler", JOptionPane.ERROR_MESSAGE);
							//Wenn y außerhalb des Bereichs liegt
						}
					}else{
						JOptionPane.showMessageDialog(null, "Koordinate liegt außerhalb des Bereichs.\n" +
								"Bitte nur X-Koordinaten kleiner als " + (p2.getWidth()-150), "Fehler", JOptionPane.ERROR_MESSAGE);
						//Wenn x außerhalb des Bereichs liegt
					}
					}catch(NumberFormatException e){ //Wenn ungültige Werte eingegeben werden, wird eine Exception geworfen
						JOptionPane.showMessageDialog(null, "Bitte zulässige Werte eingeben!", "Fehler", JOptionPane.ERROR_MESSAGE);
					}
					
				}
				
				
				//Dreieck
				
				
				if(jcb.getSelectedItem().toString() == "Dreieck"){
					Dreieck d;
					try{
						d = new Dreieck(p2.getX()+Integer.parseInt(jtf1.getText()),p2.getY()+Integer.parseInt(jtf2.getText()), jcc.getColor());
						if(Integer.parseInt(jtf1.getText()) < p2.getWidth()-180){
							if(Integer.parseInt(jtf2.getText()) < p2.getHeight()-180){
								if(Integer.parseInt(jtf1.getText())>=0&&Integer.parseInt(jtf2.getText())>=0){
								d.draw(getGraphics());
								ALF.add(d);
								jtf1.setText("");
								jtf2.setText("");
								jcb.setSelectedIndex(0);
								}else{
									JOptionPane.showMessageDialog(null, "Bitte zulässige Werte eingeben!", "Fehler", JOptionPane.ERROR_MESSAGE);
								}
							}else{
								JOptionPane.showMessageDialog(null, "Koordinate liegt außerhalb des Bereichs.\n" +
										"Bitte nur Y-Koordinaten kleiner als " + (p2.getHeight()-180), "Fehler", JOptionPane.ERROR_MESSAGE);
							}
						}else{
							JOptionPane.showMessageDialog(null, "Koordinate liegt außerhalb des Bereichs.\n" +
									"Bitte nur X-Koordinaten kleiner als " + (p2.getWidth()-180), "Fehler", JOptionPane.ERROR_MESSAGE);
							
						}
						}catch(NumberFormatException e){
							JOptionPane.showMessageDialog(null, "Bitte zulässige Werte eingeben!", "Fehler", JOptionPane.ERROR_MESSAGE);
						}
				}
				
				
				//Oval
				
				
				if(jcb.getSelectedItem().toString() == "Oval"){
					Oval o;
					try{
						o = new Oval(p2.getX()+Integer.parseInt(jtf1.getText()),p2.getY()+Integer.parseInt(jtf2.getText()), jcc.getColor());
						if(Integer.parseInt(jtf1.getText()) < p2.getWidth()-150){
							if(Integer.parseInt(jtf2.getText()) < p2.getHeight()-150){
								if(Integer.parseInt(jtf1.getText())>=0&&Integer.parseInt(jtf2.getText())>=0){
									o.draw(getGraphics());
									ALF.add(o);
									jtf1.setText("");
									jtf2.setText("");
									jcb.setSelectedIndex(0);
									}else{
										JOptionPane.showMessageDialog(null, "Bitte zulässige Werte eingeben!", "Fehler", JOptionPane.ERROR_MESSAGE);
									}
							}else{
								JOptionPane.showMessageDialog(null, "Koordinate liegt außerhalb des Bereichs.\n" +
										"Bitte nur Y-Koordinaten kleiner als " + (p2.getHeight()-150), "Fehler", JOptionPane.ERROR_MESSAGE);
							}
						}else{
							JOptionPane.showMessageDialog(null, "Koordinate liegt außerhalb des Bereichs.\n" +
									"Bitte nur X-Koordinaten kleiner als " + (p2.getWidth()-150), "Fehler", JOptionPane.ERROR_MESSAGE);
							
						}
						}catch(NumberFormatException e){
							JOptionPane.showMessageDialog(null, "Bitte zulässige Werte eingeben!", "Fehler", JOptionPane.ERROR_MESSAGE);
						}
				}
				
				
				//Polygon
				
				
				if(jcb.getSelectedItem().toString() == "Polygon"){
					Polygon p;
					try{
						p = new Polygon(p2.getX()+Integer.parseInt(jtf1.getText()),p2.getY()+Integer.parseInt(jtf2.getText()), jcc.getColor());
						if(Integer.parseInt(jtf1.getText()) < p2.getWidth()-180){
							if(Integer.parseInt(jtf2.getText()) < p2.getHeight()-180){
								if(Integer.parseInt(jtf1.getText())>=0&&Integer.parseInt(jtf2.getText())>=0){
									p.draw(getGraphics());
									ALF.add(p);
									jtf1.setText("");
									jtf2.setText("");
									jcb.setSelectedIndex(0);
									}else{
										JOptionPane.showMessageDialog(null, "Bitte zulässige Werte eingeben!", "Fehler", JOptionPane.ERROR_MESSAGE);
									}
							}else{
								JOptionPane.showMessageDialog(null, "Koordinate liegt außerhalb des Bereichs.\n" +
										"Bitte nur Y-Koordinaten kleiner als " + (p2.getHeight()-180), "Fehler", JOptionPane.ERROR_MESSAGE);
							}
						}else{
							JOptionPane.showMessageDialog(null, "Koordinate liegt außerhalb des Bereichs.\n" +
									"Bitte nur X-Koordinaten kleiner als " + (p2.getWidth()-180), "Fehler", JOptionPane.ERROR_MESSAGE);
							
						}
						}catch(NumberFormatException e){
							JOptionPane.showMessageDialog(null, "Bitte zulässige Werte eingeben!", "Fehler", JOptionPane.ERROR_MESSAGE);
						}
				}
			}
		}
	}

	/**
	 * Getter- und Setter-Methoden
	 */
	public JButton getSubmit() {
		return submit;
	}

	public void setSubmit(JButton submit) {
		this.submit = submit;
	}

	public JTextField getJtf1() {
		return jtf1;
	}

	public void setJtf1(JTextField jtf1) {
		this.jtf1 = jtf1;
	}

	public JTextField getJtf2() {
		return jtf2;
	}

	public void setJtf2(JTextField jtf2) {
		this.jtf2 = jtf2;
	}

	public JPanel getP1() {
		return p1;
	}

	public void setP1(JPanel p1) {
		this.p1 = p1;
	}

	public JPanel getP2() {
		return p2;
	}

	public void setP2(JPanel p2) {
		this.p2 = p2;
	}

	public JPanel getP3() {
		return p3;
	}

	public void setP3(JPanel p3) {
		this.p3 = p3;
	}

	public JPanel getP4() {
		return p4;
	}

	public void setP4(JPanel p4) {
		this.p4 = p4;
	}

	public JPanel getHp() {
		return hp;
	}

	public void setHp(JPanel hp) {
		this.hp = hp;
	}

	public ArrayList<Figur> getALF() {
		return ALF;
	}

	public void setALF(ArrayList<Figur> aLF) {
		ALF = aLF;
	}

	public String[] getNames() {
		return names;
	}

	public void setNames(String[] names) {
		this.names = names;
	}

	public JComboBox getJcb() {
		return jcb;
	}

	public void setJcb(JComboBox jcb) {
		this.jcb = jcb;
	}

	public JLabel getJl1() {
		return jl1;
	}

	public void setJl1(JLabel jl1) {
		this.jl1 = jl1;
	}

	public JLabel getJl2() {
		return jl2;
	}

	public void setJl2(JLabel jl2) {
		this.jl2 = jl2;
	}

	public JColorChooser getJcc() {
		return jcc;
	}

	public void setJcc(JColorChooser jcc) {
		this.jcc = jcc;
	}
}
