/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller_recursividad;

/**
 *
 * @author FELIPE
 */
public class punto04 {
    private char nums[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
    
    public String toHexa(int n){
        if(n == 0)return "";
        return toHexa(n/16) + nums[n%16];
    }
    
    /**
     * n es el numero a cambiar de base y base es la base a elegir
     * nota: Ojo con el metodo ya que es int, si quiere que almacene mas numeros paselo a long
     * o si quiere aun mas paselo a String pero la logica del metodo cambia un poco :D
     */
    public int toBaseX(int n, int base){
        if(n == 0)return 0;
        return toBaseX(n/base, base)*10 + n%base;
    }
}
