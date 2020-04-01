/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etsjunit;

/**
 *
 * @author Juan Daniel Padilla
 */
public class Factorial {

    public static int calculo(int n) {

        if (n < 0) {
            throw new IllegalArgumentException("Número " + n + "no puede ser < 0");
        }

        int fact = 1;

        for (int i = 2; i <= n; i++) {
            fact *= i;
        }

        if (fact < 0) {

            throw new ArithmeticException("Overflow, número " + n + " demasiado grande");

        }

        return fact;

    }
}
