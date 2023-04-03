public class Invoice {
    private final int numberBags;
    private final boolean paymentWithCard;
    private final boolean cardFidelity;
    private final double vatRate;

    private Invoice(int numberBags, boolean paymentWithCard, boolean cardFidelity, double vatRate) {
        this.numberBags = numberBags;
        this.paymentWithCard = paymentWithCard;
        this.cardFidelity = cardFidelity;
        this.vatRate = vatRate;
    }

    public int getNumberBags() {
        return numberBags;
    }

    public boolean isPaymentWithCard() {
        return paymentWithCard;
    }

    public boolean isCardFidelity() {
        return cardFidelity;
    }

    public double getVatRate() {
        return vatRate;
    }

    public static class Builder {
        private int numberBags = 0;
        private boolean paymentWithCard = false;
        private boolean cardFidelity = false;
        private double vatRate = 0;

        public Builder setNumberBags(int numberBags) {
            this.numberBags = numberBags;
            return this;
        }

        public Builder setPaymentWithCard(boolean paymentWithCard) {
            this.paymentWithCard = paymentWithCard;
            return this;
        }

        public Builder setCardFidelity(boolean cardFidelity) {
            this.cardFidelity = cardFidelity;
            return this;
        }

        public Builder setVatRate(double vatRate) {
            this.vatRate = vatRate;
            return this;
        }

        public Invoice build() {
            return new Invoice(numberBags, paymentWithCard, cardFidelity, vatRate);
        }
    }
}
