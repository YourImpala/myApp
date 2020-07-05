import App.Programs.Calculator.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class CalcTests {

    @Test
    public void sumOfTwoNumbers() {
        Calculator calculator = new Calculator(1, 10);
        Assert.assertEquals("Сумма должна быть равна 11", 11, calculator.add(), 0);
    }

    @Test
    public void sumOfTwoDoubleNumbers() {
        Calculator calculator = new Calculator(0.1, 0.2);
        Assert.assertEquals("Sum of two double numbers should equals 0.30", 0.30, calculator.add(), 0);
    }

    @Test
    public void differenceOfTwoNumbers() {
        Calculator calculator = new Calculator(55, -10.1);
        Assert.assertEquals("Difference of two numbers should equals 44.90", 44.90, calculator.sub(), 0);
    }


    @Test
    public void multiplyOfTwoNumbers() {
        Calculator calculator = new Calculator(-1, -0.7);
        Assert.assertEquals("Multiply of two numbers should equals 0.7", 0.70, calculator.mul(), 0);
    }

    @Test
    public void quotientOfTwoNumbers() {
        Calculator calculator = new Calculator(70, 33);
        Assert.assertEquals("Quotient of two numbers should equals 2.12", 2.12, calculator.div(), 0);
    }
}
