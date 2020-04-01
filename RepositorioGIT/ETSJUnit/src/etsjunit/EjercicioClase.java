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
public class EjercicioClase {
    
    int num1;
    int num2;
    int resul;
    
    public EjercicioClase(int num1,int num2,int resul){
        this.num1 = num1;
        this.num2 = num2;
        this.resul = resul;
    }
    
    
    public int prueba(int x, int y) {
        int z = 0;
        if (x > 0 && y > 0) {
            z=x;
        }
        return z;
    }
}
