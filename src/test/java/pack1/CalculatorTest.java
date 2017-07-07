package pack1;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * Created by etrok on 06.07.2017.
 */
public class CalculatorTest {
    private Calculator calculator;


    @Before
    public void Before() throws Exception {
       calculator=new Calculator();
    }

    @After
    public void After() throws Exception {
        calculator = null;
    }
    @BeforeClass
    public static void BeforeClass() throws Exception {
        System.out.println("start test");
    }

    @AfterClass
    public static void AfterClass() throws Exception {
        System.out.println("end test");
    }
    @Test
    public void testGetSum() throws Exception {
        assertEquals(20, calculator.getSum(10,10));
    }

    @Test
    public void testGetDivide() throws Exception {
        assertEquals(5, calculator.getDivide(25,5));
    }
    @Test(expected = ArithmeticException.class)
    public void test1GetDivide() {
        calculator.getDivide(25,0);
    }

    @Test
    public void testGetMultiple() throws Exception {
        assertEquals(25, calculator.getMultiple(5,5));
    }
}