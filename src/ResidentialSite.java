public class ResidentialSite extends Site {

    private int _units = 10;
    private double _rate = 2.5;

    private static double getTaxAmount(double base) {
        double tax = base * Site.TAX_RATE;
        return tax;
    }

    private double getBaseAmount() {
        double base = _units * _rate;
        return base;
    }
}
