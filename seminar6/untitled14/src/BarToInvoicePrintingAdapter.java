public class BarToInvoicePrintingAdapter implements InvoicePrintingSoftware {
    private BarSoftware barSoftware;

    public BarToInvoicePrintingAdapter(BarSoftware barSoftware) {
        this.barSoftware = barSoftware;
    }

    @Override
    public void printInvoice() {
        // Adapt the output of the new bar software to the input format expected by the existing invoice printing software
        System.out.println("Adapting output of new bar software to input format expected by existing invoice printing software");
        barSoftware.serveDrink();
    }
}
