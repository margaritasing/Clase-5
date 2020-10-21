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
public class Ejercicio_1_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner ( System.in);
        
        System.out.print("Ingrese aqui numero:");
        int numero = entrada.nextInt();
        
        while (numero!=0){
            
            if (numero>0){
                
                System.out.println(numero+ "El numero es positivo");
                System.out.println("Introduce otro numero");
                numero = entrada.nextInt();
                            
            }else if (numero<0) {
                System.out.println(numero+ "El numero es negativo");
                System.out.println("Introduce otro numero");
                numero = entrada.nextInt();
                
                
            }
            
            
            
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
