public class Main {
    public static void main(String[] args) {
        ProductionMonitoringSystem system = ProductionMonitoringSystem.getInstance("localhost", 8080);

        Machine machine1 = new Machine("M001", "Model A", 100);
        Machine machine2 = new Machine("M002", "Model B", 200);
        Machine machine3 = new Machine("M003", "Model C", 300);

        system.addMachine(machine1);
        system.addMachine(machine2);
        system.addMachine(machine3);

        System.out.println("Added machines:");
        for (Machine machine : system.getAllMachines()) {
            System.out.println(machine);
        }

        Machine machine2Updated = new Machine("M002", "Model B (updated)", 250);
        system.modifyMachine(machine2Updated);

        System.out.println("Updated machine:");
        System.out.println(system.getMachine("M002"));
    }
}
