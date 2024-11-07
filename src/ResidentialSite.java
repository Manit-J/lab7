public class ResidentialSite {

    private int _units = 10;
    private double _rate = 2.5;

    public double getBillableAmount(){
        double base = _units * _rate;
        double tax = base * Site.TAX_RATE;
        return base + tax;
    }
}
