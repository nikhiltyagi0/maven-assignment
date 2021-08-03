package com.calapi;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

public class Calculator {
    /**
     * @param a
     * @param b
     * @return addition
     */
    public int add(final int a, final int b) {
        int result = a + b;
        System.out.println("The addition is " + result);
        return result;
    }

    /**
     * @param a
     * @param b
     * @return subtraction
     */
    public int sub(final int a, final int b) {
        int result = a - b;
        System.out.println("The subtraction is " + result);
        return result;
    }

    /**
     * @param a
     * @param b
     * @return multiplication
     */
    public int multiply(final int a, final int b) {
        int result = a * b;
        System.out.println("The multiplication is " + result);
        return result;
    }

    /**
     * @param a
     * @param b
     * @return division
     */
    @SuppressFBWarnings("ICAST_IDIV_CAST_TO_DOUBLE")
    public double divide(final int a, final int b) {
        if (b != 0) {
            double result = a / b;
            System.out.println("The division is " + result);
            return result;
        } else {
            System.out.println("division is not possible");
            return 0;
        }
    }
}
