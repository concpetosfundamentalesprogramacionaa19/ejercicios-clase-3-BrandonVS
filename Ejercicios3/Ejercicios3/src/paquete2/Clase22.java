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
public class Clase22 {
    
    public static void main(String[] args) {
        
        // uso de expresionLogica ? expresion_1 : expresion_2
        
        int valor1 = 10;
        int valor2 = 9;
        /** Si la exprecion se cumple se toma el valor de la izquierda, si no
         * se cumple se toma el valor de la derecha
         */
        int resultado = valor1==valor2 ? valor1 + valor2 : valor2 - valor1;
        
        System.out.printf("Resultado es: %d\n", resultado);
        
    }
}
