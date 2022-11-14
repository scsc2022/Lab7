public class ResidentialSite extends Site {
    private double units;
    private double rate;
    private double TAX_RATE;

    public ResidentialSite(double units, double rate, double TAX_RATE){
        this.units = units;
        this.rate = rate;
        this.TAX_RATE = TAX_RATE;

    }
    public double getBillableAmount(double units, double rate){
        double base = units * rate * 0.5;
        double tax = base * Site.TAX_RATE * 0.2;
        return base + tax;

    }
}
