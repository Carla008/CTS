class Automobil {
    private String descriere;

    public Automobil(String descriere) {
        this.descriere = descriere;
    }

    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }
}

class MasinaFamilie extends Automobil {
    public MasinaFamilie(String descriere) {
        super(descriere);
    }
}

class MasinaElectrica extends Automobil {
    public MasinaElectrica(String descriere) {
        super(descriere);
    }
}

class MasinaSport extends Automobil {
    public MasinaSport(String descriere) {
        super(descriere);
    }
}

class DealerAuto {
    private String descriereMasinaSport;
    private String descriereMasinaFamilie;
    private String descriereMasinaElectrica;

    public DealerAuto() {
        this.descriereMasinaSport = "";
        this.descriereMasinaFamilie = "";
        this.descriereMasinaElectrica = "";
    }

    public void adaugaMasinaSport(MasinaSport masinaSport) {
        this.descriereMasinaSport += masinaSport.getDescriere() + "\n";
    }

    public void adaugaMasinaFamilie(MasinaFamilie masinaFamilie) {
        this.descriereMasinaFamilie += masinaFamilie.getDescriere() + "\n";
    }

    public void adaugaMasinaElectrica(MasinaElectrica masinaElectrica) {
        this.descriereMasinaElectrica += masinaElectrica.getDescriere() + "\n";
    }

    public String getDescriereMasinaSport() {
        return descriereMasinaSport;
    }

    public String getDescriereMasinaFamilie() {
        return descriereMasinaFamilie;
    }

    public String getDescriereMasinaElectrica() {
        return descriereMasinaElectrica;
    }
}

public class Main {
    public static void main(String[] args) {
        DealerAuto dealerAuto = new DealerAuto();
        dealerAuto.adaugaMasinaSport(new MasinaSport("Masina sport 1"));
        dealerAuto.adaugaMasinaSport(new MasinaSport("Masina sport 2"));
        dealerAuto.adaugaMasinaFamilie(new MasinaFamilie("Masina familie 1"));
        dealerAuto.adaugaMasinaElectrica(new MasinaElectrica("Masina electrica 1"));

        System.out.println(dealerAuto.getDescriereMasinaSport());
        System.out.println(dealerAuto.getDescriereMasinaFamilie());
        System.out.println(dealerAuto.getDescriereMasinaElectrica());
    }
}
