package xml;

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JOptionPane;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * Klasse für XPath Verarbeitung
 * 
 * @author RIEPPEL,DIMITRIJEVIC,ALY
 * @version 2013-01-10
 */
public class XPathDemo {
	private DocumentBuilderFactory domFactory;
	private DocumentBuilder builder;
	private Document doc;
	private XPathFactory xPathfactory;
	private XPath xpath;
	private XPathExpression expr;
	private NodeList nodes;
	
	public XPathDemo() {

		domFactory = DocumentBuilderFactory.newInstance();
		domFactory.setNamespaceAware(true);

		try {

			builder = domFactory.newDocumentBuilder();
			try{
				doc = builder.parse("C://Users//Public//flughaefen.xml");
			}catch (FileNotFoundException e){
				JOptionPane.showMessageDialog(null, "Datei nicht gefunden!","Error",JOptionPane.ERROR_MESSAGE);
			}
		} catch (SAXException | IOException | ParserConfigurationException e) {
			e.printStackTrace();
		}
		xPathfactory = XPathFactory.newInstance();
		xpath = XPathFactory.newInstance().newXPath();

	}
	
	
	/**
	 * Führt ein XPath Kommndo aus und erstellt eine Liste aus den Ergebnissen
	 */
	public void execute(String xPathCode) throws TransformerException,
			XPathExpressionException {

		expr = xpath.compile(xPathCode);
		nodes = (NodeList) expr.evaluate(doc, XPathConstants.NODESET);

	}
	
	/**
	 * Zeigt die Ergebnisse an
	 */
	public String display() {
		String s = "";
		for (int i = 0; i < nodes.getLength(); i++) {
			s += nodes.item(i).getTextContent() + "\n";
		}
		return s;
	}
}
