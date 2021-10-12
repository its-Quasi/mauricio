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
public class punto01 {

    static final double N = 3;
    static final double PREC = 1e-6;

    static double f(double x) {
        return x * x - N;
    }

    static double bisect(double min, double max) {
        double med = (min + max) / 2;
        
        System.out.println(med);
        if (max - min < PREC) {
            return med;
        } else if (f(min) * f(med) < 0) {
            return bisect(min, med);
        } else {
            return bisect(med, max);
        }
    }
    
    static double bisect2(double min, double max) {
        double med = (min + max) / 2;
        
        System.out.println(med);
        if (max - min < PREC) {
            return med;
        } else if (f(min) * f(med) < 0) {
            return bisect(min, med);
        } else {
            return bisect(med, max);
        }
    }
}
