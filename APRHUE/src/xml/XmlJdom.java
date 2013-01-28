package xml;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

/**
 * Holt sich die XML Datei und gibt es mit der Methode start() aus
 * 
 * @author RIEPPEL,DIMITRIJEVIC,ALY
 * @version 2013-01-10
 */
public class XmlJdom {
	public static String start() {
		String s = null;
		SAXBuilder builder = new SAXBuilder();
		File xmlFile = new File("C:\\Users\\Public\\flughaefen.xml");

		try {

			Document document = (Document) builder.build(xmlFile);
			Element rootNode = document.getRootElement();
			List list = rootNode.getChildren("Flughafen");

			for (int i = 0; i < list.size(); i++) {

				Element node = (Element) list.get(i);

				s += "Name: " + node.getChildText("Name") + "\n";
				s += "Stadt: " + node.getChildText("Stadt") + "\n";
				s += "Land: " + node.getChildText("Land") + "\n";
				s += "IATA: " + node.getChildText("IATA") + "\n";
				s += "\n";

			}

		} catch (IOException io) {
			System.out.println(io.getMessage());
		} catch (JDOMException jdomex) {
			System.out.println(jdomex.getMessage());
		}
		return s;
	}

}
