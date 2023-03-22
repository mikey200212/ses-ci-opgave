import org.example.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class TestCalculator {
    @Test
    public void TestCalculatorPlus() {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(5, calculator.calculate(1,4));
    }

}
