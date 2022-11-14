public class LifelineSite extends Site {
    protected double base;
    private int units;
    private static int rate;
    private Site site;

    public LifelineSite(){
        this.units = units;
        this.rate = rate;
    }
    public double getBillableAmount(double units, double rate){
        double base = units * LifelineSite.rate * 0.5;
        double tax = base * site.TAX_RATE * 0.2;
        return base + tax;

    }
}
