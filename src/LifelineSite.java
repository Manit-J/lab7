public class LifelineSite extends Site {

    private int _units = 15;
    private double _rate = 1.5;

    private static double getTaxAmount(double base) {
        double tax = base * Site.TAX_RATE * 0.2;
        return tax;
    }

    private double getBaseAmount() {
        double base = _units * _rate * 0.5;
        return base;
    }
}
