/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etsjunit;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Juan Daniel Padilla
 */
public class Fecha {

    SimpleDateFormat formato;
    Date hoy;
    int tipo;
    String resul;

    public Fecha() {
        hoy = new Date();
    }

    public Fecha(int tipo, String resul) {
        hoy = new Date();
        this.tipo = tipo;
        this.resul = resul;
    }

    public String DevuelveFecha(int tipo) {
        String cad = "";
        switch (tipo) {
            case 1: {
                formato = new SimpleDateFormat("yyyy/MM");
                cad = formato.format(hoy);
                break;
            }
            case 2: {
                formato = new SimpleDateFormat("MM/yyyy");
                cad = formato.format(hoy);
                break;
            }
            case 3: {
                formato = new SimpleDateFormat("MM/yy");
                cad = formato.format(hoy);
                break;
            }
            default: {
                cad = "ERROR";
            }
        }
        return cad;
    }
}
