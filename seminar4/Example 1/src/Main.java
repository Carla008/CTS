public class Main {
    public static void main(String[] args) {
        ServerConnection serverConnection = ServerConnection.getInstance("localhost", 8080);
        String statusMessage = serverConnection.showStatus();
        System.out.println(statusMessage);

//ServerConnection server=new ServerConnection("localhost",8080);
    }
}
