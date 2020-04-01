/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etsjunit;

import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Juan Daniel Padilla
 */
public class CalculadoraTest {

    public CalculadoraTest() {
    }

    /**
     * Test of suma method, of class Calculadora.
     */
    @Test
    public void testSuma() {
        System.out.println("suma");
        Calculadora instance = new Calculadora(10, 5);
        int expResult = 15;
        int result = instance.suma();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of resta method, of class Calculadora.
     */
    @Test
    public void testResta() {
        System.out.println("resta");
        Calculadora instance = new Calculadora(20, 20);
        int expResult = 0;
        int result = instance.resta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of multiplica method, of class Calculadora.
     */
    @Test
    public void testMultiplica() {
        System.out.println("multiplica");
        Calculadora instance = new Calculadora(10, 2);
        int expResult = 20;
        int result = instance.multiplica();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of divide method, of class Calculadora.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        Calculadora instance = new Calculadora(5, 5);
        int expResult = 1;
        int result = instance.divide();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testException() {
        try {
            Calculadora instance = new Calculadora(20, 0);
            int resultado = instance.divide();
            fail("Fallo, deberia lanzar la excepcion");
        } catch (ArithmeticException e) {
            System.out.println("Capturó la excepcion");
        }
    }

    /**
     * Test of resta2 method, of class Calculadora.
     */
    @Test
    public void testResta2() {
        System.out.println("resta2");
        Calculadora instance = new Calculadora(5, 5);
        boolean expResult = true;
        boolean result = instance.resta2();
        assertTrue(expResult);      //CAMBIADO POR AssertTrue
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of divide2 method, of class Calculadora.
     */
    @Test
    public void testDivide2() {
        System.out.println("divide2");
        Calculadora instance = new Calculadora(5, 5);
        Integer expResult = null;
        Integer result = instance.divide2();
        assertNull(expResult);    //CAMBIADO POR AssertNull
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
