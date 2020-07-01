package SweetGift;

/**
 * @author Dmitriy
 * @see SweetGift.Sweets
 * @see #toString()
 */
public class Jellybeans extends Sweets{

    private String color;

    /**
     * @param name name of product
     * @param price price of product
     * @param weight weight of product
     * @param color color of product
     */
    public Jellybeans(String name, double price, double weight, String color) {
        super(name, price, weight);
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + " color: " + color;
    }
}
