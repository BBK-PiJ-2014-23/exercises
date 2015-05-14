

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class sdf.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MemoizedFibonacciTester
{
    double start;
    MemoizedFibonacci fib;
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        start = System.currentTimeMillis();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
        System.out.println(System.currentTimeMillis() - start);
    }
    
    /**
     * 
     */
    @Test
    public void regularFibonacci() {
        System.out.println(MemoizedFibonacci.fib(40));
        System.out.println(MemoizedFibonacci.fib(45));
    }
    
    /**
     * 
     */
    @Test
    public void memoizedFibonacci() {
        MemoizedFibonacci fib = new MemoizedFibonacci();
        System.out.println(fib.fibMemo(40));
        MemoizedFibonacci fib2 = new MemoizedFibonacci();
        System.out.println(fib2.fibMemo(45));
    }
}
