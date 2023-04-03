public class Main {
    public static void main(String[] args) {
        Invoice invoice = new Invoice.Builder()
                .setNumberBags(2)
                .setPaymentWithCard(true)
                .setCardFidelity(false)
                .setVatRate(0.21)
                .build();

        System.out.println("Invoice details:");
        System.out.println("Number of bags: " + invoice.getNumberBags());
        System.out.println("Payment with card: " + invoice.isPaymentWithCard());
        System.out.println("Card fidelity: " + invoice.isCardFidelity());
        System.out.println("VAT rate: " + invoice.getVatRate());

    }
}