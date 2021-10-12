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
public class punto02 {
     /**
     * El nombre mas adecuado para la funcion seria 'factorizacionPrima' =D
     * 
     * Nota: Puede probarlo con varios numeros y se dara cuenta de que siempre obtendra
     * la descomposicion de ese numero en factores primos f(x , 2)
     */
    public void f(int num, int div){
        if(num > 1){
            if(num%div == 0){
                System.out.println("div = " + div);
                f(num/div, div);
            }
            else{
                f(num, div+1);
            }
        }
    }
    
    public void primeFactorization(int num, int div){
        while(num > 1){
            while(num % div == 0){
                System.out.println("div = " + div);
                num /= div;
            }
            div++;
        }
    } 
}
