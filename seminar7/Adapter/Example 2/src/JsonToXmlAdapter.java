public class JsonToXmlAdapter implements JsonParser {
    private XmlParser xmlParser;

    public JsonToXmlAdapter(XmlParser xmlParser) {
        this.xmlParser = xmlParser;
    }

    @Override
    public void parseJson(String json) {
        String xml = convertJsonToXml(json);
        xmlParser.parseXml(xml);
    }

    private String convertJsonToXml(String json) {
        // code to convert JSON to XML goes here
        StringBuilder xmlBuilder = new StringBuilder();
        xmlBuilder.append("<root>");
        String[] parts = json.split(",");
        for (String part : parts) {
            String[] keyValue = part.split(":");
            String key = keyValue[0].trim().replaceAll("\"", "");
            String value = keyValue[1].trim().replaceAll("\"", "");
            xmlBuilder.append("<").append(key).append(">").append(value).append("</").append(key).append(">");
        }
        xmlBuilder.append("</root>");
        return xmlBuilder.toString();
    }
}
