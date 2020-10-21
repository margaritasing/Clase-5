/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase5;

import java.util.Scanner;

/**
 *
 * @author AnaTevez
 */
public class Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner ( System.in);
        int n;
        int contador = 0;
        
        do{
            System.out.print("Dime un numero");
            n= entrada.nextInt();
            contador++;
            
            } while (n>=0);
        
        if (n<0){
            System.out.println("Has introducido"+contador+"numero");
        }
        
        
        
        
        
        
        
        
        
        
    }
    
}
