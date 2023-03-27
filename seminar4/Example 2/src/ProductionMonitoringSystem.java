import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductionMonitoringSystem {
    private static ProductionMonitoringSystem instance = null;
    private String serverUrl;
    private int port;
    private final Map<String, Machine> machines;

    private ProductionMonitoringSystem(String serverUrl, int port) {
        this.serverUrl = serverUrl;
        this.port = port;
        this.machines = new HashMap<>();
    }

    public static synchronized ProductionMonitoringSystem getInstance(String serverUrl, int port) {
        if (instance == null) {
            instance = new ProductionMonitoringSystem(serverUrl, port);
        }
        return instance;
    }

    public synchronized void addMachine(Machine machine) {
        machines.put(machine.getId(), machine);
    }

    public synchronized void modifyMachine(Machine machine) {
        machines.put(machine.getId(), machine);
    }

    public synchronized Machine getMachine(String id) {
        return machines.get(id);
    }

    public synchronized List<Machine> getAllMachines() {
        return new ArrayList<>(machines.values());
    }
}
