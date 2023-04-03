public enum DrugCategory {
    COLD("Cold"),
    PAIN("Pain"),
    BODY("Body");

    private final String name;

    DrugCategory(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static DrugCategory fromName(String name) {
        for (DrugCategory category : values()) {
            if (category.getName().equalsIgnoreCase(name)) {
                return category;
            }
        }
        return null;
    }
}
