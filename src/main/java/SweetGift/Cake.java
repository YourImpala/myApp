package SweetGift;

/**
 * @author Dmitriy
 * @see SweetGift.Sweets
 * @see #toString()
 */
public class Cake extends Sweets{

    private String size;
    /**
     * @param name name of product
     * @param price price of product
     * @param weight weight of product
     * @param size size of product
     */
    public Cake(String name, double price, double weight, String size) {
        super(name, price, weight);
        this.size = size;
    }

    @Override
    public String toString() {
        return super.toString() + " size: " + size;
    }
}
