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
public class Ejercicio_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner ( System.in);
       int clave=123;
       int saldo=30000;
       int valor_aretirar;
       int clave_leida; 
       int cantidad;
       int k=0; 
       
      System.out.print("ingrese la clave: ");
        clave_leida=Integer.parseInt(entrada.next());
         if(clave==clave_leida) {
                       
                 System.out.println(" Retirar efectivo");
                 System.out.println("Por favor ingrese la cantidad a retirar");
                 valor_aretirar = entrada.nextInt();
                 if (valor_aretirar <= saldo) {
                     saldo = saldo - valor_aretirar;
                     System.out.println("Su nuevo saldo es: " + saldo);
                 } else {
                     System.out.println("Fondos Insuficientes, su saldo es: " + saldo);
                 }
                 k++;
   
      
     }
    
        
    

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
   
 }
    
        } 
    


    