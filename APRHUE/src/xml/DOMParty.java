package xml;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
 
public class DOMParty {
	public static void main(String[] args) {
 
	  SAXBuilder builder = new SAXBuilder();
	  File xmlFile = new File("C:\\Users\\Public\\Flughafen.xml");
 
	  try {
 
		Document document = (Document) builder.build(xmlFile);
		Element rootNode = document.getRootElement();
		List list = rootNode.getChildren("Flughafen");
		Element ho = (Element) list.get(1);
		Element party = document.getRootElement();
		Element albert = party.getChild( "Flughafen" );
		List albertInfo = albert.getContent();
		Element wasser = new Element( "Name" );
		wasser.removeContent( );
		wasser.addContent("Hi");
		System.out.println("hi"+ wasser.getText());
		for (int i = 0; i < list.size(); i++) {
 
		   Element node = (Element) list.get(i);
 
		   System.out.println("Name : " + node.getChildText("Name"));
		   System.out.println("Stadt : " + node.getChildText("Stadt"));
		   System.out.println("Land : " + node.getChildText("Land"));
		   System.out.println("IATA : " + node.getChildText("IATA"));
 
		}
 
	  } catch (IOException io) {
		System.out.println(io.getMessage());
	  } catch (JDOMException jdomex) {
		System.out.println(jdomex.getMessage());
	  }
	}
}