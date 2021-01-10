import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.XMLReader;
import org.xml.sax.Attributes;
import org.apache.xerces.parsers.SAXParser;

public class CPersonne extends DefaultHandler{
	public long IPersonne;
	public CPersonne(){super();}

	public void startDocument(){
		IPersonne=0;
	}

	public void stratElement(String uri, String local, String raw, Attributes attrs){
		if(local.equals("personne")) IPersonne++;
	}

	public static void main(String[] args) {
		try{
			CPersonne ch = new CPersonne();
			XMLReader parser = (XMLReader)new SAXParser();
			parser.setFeature
		}
	}
}