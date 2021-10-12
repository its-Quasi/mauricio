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
public class Taller_Recursividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        punto01 p01 = new punto01(); //Este punto lo hizo usted, no se como funciona el metodo dentro de la clase punto01
        punto02 p02 = new punto02();
        punto03 p03 = new punto03();
        punto04 p04 = new punto04();
        punto05 p05 = new punto05();
        punto06 p06 = new punto06();
        
        /**********************PUNTO 1******************************/
        System.out.println("Punto 1: " + p01.bisect(0, 0)); //Aqui le puede dar valores a el metodo, no se lo que hace porque tampoco tengo el enunciado 
       
        
        /**********************PUNTO 2******************************/
        System.out.println("Punto 2: Descomposicion en factores primos");
        // Este metodo es la factorizacion prima del primer parametro(o sea 90) y el segundo parametro siempre debera ser 2
                p02.f(90, 2);
                
        /**********************PUNTO 3******************************/
        System.out.println(p03.f(100)); // Aqui le puede dar por parametro cualquier numero debido a que solo hay que determinar la salida para cada numero ingresado, dentro de la propia clase ya hay una explicacion de eso :)
        
        
        /**********************PUNTO 4******************************/
        /**
         * El punto 4 tiene 2 apartados, convertir un numero a hexadecimal y convertir un numero a la base que uno quiera
         * Ejemplo: p04.toHexa(X), X seria un numero random de su eleccion
         *          p04.toBaseX(X, B)  X seria un numero random de su eleccion y B seria la base a convertir el numero 
         *                            por ejemplo:  toBaseX(234, 2) esto estaria pasado 234 a binario
         */
        System.out.println("Punto 4: Numero a Hexadecimal" + p04.toHexa(1203)); //Por parametro le pasa el numero que desee
        System.out.println("Punto 4: Numero a Base b" + p04.toBaseX(234 , 2));
        
        
        /**********************PUNTO 5******************************/
        /**
         *Este punto valida si un String ingresado por parametro es palindromo o no, hay 2 metodos, uno es iterativo y el otro recursivo
         * puede usar el que quiera ya que ambos sirven igual
         */
        String s = "reconocer"; // Esta seria la palabra a determinar si es palindromo, puede cambiarla y hacer pruebas si desea
        System.out.println("Punto 5: El string " +s+" Es palindromo? " + (p05.isPalindrome(s)?"Si":"No"));
        
        
        /**********************PUNTO 6******************************/
        /**
         * Este punto lo que hace es invertir una cadena que le de el user
         */
        String aInvertir = "mauricio";
        System.out.println("Punto 5: El String "+s+" Invertido es: " + p06.invertirRecursive(s));
    }
    
}
