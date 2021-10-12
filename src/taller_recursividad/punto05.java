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
public class punto05 {
    
    public boolean isPalindrome(String s){
        return isPalindrome(0, s);
    }
    
    public boolean isPalindromeIterative(String s){
        for(int i=0; i<s.length() / 2; i++){
            if(s.charAt(i) != s.charAt( s.length() - i -1 ))
                return false;
        }
        return true;
    }
    private boolean isPalindrome(int i, String s){
        if( i == s.length() / 2)return true;
        if(s.charAt(i) != s.charAt(s.length() - i - 1))return false;
        return isPalindrome(i + 1, s);
    }
}
