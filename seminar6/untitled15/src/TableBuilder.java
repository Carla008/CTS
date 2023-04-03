public class TableBuilder {
    private Table table;

    public TableBuilder() {
        this.table = new Table();
    }

    public TableBuilder cleanTable() {
        table.setClean(true);
        return this;
    }

    public TableBuilder placeNapkins(int numberOfNapkins) {
        table.setNumberOfNapkins(numberOfNapkins);
        return this;
    }

    public TableBuilder placeCutlery(int numberOfCutlery) {
        table.setNumberOfCutlery(numberOfCutlery);
        return this;
    }

    public TableBuilder invitePeople(int numberOfPeople) {
        table.setNumberOfPeople(numberOfPeople);
        return this;
    }

    public Table build() {
        return table;
    }
}
