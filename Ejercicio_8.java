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
public class Ejercicio_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        Scanner entrada = new Scanner (System.in);
      
        char seguir;
        int acumulador=0;
        char caracter;
              
        do 
        {
            System.out.println("Introduzca una letra: ");
              caracter = entrada.next().charAt(0);

            acumulador++;

            System.out.println("¿Desea introducir otro letra (s/n)?: ");
            seguir = entrada.next().charAt(0);
                         
        }
                
        while(seguir!='n'|| seguir!='N');
                
        System.out.printf ("La cantidad de letras introducidos es: %d", acumulador);
        
        
       
    

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
       
    }
    
}
