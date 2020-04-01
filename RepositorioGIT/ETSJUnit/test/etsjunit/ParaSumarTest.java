/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etsjunit;

import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Juan Daniel Padilla
 */
@RunWith(Parameterized.class)
public class ParaSumarTest {
    
    int num1;
    int num2;
    int resul;

    public ParaSumarTest(int num1, int num2, int resul) {
        this.num1 = num1;
        this.num2 = num2;
        this.resul = resul;
    }

    @Parameters
    public static Collection<Object[]> numeros() {
        return Arrays.asList(new Object[][]{{20, 10, 30}, {30, -2, 28}, {5, 2, 7}});
    }

    @Test
    public void testDivide() {
        Calculadora calcu = new Calculadora(num1, num2);
        int resultado = calcu.suma();
        assertEquals(resul, resultado);
    }
}
