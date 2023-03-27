public class ServerConnection {
    private static ServerConnection instance = null;
    private String serverUrl;
    private int port;

    private ServerConnection(String serverUrl, int port) {
        this.serverUrl = serverUrl;
        this.port = port;
    }

    public static ServerConnection getInstance(String serverUrl, int port) {
        if (instance == null) {
            instance = new ServerConnection(serverUrl, port);
        }
        return instance;
    }
    public String showStatus() {
        return "Serverul " + serverUrl + " ruleaza pe portul: " + port;
    }
}
