import java.util.Date;

// Prescription interface
interface Prescription {
    boolean isExpired();
}

// Prescription implementation
class PrescriptionImpl implements Prescription {
    private Date expiryDate;

    public PrescriptionImpl(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public boolean isExpired() {
        return new Date().after(expiryDate);
    }
}

// Medicine interface
interface Medicine {
    void purchase(Prescription prescription);
}

// Medicine implementation
class MedicineImpl implements Medicine {
    private String name;

    public MedicineImpl(String name) {
        this.name = name;
    }

    @Override
    public void purchase(Prescription prescription) {
        if (prescription != null && !prescription.isExpired()) {
            System.out.println("Medicine " + name + " purchased with prescription.");
        } else {
            System.out.println("Medicine " + name + " cannot be purchased without a valid prescription.");
        }
    }
}

// Factory interface
interface MedicineFactory {
    Medicine createMedicine(String name);
}

// Factory implementation
class PrescriptionMedicineFactory implements MedicineFactory {
    private Prescription prescription;

    public PrescriptionMedicineFactory(Prescription prescription) {
        this.prescription = prescription;
    }

    @Override
    public Medicine createMedicine(String name) {
        return new MedicineImpl(name) {
            @Override
            public void purchase(Prescription prescription) {
                super.purchase(PrescriptionMedicineFactory.this.prescription);
            }
        };
    }
}


public class Main {
    public static void main(String[] args) {
        Prescription prescription = new PrescriptionImpl(new Date(2023, 3, 1));
        MedicineFactory factory = new PrescriptionMedicineFactory(prescription);

        Medicine medicine1 = factory.createMedicine("Paracetamol");
        medicine1.purchase(prescription);

        Medicine medicine2 = factory.createMedicine("Ibuprofen");
        medicine2.purchase(null);
    }
}