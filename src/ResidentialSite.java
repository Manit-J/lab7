public class ResidentialSite {

    private int _units = 10;
    private double _rate = 2.5;

    public double getBillableAmount(){
        double base = getBaseAmount();
        double tax = getTaxAmount(base);
        return base + tax;
    }

    private static double getTaxAmount(double base) {
        double tax = base * Site.TAX_RATE;
        return tax;
    }

    private double getBaseAmount() {
        double base = _units * _rate;
        return base;
    }
}
