/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadorespromedio.pkg66187;

/**
 *
 * @author Alondra Palma
 */
public class OperadoresPromedio66187 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 //Elabore un programa que utilice 5 valores y calcule el promedio de los mismos.
        // utiliza float para que me de en decimales
        
        float suma = 0;
        float prom_final;
        int val_1 = 9;
        int val_2 = 7;
        int val_3 = 10;
        int val_4 = 7;
        int val_5 = 8;
        
       suma=(val_1 + val_2 + val_3 + val_4 + val_5);
       prom_final = suma/5;
        
       // int prom_final = suma;
        System.out.println("El promedio es " + prom_final);
             
    }
   
}