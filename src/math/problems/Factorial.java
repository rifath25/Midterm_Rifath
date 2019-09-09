package math.problems;

/**
 * Created by mrahman on 04/02/18.
 */
public class Factorial {

    public static int factorialNum(int x) {
        int result;
        if (x == 1) {
            return 1;
        }

        result = factorialNum(x - 1) * x;
        return result;
    }


    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        int num = 5;
        int factorialResult = factorialNum(num);
        System.out.println("Factorial of " + num + " is: " + factorialResult);
    }
}
