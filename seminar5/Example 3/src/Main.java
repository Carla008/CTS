public class Main {
    public static void main(String[] args) {
        // Create a Windows GUI
        GUIFactory factory = new WindowsGUIFactory();
        Button button = factory.createButton();
        button.paint();
        TextBox textBox = factory.createTextBox();
        textBox.paint();

        // Create a Mac GUI
        factory = new MacGUIFactory();
        button = factory.createButton();
        button.paint();
        textBox = factory.createTextBox();
        textBox.paint();
    }
}
