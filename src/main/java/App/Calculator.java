package App;

/**
 * @author Dmitriy
 *@see #add()
 * @see #sub()
 * @see #mul()
 * @see #div()
 */
public class Calculator {
    private final double a;
    private final double b;

    /**
     * @param a the first number
     * @param b the second number
     */
    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }
    /**
     * sums up two numbers
     *@return sum of two numbers
     */
    public double add() {
        return this.a + this.b;
    }
    /**
     *divides two numbers
     * @return difference of two numbers
     */
    public double sub() {
        return this.a - this.b;
    }
    /**
     *multiplies two numbers
     * @return product of two numbers
     */
    public double mul() {
        return this.a * this.b;
    }
    /**
     *divides two numbers
     * @return quotient of two numbers
     */
    public double div() {
        return this.a / this.b;
    }
}
