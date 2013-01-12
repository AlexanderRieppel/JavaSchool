package xml;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

import javax.swing.*;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.xpath.XPathExpressionException;

import org.xml.sax.SAXException;

/**
 * Klasse die eine grafische Oberfläche erstellt, ein Label, einen JButton mit
 * Bild und einen JToggleButton mit Bild enthält.
 * 
 * @author RIEPPEL
 * @version 2011-10-16
 */
public class XMLGUI extends JPanel {
	private XPathDemo xpath;
	private JButton exe = new JButton("Execute");
	private JButton sav = new JButton("Save");
	private JTextField tf1 = new JTextField();
	private JLabel l1 = new JLabel("Result:"), l2 = new JLabel(
			"XPath Command here:");
	private JTextArea ta;
	private JScrollPane sbrText;

	/**
	 * Erstellt die graphische Oberfläche
	 */
	public XMLGUI() {
		this.setLayout(new GridLayout(6, 1));

		xpath = new XPathDemo();

		exe.addActionListener(new ActionHandler());
		sav.addActionListener(new ActionHandler());
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
	}

	/**
	 * Klasse mit dem ActionHandler für die Buttons
	 */
	private class ActionHandler implements ActionListener {
		/**
		 * Wenn der JToggleButton gedrückt wird, wird je nach Wert der
		 * Zählvariable der Button deaktiviert oder aktiviert
		 * 
		 * @param arg0
		 *            wird für das Ereignis bei einem Button-Druck benötigt
		 */
		@Override
		public void actionPerformed(ActionEvent arg0) {
			if (arg0.getSource() == exe) {
				try {
					xpath.execute(tf1.getText());
				} catch (TransformerException | XPathExpressionException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				ta.setText(xpath.display());
			}
		}
	}

	private class TextHandler implements TextListener {
		/**
		 * 
		 * 
		 * @param arg0
		 */
		@Override
		public void textValueChanged(TextEvent arg0) {

		}
	}
}
