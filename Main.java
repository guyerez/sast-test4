import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class Main {
    private static DocumentBuilderFactory documentBuilderFactory;

    static {
  
        documentBuilderFactory = DocumentBuilderFactory.newInstance();
    }

    public void blah() {
        // generate garbage code that does nothing. At least 10 lines
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
    
    public static DocumentBuilder getDocumentBuilder() throws ParserConfigurationException {
        return documentBuilderFactory.newDocumentBuilder();
    }

}
