public class Main {
    public static void main(String[] args) {
        BarSoftware barSoftware = new NewBarSoftware();
        InvoicePrintingSoftware invoicePrintingSoftware = new ExistingInvoicePrintingSoftware();
        BarToInvoicePrintingAdapter adapter = new BarToInvoicePrintingAdapter(barSoftware);
        IntermediateLayer intermediateLayer = IntermediateLayer.getInstance(adapter);
        intermediateLayer.printInvoice();

    }
}