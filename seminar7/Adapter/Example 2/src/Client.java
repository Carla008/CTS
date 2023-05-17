public class Client {
    public static void main(String[] args) {
        XmlParser xmlParser = new XmlParser();
        JsonParser jsonParser = new JsonToXmlAdapter(xmlParser);
        jsonParser.parseJson("{ \"name\": \"John\", \"age\": 30 }");
    }
}
