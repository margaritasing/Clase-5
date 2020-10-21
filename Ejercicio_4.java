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
public class Ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner entrada = new Scanner ( System.in);
        int sueldos;
        int cont_sueldos=0;
        int suma_suel=0;
       
        for(int i=0; i<=9; i++)
        {
            System.out.print("Introduzca sueldos");
            sueldos=entrada.nextInt();
           
            suma_suel=suma_suel+sueldos;
           
            if(sueldos>35000)
            {
                cont_sueldos++;
            }
        }
       
        System.out.println("Suma de los sueldos: "+suma_suel);
        System.out.println("Mayores de 35000: " +cont_sueldos);


















    }
    
}
