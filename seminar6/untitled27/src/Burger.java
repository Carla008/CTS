public class Burger {
    private String bun;
    private String meat;
    private String condiments;
    private String vegetables;

    public Burger(String bun, String meat, String condiments, String vegetables) {
        this.bun = bun;
        this.meat = meat;
        this.condiments = condiments;
        this.vegetables = vegetables;
    }

    // getters and setters for all fields (optional)
    public String getBun() {
        return bun;
    }

    public void setBun(String bun) {
        this.bun = bun;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public String getCondiments() {
        return condiments;
    }

    public void setCondiments(String condiments) {
        this.condiments = condiments;
    }

    public String getVegetables() {
        return vegetables;
    }

    public void setVegetables(String vegetables) {
        this.vegetables = vegetables;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "bun='" + bun + '\'' +
                ", meat='" + meat + '\'' +
                ", condiments='" + condiments + '\'' +
                ", vegetables='" + vegetables + '\'' +
                '}';
    }

    // Builder class
    public static class BurgerBuilder {
        private String bun;
        private String meat;
        private String condiments;
        private String vegetables;

        public BurgerBuilder setBun(String bun) {
            this.bun = bun;
            return this;
        }

        public BurgerBuilder setMeat(String meat) {
            this.meat = meat;
            return this;
        }

        public BurgerBuilder setCondiments(String condiments) {
            this.condiments = condiments;
            return this;
        }

        public BurgerBuilder setVegetables(String vegetables) {
            this.vegetables = vegetables;
            return this;
        }

        public Burger build() {
            if (bun == null || meat == null || condiments == null || vegetables == null) {
                throw new IllegalStateException("Cannot create Burger object with null fields");
            }
            return new Burger(bun, meat, condiments, vegetables);
        }
    }
}
