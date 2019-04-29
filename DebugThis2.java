/**
 * Created by chuprii on 4/5/19.
 * Recursion.
 *
 * IntelliJ debugging demo 2.
 */
public class DebugThis2 {

    public static void main(String[] args)
    {
        int n = 5;
        int result = fun(n);
        int sum = 0;

        for(int i = 0; i <= n; i++)
        {
            sum += i;
        }

        System.out.printf("fun(%d)\nreturns: %d\nexpected to return: %d", n, result, sum);
    }

    /**
     * Returns the sum of positive integers from 0 to n
     * @param n Positive integer value.
     * @return The sum of integers from 0 to n, if n is positive.
     *         Otherwise, returns 0.
     */
    private static int fun(int n)
    {
        if(n<=1)
            return 0;
        else
        {
            return n+fun(n-1);
        }
    }
}



