package xml;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

import javax.swing.*;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.xpath.XPathExpressionException;

import org.jdom2.JDOMException;
import org.xml.sax.SAXException;

/**
 * Erstellt eine Grafische Oberfläche
 * 
 * @author RIEPPEL,DIMITRIJEVIC,ALY
 * @version 2013-01-10
 */
public class XMLGUI extends JPanel {
	private XPathDemo xpath;
	private JButton exe = new JButton("Execute");
	private JButton sav = new JButton("Start");
	private JButton rsave = new JButton("Save");
	private JTextField tf1 = new JTextField();
	private JLabel l1 = new JLabel("Result:"), l2 = new JLabel(
			"XPath Command here:");
	private JTextArea ta;
	private JScrollPane sbrText;

	/**
	 * Erstellt die grafische Oberfläche
	 */
	public XMLGUI() {
		this.setLayout(new GridLayout(7, 1));

		exe.addActionListener(new ActionHandler());
		sav.addActionListener(new ActionHandler());
		rsave.addActionListener(new ActionHandler());
		ta = new JTextArea("", 5, 50);
		ta.setLineWrap(true);
		sbrText = new JScrollPane(ta);
		sbrText.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		JPanel p2 = new JPanel(), p1 = new JPanel();
		p1.setLayout(new FlowLayout());
		p1.add(exe);
		p2.setLayout(new FlowLayout());
		p2.add(sav);
		this.add(l2);
		this.add(tf1);
		this.add(p1);
		this.add(l1);
		this.add(sbrText);
		this.add(p2);
		this.add(rsave);
	}
	
	

	/**
	 * Klasse mit dem ActionHandler für die Buttons
	 */
	private class ActionHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			if (arg0.getSource() == sav) {
				ta.setText(XmlJdom.start());

			}
			if (arg0.getSource() == rsave) {

			}
			if (arg0.getSource() == exe) {
				try {
					if (tf1.getText().equals("")) {
						ta.setText("Geben sie bitte etwas ein");
					} else {

						xpath.execute(tf1.getText());
					}
				} catch (TransformerException | XPathExpressionException e) {
					e.printStackTrace();
				}
				ta.setText(xpath.display());
			}

		}
	}
}
