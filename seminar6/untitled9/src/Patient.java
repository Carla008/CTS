public class Patient {
    private String name;
    private int age;
    private int difficultyLevel;

    public Patient(String name, int age, int difficultyLevel) {
        this.name = name;
        this.age = age;
        this.difficultyLevel = difficultyLevel;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getDifficultyLevel() {
        return difficultyLevel;
    }
}
