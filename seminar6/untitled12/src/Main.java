public class Main {
    public static void main(String[] args) {
        Soup vegetableSoup = SoupFactory.createSoup(SoupType.VEGETABLE);
        System.out.println(vegetableSoup);

        Soup mushroomSoup = SoupFactory.createSoup(SoupType.MUSHROOM);
        System.out.println(mushroomSoup);

        Soup beefSoup = SoupFactory.createSoup(SoupType.BEEF);
        System.out.println(beefSoup);
    }
}
