
interface Button {
    void paint();
}

interface Menu {
    void display();
}

class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("Windows button painted.");
    }
}

class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("Mac button painted.");
    }
}

class WindowsMenu implements Menu {
    @Override
    public void display() {
        System.out.println("Windows menu displayed.");
    }
}

class MacMenu implements Menu {
    @Override
    public void display() {
        System.out.println("Mac menu displayed.");
    }
}

public class Main {
    public static void main(String[] args) {
        GUIFactory factory = null;

        // Depending on the operating system, create the appropriate factory
        String os = System.getProperty("os.name").toLowerCase();
        if (os.contains("windows")) {
            factory = new WindowsGUIFactory();
        } else if (os.contains("mac")) {
            factory = new MacGUIFactory();
        } else {
            System.err.println("Unsupported operating system.");
            System.exit(-1);
        }

        // Use the factory to create the UI elements
        Button button = factory.createButton();
        button.paint();

        Menu menu = factory.createMenu();
        menu.display();
    }
}
