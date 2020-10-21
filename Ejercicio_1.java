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
public class Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Scanner entrada = new Scanner ( System.in);
        
        int valores, sumar = 0;
        boolean continuar = true;
        while (continuar){
            System.out.println("Ingrese valores positivos o 0 para terminar");
           valores = entrada.nextInt();
           if ( valores == 0){
               continuar = false;
               
           }else {
               
               sumar = sumar + valores;
           }
           
           
           
           
            
            
        }
            
        System.out.println("El total de la suma" + sumar );
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
       
    }
    
}
