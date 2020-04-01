/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etsjunit;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Juan Daniel Padilla
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({etsjunit.Calculadora2Test.class, etsjunit.ParaRestarTest.class, etsjunit.CalculadoraTest.class, etsjunit.ParaSumarTest.class, etsjunit.ParaDividirTest.class})
public class PruebaDeCalculadora {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
