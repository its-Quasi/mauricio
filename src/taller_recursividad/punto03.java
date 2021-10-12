/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller_recursividad;

/**
 *
 * @author mauri
 */
public class punto03 {
    /*
    Pára numeros < 100 la salida es 91 y para >= 100 la salida es numero - 10 :D
    */
    public int f(int x){
        if(x > 100)
            return x - 10;
        else
            return f(f( x + 11 ));
    }
}
