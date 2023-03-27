public class Machine {
    private final String id;
    private final String model;
    private final int productionCapacity;

    public Machine(String id, String model, int productionCapacity) {
        this.id = id;
        this.model = model;
        this.productionCapacity = productionCapacity;
    }
    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Machine{" +
                "id='" + id + '\'' +
                ", model='" + model + '\'' +
                ", productionCapacity=" + productionCapacity +
                '}';
    }
}
