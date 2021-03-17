import org.junit.*;

import static org.junit.Assert.*;


public class AppTest {

    private App calculator;

    @Before
    public void setUp(){
        calculator = new App();
    }

    @Test
    public void truePositiveSqrt(){
        double operand = 9;
        double actual = 3;
//        System.out.println("Checking square root of 9");
        assertEquals(calculator.sqrt(operand), actual, 0.2f);
    }

    @Test
    public void truePositiveFactorial(){
        int operand = 6;
        int actual = 720;
//        System.out.println("Checking square root of 9");
        assertEquals(calculator.factorial(operand), actual, 0.2f);
    }

    @Test
    public void truePositiveNLog(){
        double operand = 2.71;
        double actual = 0.99694;
//        System.out.println("Checking square root of 9");
        assertEquals(calculator.nLog(operand), actual, 0.2f);
    }

    @Test
    public void truePositivePower(){
        double operandX = 5.1;
        double operandY = 3;
        double actual = 132.651;
//        System.out.println("Checking square root of 9");
        assertEquals(calculator.power(operandX, operandY), actual, 0.2f);
    }

}

