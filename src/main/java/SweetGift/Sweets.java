package SweetGift;

/**
 * @author Dmitriy
 * @see #getPrice()
 * @see #getWeight()
 * @see #toString()
 */
public abstract class Sweets {


    private  String name;
    private  double price;
    private  double weight;
    /**
    * @param name name of product
    * @param price price of product
    * @param weight weight of product
    */
    public Sweets(String name, double price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    /**
     *
     * @return price of product
     */
    public double getPrice() {
        return  this.price;
    }

    /**
     *
     * @return weight of product
     */
    public double getWeight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return "name: " + this.name + " price: " + this.price + " weight:" + weight;
    }
}
