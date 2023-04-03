// add more concrete soup classes here as needed
public class SoupFactory {
    public static Soup createSoup(SoupType soupType) {
        switch (soupType) {
            case VEGETABLE:
                return new VegetableSoup("Vegetable Soup", 5.99);
            case MUSHROOM:
                return new MushroomSoup("Mushroom Soup", 6.99);
            case BEEF:
                return new BeefSoup("Beef Soup", 7.99);
            // add more cases for other soup types
            default:
                throw new IllegalArgumentException("Invalid soup type");
        }
    }
}
