package SweetGift;

/**
 * @author Dmitriy
 * @see SweetGift.Sweets
 * @see #toString()
 */
public class Candy extends Sweets{

    private String flavor;
    /**
     * @param name name of product
     * @param price price of product
     * @param weight weight of product
     * @param flavor flavor of product
     */
    public Candy(String name, double price, double weight, String flavor) {
        super(name, price, weight);
        this.flavor = flavor;
    }

    @Override
    public String toString() {
        return super.toString() + " flavor: " + flavor;
    }
}
