public class IntermediateLayer {
    private static IntermediateLayer instance;
    private InvoicePrintingSoftware invoicePrintingSoftware;

    private IntermediateLayer(InvoicePrintingSoftware invoicePrintingSoftware) {
        this.invoicePrintingSoftware = invoicePrintingSoftware;
    }

    public static synchronized IntermediateLayer getInstance(InvoicePrintingSoftware invoicePrintingSoftware) {
        if (instance == null) {
            instance = new IntermediateLayer(invoicePrintingSoftware);
        }
        return instance;
    }

    public void printInvoice() {
        invoicePrintingSoftware.printInvoice();
    }
}
