/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etsjunit;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Juan Daniel Padilla
 */
@RunWith(Parameterized.class)
public class ParaDividirTest {

    int num1;
    int num2;
    int resul;

    public ParaDividirTest(int num1, int num2, int resul) {
        this.num1 = num1;
        this.num2 = num2;
        this.resul = resul;

    }

    @Parameters
    public static Collection<Object[]> numeros() {
        return Arrays.asList(new Object[][]{{20, 10, 2}, {30, -2, -15}, {5, 2, 3}});
    }

    @Test
    public void testDivide() {
        Calculadora calcu = new Calculadora(num1, num2, resul);
        int resultado = calcu.divide();
        assertEquals(resul, resultado);
    }
}
