public class Main {
    public static void main(String[] args) {
        Table table = new TableBuilder()
                .cleanTable()
                .placeNapkins(4)
                .placeCutlery(4)
                .invitePeople(4)
                .build();

        System.out.println("Table is clean: " + table.isClean());
        System.out.println("Number of napkins: " + table.getNumberOfNapkins());
        System.out.println("Number of cutlery: " + table.getNumberOfCutlery());
        System.out.println("Number of people: " + table.getNumberOfPeople());
    }
}
