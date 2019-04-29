/**
 * Created by chuprii on 4/5/19.
 * FizzBuzz.
 *
 * IntelliJ debugging demo 1.
 */
public class DebugThis1 {

    public static void main(String[] args)
    {
        System.out.println("Don't worry about this.");
        int[] testCases = {1, 3, 5, 15, 45};

        for(int test: testCases)
        {

            System.out.printf("\nfun(%d): \n", test);
            fun(test);
        }
    }

    /**
     * Prints "Fizz" if an integer is divisible by 3.
     * Prints "Buzz" if an integer is divisible by 5.
     * Prints "FizzBuzz" if an integer is divisible by both 3 and 5.
     * Prints "No." if an integer is not divisible by 3 or 5.
     *
     * @param n The integer in question.
     */
    private static void fun(int n)
    {
        if(n % 15 == 0)
            System.out.println("FizzBuzz");
        if(n % 3 == 0)
            System.out.println("Fizz");
        if(n % 5 == 0)
            System.out.println("Buzz");
        else
            System.out.println("No.");
    }
}
