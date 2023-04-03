public class Assistant implements PersonalSpital {
    private String name;
    private String role;

    public Assistant(String name) {
        this.name = name;
        this.role = "Assistant";
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getRole() {
        return this.role;
    }

    @Override
    public void assignTask(String task) {
        System.out.println("Assigning task '" + task + "' to " + this.role + " " + this.name);
    }
    // other specific behaviors for Assistant
}
