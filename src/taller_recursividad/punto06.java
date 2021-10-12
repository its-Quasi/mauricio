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
public class punto06{
    
    public String invertirIterativo(String s){
        char cadena[] = s.toCharArray();
        for(int i=0; i<cadena.length/2; i++){
            char aux = cadena[i];
            cadena[i] = cadena[cadena.length - i -1];
            cadena[cadena.length - i -1] = aux;
        }
        return String.valueOf(cadena);
    }
    
    public String invertirRecursive(String s){
        return invertirRecursive(0, s);
    }
    public String invertirRecursive(int i,String s){
        if(i==s.length())return "";
        return invertirRecursive(i+1, s) + s.charAt(i) ;
    }
    
}
