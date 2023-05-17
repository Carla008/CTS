import Composite.*;

public class Main {
    public static void main(String[] args) {
        Component button1 = new Button();
        Component button2 = new Button();
        Component campText = new TextField();

        Panel panou = new Panel();
        panou.adaugaComponenta(button1);
        panou.adaugaComponenta(button2);
        panou.adaugaComponenta(campText);
        panou.render();

    }
}