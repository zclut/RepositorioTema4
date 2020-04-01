/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etsjunit;

import java.lang.reflect.Array;
import java.util.Collection;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Juan Daniel Padilla
 */
public class Calculadora2Test {
    private Calculadora calcu;
    private int resultado;
    
    public Calculadora2Test() {
    }
    
    
    
    
    
    
    
    @Before
    public void crearCalculadora() {
        calcu = new Calculadora (20,10);
    }
    
    @After
    public void borrarCalculadora() {
        calcu = null;
    }

    /**
     * Test of suma method, of class Calculadora.
     */
    @Test
    public void testSuma() {
        System.out.println("suma");
        resultado = calcu.suma();
        assertEquals(30, resultado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of resta method, of class Calculadora.
     */
    @Test
    public void testResta() {
        System.out.println("resta");
        resultado = calcu.resta();
        assertEquals(10, resultado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of resta2 method, of class Calculadora.
     */
    @Test
    public void testResta2() {
        System.out.println("resta2");
        assertTrue(true);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of multiplica method, of class Calculadora.
     */
    @Test
    public void testMultiplica() {
        System.out.println("multiplica");
        resultado = calcu.multiplica();
        assertEquals(200, resultado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of divide method, of class Calculadora.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        resultado = calcu.divide();
        assertEquals(2, resultado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of divide2 method, of class Calculadora.
     */
    @Test
    public void testDivide2() {
        System.out.println("divide2");
        resultado = calcu.divide2();
        assertNotNull(null, resultado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
