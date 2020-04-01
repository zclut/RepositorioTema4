/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etsjunit;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 *
 * @author Juan Daniel Padilla
 */
public class apunte {
    /*
    ###########################################################################
    @BeforeClass  -->  Se ejecuta antes de los metodos de prueba.    (PUBLIC STATIC VOID)
    @AfterClass   -->  Se ejecuta despues de los metodos de prueba   (PUBLIC STATIC VOID)
    
    @Before       -->  Antes de todos los metodos @Test              (PUBLIC VOID)
    @After        -->  Despues de todos los metodos @test            (PUBLIC VOID) 
    
    @Test         -->  Metodo de prueba a ejecutar                   (PUBLIC VOID)
    @Ignore       -->  Para ignorarlo, no lo ejecuta                 ()
    ###########################################################################
                                                 PRUEBAS PARAMETRIZADAS
    --> PASO 1
            @RunWith(Parameterized.class)    [Un atributo por cada parametro] && [Un constructor de la clase con los parametros]  
    
    --> PASO 2
            Definir metodo con la etiqueta @Parameters   -->  Devuelve una lista de valores a probar 
            @Parameters
            public static Collection<Objects[]> data(){
                Object [][] objetos-array = new Object [][]{
                {{arraydatos0},{arradatos1},{arraydatos2}}
             }
               return Array.asList(objetos-array);
            }
    
    
    
    @Parameters
    public static Collection<Object[]> numeros(){
        return Array.asList (new Object[][] {20,10,2},{30,-2,-15},{5,2,3}});
    }

    @Test
    public void testDivide(){
        Calculadora calcu = new Calculadora(num1,num2,resul);
        int resultado = calcu.divide();
        assertEquals(resul,resultado);    
    }
    
            
    ###########################################################################    
    */
    public static void main(String[] args) {
        
        ArrayList<String> prueba = new ArrayList<>();
        prueba.add("a");
        prueba.add("b");
        prueba.add("c");
        prueba.forEach((string) -> {
            System.out.println(string);
        });
       
    }
    
    
    
}
