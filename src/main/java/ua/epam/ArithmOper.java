package ua.epam;

/**
 * Created by supervisor on 07.09.2016.
 */
public class ArithmOper {

    public int Add(int a, int b)
    {
        return a+b;
    }

    public int Sub(int a, int b)
    {
        return a-b;
    }

    public int Mul(int a, int b)
    {
        if (a>0 && b>0)
        {
            if (a*b < 0) {
                System.out.println("stack overflow!!! too big numbers for integer");
                return 0;
            }
        }
        return a*b;
    }

    public int Div(int a, int b)
    {
        if (b==0) throw new ArithmeticException();
        return a / b;
    }
}
