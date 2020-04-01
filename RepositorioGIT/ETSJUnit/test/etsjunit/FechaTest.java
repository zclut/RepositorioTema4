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

/**
 *
 * @author Juan Daniel Padilla
 */
@RunWith(Parameterized.class)
public class FechaTest {
    int tipo;
    String resul;
    public FechaTest(int tipo, String resul) {
       
        this.tipo = tipo;
        this.resul = resul;
    }
    
    @Parameterized.Parameters
    public static Collection<Object[]> numeros() {
        return Arrays.asList(new Object[][]{{1, "2020/02"}, {2, "02/2020"}, {5, "02/20"}, {4, "ERROR"}});
    }

    /**
     * Test of DevuelveFecha method, of class Fecha.
     */
    @Test
    public void testDevuelveFecha() {
        Fecha prueba = new Fecha(tipo,resul);
        String result = prueba.DevuelveFecha(tipo);
        assertEquals(resul, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
