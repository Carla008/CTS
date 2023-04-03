public class Table {
    private boolean isClean;
    private int numberOfNapkins;
    private int numberOfCutlery;
    private int numberOfPeople;

    public void setClean(boolean clean) {
        isClean = clean;
    }

    public void setNumberOfNapkins(int numberOfNapkins) {
        this.numberOfNapkins = numberOfNapkins;
    }

    public void setNumberOfCutlery(int numberOfCutlery) {
        this.numberOfCutlery = numberOfCutlery;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public boolean isClean() {
        return isClean;
    }

    public int getNumberOfNapkins() {
        return numberOfNapkins;
    }

    public int getNumberOfCutlery() {
        return numberOfCutlery;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }
}
