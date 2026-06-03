package com.amigoscode._2_developers._1_loops;

import static java.lang.Math.random;

/**
 * Loop Exercises
 *
 * Practice nested loops, break/continue statements, labeled breaks,
 * accumulators, pattern printing, reverse iteration, and controlled infinite loops.
 */
public class LoopExercises {
    /**
     * Prints a multiplication table from 1 to n using nested loops.
     * Example for n=3:
     *   1  2  3
     *   2  4  6
     *   3  6  9
     *
     * @param n the size of the multiplication table
     */
    // ntm = number to multiply

    public static void printMultiplicationTable(int n) {
        // TODO: 1 - Use nested for loops to print an n x n multiplication table.
        //  Outer loop iterates rows 1..n, inner loop iterates columns 1..n.
        //  Print each product followed by a tab, and a newline after each row.
        // int n = 3; we dont need this line since the variable n is already defined in scope in method params, consider printMultiplicationTable(5);
        for(int i = 0; i < n; i++){
            System.out.print(n);
            System.out.println();
            n++;
            for(int j = 0; j <= n; j++){ //lol
                System.out.print("  "); //tab
            }
        }
    }
    /**
     * Returns the sum of all numbers from 1 to n, but skips multiples of 3
     * and stops entirely if the running sum exceeds 100.
     *
     * @param n upper bound (inclusive)
     * @return the accumulated sum following the rules above
     */
    public static int sumWithSkipAndStop(int n) {
        int sum = 0;
        // TODO: 2 - Loop from 1 to n. Use 'continue' to skip multiples of 3.
        //  Use 'break' to stop if sum exceeds 100. Add the current number to sum otherwise.
        for (int i = 1; i <= n; i++) {

            if (i % 3 == 0) {
                continue;
            }
            if (sum + i > 100) {
                break;
            }
            sum += i;
        }
        return sum;
    }
}

/**
     * Searches a 2D array for a target value. Returns a string "Found at [row][col]"
     * or "Not found". Uses a labeled break to exit both loops once found.
     *
     * @param matrix a 2D int array
     * @param target the value to search for
     * @return description of where the target was found, or "Not found"
     */
    public static String findInMatrix(int[][] matrix, int target) {
    String result = "Not found";
        // TODO: 3 - Define a label (e.g., 'search:') before the outer loop.
        //  Use nested loops to iterate through the matrix.
        //  When the target is found, set result to "Found at [row][col]" and
        //  use 'break search;' to exit both loops.
        // In Java, a label is like a name you attach to a loop so you can break out of that specific loop.
        //A 2D array is an array of arrays.
        //matrix.length gives how many inner arrays/rows there are.
        // matrix[i].length gives how many items are inside that row.
        //int target;
    search:
    for(int i = 0; i < matrix.length; i++){
        // row iterator needs no code inside.
        //for this row, check column 0 in next loop, once done do the next row...
        for(int j = 0; j<matrix[i].length; j++){
            if(matrix[i][j] == target){
                result = ("Found at row: " + i + ", col: "+ j );
                break search;
            }
        }
    }
    return result;
}


    /*
     * Computes the factorial of n using a loop with an accumulator.
     * factorial(5) = 5 * 4 * 3 * 2 * 1 = 120
     *
     * @param n a non-negative integer
     * @return n!
    */
        public static long factorial(int n) {
            long accumulator = 1;
            // TODO: 4 - Use a for loop from 1 to n (inclusive), multiplying accumulator
            //  by the loop variable each iteration. Return the result.
            for(int i = 1; i <= n; i++){
                accumulator *= i;
            }
            return accumulator;
        }
    }
    /*
     * Prints a pyramid pattern of stars with the given number of rows.
     * Example for rows=4:
     *       *
     *      ***
     *     *****
     *    *******
     *
     * @param rows the number of rows in the pyramid
     */
    public static void printPyramid(int rows) {
        // TODO: 5 - Use nested loops to print a centered pyramid of stars.
        //  For each row i (0-based), print (rows - i - 1) spaces followed by (2 * i + 1) stars.
        //  Print a newline after each row.
        // https://www.youtube.com/watch?v=RCPof5TC-Gs&t=16s
        // Ian saw me struggle and suggested code below, i commented explanation
        for (int i = 1; i <= rows; i++) { // if i is less than 5 ++i, i1 r5
            // Print leading spaces
            for (int s = 1; s <= rows - i; s++) { // repeats printing of star, notic for loop closes to let spaces finish printing before moving to stars
                System.out.print(" ");
            }
            // Print stars: 2*i - 1 gives 1, 3, 5, 7, 9...
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println(); // new line after each row, notice for loop above is closed so stars can print out before new line
        }
    }

    /**
     * Returns elements of the array in reverse order as a comma-separated string.
     * Example: [1, 2, 3] -> "3, 2, 1"
     *
     * @param arr an array of integers
     * @return a string with elements in reverse, separated by ", "
     */
    class Main {
        public static void main(String[] args) {
            System.out.println(iterateBackwards(new int[]{1, 2, 3, 4, 5}));
        }
        public static String iterateBackwards(int[] arr) {
            StringBuilder sb = new StringBuilder();
            // TODO: 6 - Use a for loop starting from the last index down to 0.
            //  Append each element to sb. Add ", " between elements but not after the last one.
            // StringBuilder is part of Java
            // https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuilder.html
            // stringbuilder is a mutable sequence of characters.

            for(int i = arr.length - 1; i >= 0; i--){ // array's last index is legnth - 1
                sb.append(arr[i] + ", ");
            }
            return sb.toString();
        }
    }

    /**
     * Simulates a simple number guessing scenario. Keeps generating random numbers
     * between 1 and 100 (inclusive) in an infinite loop until the target is hit.
     * Returns how many attempts it took.
     *
     * @param target the number to find (1-100)
     * @return the number of iterations before the target was generated
     */

    public static int countUntilMatch(int target) {
        int attempts = 0;
        java.util.Random random = new java.util.Random();
        // TODO: 7 - Use while(true) to create an infinite loop.
        //  Each iteration: increment attempts, generate a random int between 1 and 100,
        //  and break if it matches the target.
        int a = 0;
;
        while(a < 8){
            attempts++;
            double genNum = random();
           System.out.println(genNum* 10);
         System.out.println((int)genNum);
            if(genNum == target){
                break;
            }
        }
        return attempts;
    }


    public static void main(String[] args) {
        System.out.println("=== Multiplication Table (4x4) ===");
        //printMultiplicationTable(4);

        System.out.println("\n=== Sum with Skip and Stop (n=50) ===");
        //System.out.println("Sum: " + sumWithSkipAndStop(50));

        System.out.println("\n=== Find in Matrix ===");
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(findInMatrix(matrix, 5));
        System.out.println(findInMatrix(matrix, 99));

        System.out.println("\n=== Factorial ===");
        System.out.println("5! = " + factorial(5));
        System.out.println("10! = " + factorial(10));

        System.out.println("\n=== Pyramid (5 rows) ===");
        printPyramid(5);

        System.out.println("\n=== Iterate Backwards ===");
        System.out.println(iterateBackwards(new int[]{1, 2, 3, 4, 5}));

        System.out.println("\n=== Count Until Match ===");
        System.out.println("Attempts to find 42: " + countUntilMatch(42));
    }
}
