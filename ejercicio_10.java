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
public class ejercicio_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner ( System.in);
       
        String nombre,apellido;
        char English;
        char Frances;
        char Portugues;
        char Aleman;
        String lenguajeextranjero; 
        int total, score;
        float porcentaje; 
        
        System.out.println("Ingrese su nombre");
        nombre=entrada.nextLine();
        
        System.out.println("Ingrese su apellido");
        apellido= entrada.nextLine(); 
        
        
        System.out.println(" Ingrese un idioma");
        lenguajeextranjero = entrada.nextLine();
        
        switch ( lenguajeextranjero){
                 
                case "Ingles" : System.out.print("Ingles");
                        break;
                case "Frances": System.out.print("Frances");
                        break;
                case "Portugues": System.out.print("Portugues");
                        break;
                case "Aleman" : System.out.print("Aleman");
                        break;
                                      
             }
        
        
      /**  int total, score; 
       float percentage;
       Scanner inputNumScanner = new Scanner(System.in);
       
       System.out.println("Ingresa el puntaje total, o máximo: ");       
       total = inputNumScanner.nextInt();
       
       System.out.println("Ingresa el puntaje obtenido: ");
       score = inputNumScanner.nextInt();
       
       percentage = (score * 100/ total);
       
       System.out.println("El porcentaje es = " + percentage + " %");**/
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
