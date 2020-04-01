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
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Juan Daniel Padilla
 */
public class EjercicioClaseTest {

    int x;
    int y;
    int resul;

    public EjercicioClaseTest(int x, int y, int resul) {
        this.x = x;
        this.y = y;
        this.resul = resul;
    }
    
    @Parameters
    public static Collection<Object[]> numeros() {
        return Arrays.asList(new Object[][]{{20, 10, 20}, {30, 2, 30}, {5, 2, 5}});
    }


    /**
     * Test of prueba method, of class EjercicioClase.
     */
    @Test
    public void testPrueba() {
        EjercicioClase a = new EjercicioClase(x,y,resul);
        int resultado = a.prueba(x, y);
        assertEquals(resul, resultado);
    }

}
