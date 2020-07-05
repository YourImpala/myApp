package App.Programs.Calculator;

import java.math.BigDecimal;
import java.math.RoundingMode;


/**
 * @author Dmitriy
 *@see #add()
 * @see #sub()
 * @see #mul()
 * @see #div()
 * @see #round(double)
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
        return round(this.a + this.b);
    }
    /**
     *difference of two numbers
     * @return difference of two numbers
     */
    public double sub() {
        return round(this.a - this.b);
    }
    /**
     *multiplies two numbers
     * @return product of two numbers
     */
    public double mul() {

        return round(this.a * this.b);
    }
    /**
     *divides two numbers
     * @return quotient of two numbers
     */
    public double div() {
        if ( this.b == 0) {
            throw new ArithmeticException("Cannot be divided by zero");
        }
        return round(this.a / this.b);
    }

    /**
     * round double number to template like 2.12
     * @param value number to round
     * @return rounded to #.## format number
     */
    private static double round(double value) {
        BigDecimal bd = new BigDecimal(Double.toString(value));
        bd = bd.setScale(2, RoundingMode.HALF_UP);

        return bd.doubleValue();
    }
}
