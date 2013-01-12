package xml;

import java.io.IOException;

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
			doc = builder.parse("C://flughaefen.xml");
		} catch (SAXException | IOException | ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		xPathfactory = XPathFactory.newInstance();
		xpath = XPathFactory.newInstance().newXPath();

	}

	public void execute(String xPathCode) throws TransformerException,
			XPathExpressionException {

		// XPath Query for showing all nodes value
		expr = xpath.compile(xPathCode);
		nodes = (NodeList) expr.evaluate(doc, XPathConstants.NODESET);

	}

	public String display() {
		String s = "";
		for (int i = 0; i < nodes.getLength(); i++) {
			s += nodes.item(i).getNodeValue() + "\n";
		}
		return s;
	}
}
