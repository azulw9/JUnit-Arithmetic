package ua.epam;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by supervisor on 07.09.2016.
 */
public class ArithmOperTest {
    private static ArithmOper ar;
    @BeforeClass
    public static void start()
    {
        ar = new ArithmOper();
    }

    @Test
    public void add() throws Exception {
        Assert.assertEquals(10, ar.Add(4,6));
    }

    @Test
    public void sub() throws Exception {
        Assert.assertEquals(4, ar.Sub(10,6));
    }

    @Test
    public void mul() throws Exception {
        Assert.assertEquals(24, ar.Mul(4,6));
    }

    @Test
    public void div() throws Exception {
        Assert.assertEquals(80, ar.Div(400,5));
    }

    @Test(expected=ArithmeticException.class)
    public void divByZero(){
        int y = ar.Div(400,0);

    }

    @Test(timeout=1)
    public void mulTime()
    {
        int t = ar.Mul(2934,36904);
        System.out.println(t);
    }

    @Test
    public void mulBigNegativeResult() //попытка написать негативный тест, который не валится
    {
        int er = ar.Mul(66234,388664);
        if (er < 0) Assert.fail("stack overflow");
        //Assert.assertEquals("","");
    }

}