/**
 * Created by chuprii on 4/5/19.
 * Exceptions.
 *
 * IntelliJ debugging demo 3.
 */
public class DebugThis3 {
    public static void main(String[] args)
    {
        int[] test = {1, -1, 2, 3, 5};
        int sum = fun(test);
        String testArrayString = arrToStr(test);


        System.out.println("Sum of the elements of " + testArrayString + ":" + sum);
    }

    /**
     * Summation of all elements in the integer array.
     * @param arr Integer array.
     * @return Sum of all elements of arr.
     */
    private static int fun(int[] arr)
    {
        int sum = 0;

        int x = 0;

        while(x <= arr.length)
        {
            sum += arr[x];
            x++;
        }

        return sum;
    }

    /**
     * Creates a String representation of an integer array.
     * @param arr Array of ints.
     * @return arr elements in the format [a, b, c, ...].
     */
    private static String arrToStr(int[] arr)
    {
        if (arr != null)
        {
            String arrayString = "[";
            for (int x : arr) {
                arrayString += x + ", ";
            }
            return arrayString.substring(0, arrayString.length() - 2) + "]";
        }
        return "[]";
    }
}
