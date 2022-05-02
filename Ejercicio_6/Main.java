/*
 * Taller 4 - Sofka U
 */
package com.mycompany.ejercicio_6;

import java.util.Scanner;
import java.util.Vector;

/**
 * Programa que lee números ingresados por consola y finaliza cuando se ingresa un 
 * número repetido. Al final, se muestran todos los números ingreados. 
 * @author Santiago Gonzalez - sgi1604@hotmail.com
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /**
         * Tamaño inicial del vector 
         */
        int size = 1;
        /**
         * Incremento del tamaño del vector. 
         */
        int incr = 1;
        /**
         * Interruptor para el ciclo do-while.
         */
        int interruptor = 0;
        /**
         * Creación de vector 
         */
        Vector<Integer> Vector = new Vector<>(size, incr);
        
        /**
         * Ciclo do-while para ingrear números al vector.
         */
        do {
        System.out.println("Ingrese un número: ");
        Scanner entradaEscaner = new Scanner (System.in); 
        /**
         * Número ingreado por consola. 
         */
        int numero = Integer.parseInt(entradaEscaner.nextLine());
            boolean interr = Vector.contains(numero); /*Evalua si el número esta en el vector. Devuelve true si lo encuentra*/
            if (interr==false){                       /*Si NO lo encuentra, lo añade al vector*/
                Vector.add(numero);
            } else {                                  /*Si lo encuentra apaga el interruptor y cierra el ciclo*/
                interruptor = interruptor + 1;
                System.out.println("El número ingresado ya se encontraba anteriormente.");
            }
        } while (interruptor<1);
        System.out.println("Los números ingresados son los siguientes: ");
        System.out.println(Vector);
        System.out.println("El programa ha finalizado. ");
    }
}
