public class Main {
    public static void main(String[] args) {
        AnimalFactory dogFactory = new DogFactory();
        AnimalFactory catFactory = new CatFactory();
        AnimalFactory birdFactory = new BirdFactory();

        Animal dog = dogFactory.createAnimal();
        dog.makeSound();

        Animal cat = catFactory.createAnimal();
        cat.makeSound();

        Animal bird = birdFactory.createAnimal();
        bird.makeSound();

    }
}
