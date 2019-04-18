/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class Clase21 {
    
    public static void main(String[] args) {
        
        boolean bandera;
        int valor1 = 1;
        int valor2 = 10;
        
        bandera = valor1 < valor2; // Comparativos
        
        System.out.printf("Resultado de banderas con comparativos: %s\n", 
                bandera);
        
        bandera = (valor1 < valor2) & (valor1 > valor2); /** Producto lógico – 
         * \AND (binario)
        */
        System.out.printf("Resultado debandera usando AND: %s\n", bandera);
        
        bandera = (valor1 < valor2) | (valor1 > valor2); // OR
        
        System.out.printf("Resultado de banera usando OR: %s\n", bandera);
        
        bandera = !((valor1 < valor2) | (valor1 > valor2)); /** Negación - NOT 
         * (unario)
        */
        System.out.printf("Resultado de bandera usando NOT: %s\n", bandera);
    }
    
}
