import java.util.ArrayList;

public abstract class Pizza {
    protected String name;

    public void prepare() {
        System.out.println("Preparing " + name);
    }

    public String getName() {
        return name;
    }
}
