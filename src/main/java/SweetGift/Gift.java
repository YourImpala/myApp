package SweetGift;

/**
 * @author Dmitriy
 * @see #getTotalPrice(Sweets[])
 * @see #getTotalWeight(Sweets[])
 * @see #showBoxContents(Sweets[])
 */
public class Gift {
    public static void main(String[] args) {
        Cake cake = new Cake("Napaleon", 100, 0.5, "medium");
        Candy candy = new Candy("Lollipop", 10, 0.1, "Barbaris");
        Jellybeans jellybeans = new Jellybeans("Sharliz", 55, 0.4 , "orange");

        Sweets[] box = new Sweets[]{cake, candy, jellybeans};

        System.out.println("Total price is: " + getTotalPrice(box));
        System.out.println("Total weight is: " + getTotalWeight(box));
        System.out.println("The box contains:");
        showBoxContents(box);

    }

    /**
     * print all sweets to console
     * @param box array with all sweets
     */
    private static void showBoxContents(Sweets[] box) {
        for (Sweets sweet: box) {
            System.out.println(sweet.toString());
        }
    }

    /**
     * sum weight of all sweets
     * @param box array with all sweets
     * @return sum of weights
     */
    private static double getTotalWeight(Sweets[] box) {
        double totalWeight = 0;
        for (Sweets sweet: box) {
            totalWeight += sweet.getWeight();
        }

        return totalWeight;
    }

    /**
     * sum price of all sweets
     * @param box array with all sweets
     * @return sum of price
     */
    private static double getTotalPrice(Sweets[] box) {
        double totalPrice = 0;
        for (Sweets sweet: box) {
            totalPrice += sweet.getPrice();
        }

        return totalPrice;
    }
}
