package decorator_pattern;

/**
 * Created by cuikangyuan on 2017/6/16.
 */
public class OrderLine {

    private String itenName;
    private int units;
    private double unitPrice;

    public String getItenName() {
        return itenName;
    }

    public void setItenName(String itenName) {
        this.itenName = itenName;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void printLine() {
        System.out.println(itenName + "\t" + units +  "\t" + unitPrice);
    }
}
