public class Site {
    public static double TAX_RATE = 5.0;

    public double getBillableAmount() {
        return getBaseAmount() + getTaxAmount();
    }

    private double getBaseAmount() {
        return 0;
    }

    private double getTaxAmount() {
        return 0;
    }
}
