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
public class Calculadora {

    private int num1;
    private int num2;
    private int resul;
    
    public Calculadora(int a, int b) {
        num1 = a;
        num2 = b;
    }
    
    public Calculadora(int num1, int num2, int resul){
        this.num1 = num1;
        this.num2 = num2;
        this.resul = resul;
        
    }

    public int suma() {
        int resul = num1 + num2;
        return resul;
    }

    public int resta() {
        int resul;
        if (resta2()) {
            resul = num1 - num2;
        } else {
            resul = num2 - num1;
        }
        return resul;
    }

    public boolean resta2() {
        if (num1 >= num2) {
            return true;
        } else {
            return false;
        }
    }

    public int multiplica() {
        int resul = num1 * num2;
        return resul;
    }

    public int divide() {
        int resul = num1 / num2;
        return resul;
    }

    public Integer divide2() {
        if (num2 == 0) {
            return null;
        }
        int resul = num1 / num2;
        return resul;
    }
}
