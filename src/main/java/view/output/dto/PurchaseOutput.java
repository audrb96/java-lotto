package view.output.dto;

public class PurchaseOutput {

    private final int purchaseCount;

    public PurchaseOutput(int purchaseCount) {
        this.purchaseCount = purchaseCount;
    }

    public int fetchPurchaseCount() {
        return this.purchaseCount;
    }
}
