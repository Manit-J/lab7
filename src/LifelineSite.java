public class LifelineSite {

    private int _units = 15;
    private double _rate = 1.5;

    public double getBillableAmount(){
        double base = _units * _rate * 0.5;
        double tax = base * Site.TAX_RATE * 0.2;
        return base + tax;
    }
}
