/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteprincipal2;

import paquetedatos.Variable;
import paquetedatos.Variable2;

/**
 *
 * @author Salas
 */
public class Principal {

    public static void main(String[] args) {
        // Método principal
        double resultado;
        double resultado2;
        
        resultado = Variable.numero1 + Variable.numero2;
        System.out.printf("El resultado es: %.1f\n", resultado);
        
        resultado2 = Variable2.numero3 + Variable.numero1;
        System.out.printf("El resultado es: %.1f\n", resultado2);
    }
}
