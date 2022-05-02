/*
 * Taller 4 - Sofka U
 */
package com.mycompany.ejercicio_3;

import java.util.Scanner;

/**
 * Representa una programa para aplicar metodos para organizar números Reales 
 * (naturales, enteros, racionales e irracionales) dentro de un array. 
 * @author Santiago Gonzalez - sgi1604@hotmail.com
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Ingrese cantidad de números del vector: ");
        Scanner entradaEscaner = new Scanner (System.in);
        /**
         * Valor que da el usuario para ingresar el tamaño del vector,
         * es decir, cantidad de números. 
         */
        Integer cantidadNumeros = Integer.parseInt(entradaEscaner.nextLine()); 
        Double numeros [] = new Double [cantidadNumeros]; /*Vector vacio creado*/
        
        /**
         * Ciclo for que imprime en consla el vector creado aleatoriamente. 
         */
        System.out.println("El vector generado es el siguiente: ");
        System.out.print("|");
        for (int i=0; i<cantidadNumeros;i++){
            numeros[i] = (Math.random()*(100+99)+-100);
            System.out.print (numeros[i]);   
            if (i!=numeros.length-1) System.out.print("\t");
        }
        System.out.println("|");
        

        System.out.println("Ingrese 1 si desea organizar los números del vector por "
                + "el metodo de la brubuja. ");
        System.out.println("Ingrese 2 si desea organizar los números del vector por "
                + "el metodo Quick Sort. ");
        /**
         * Valor que ingresa el usuario para saber que método escoger
         * 1 para burbuja y 2 para Quick Sort. 
         */
        Integer eleccionMetodo = Integer.parseInt(entradaEscaner.nextLine());
        
        /**
         * Switch para ejecutar el método elegido. 
         * 1 para burbuja y 2 para Quick Sort. 
         * 3 default, sale mensaje diciendo que no se seleccionó
         * ningún método. 
         */
        switch(eleccionMetodo){
            case 1:
                Double arregloOrdenado[] = metodoBurbuja.burbuja(numeros);
                System.out.println("El vector organizado es el siguiente: "); 
                System.out.print("|");
                for(int j = 0; j < cantidadNumeros;j++){/*For que imprime el vector organizado*/
                    System.out.print(arregloOrdenado[j]);
                    if (j!=arregloOrdenado.length-1) System.out.print("\t");
                }
                System.out.print("|");
                break;
            
            case 2:
                metodoQuickSort.quicksort(numeros,0,cantidadNumeros-1);
                System.out.println("El vector organizado es el siguiente: ");
                System.out.print("|");
                for(int i =0; i<numeros.length;i++){/*For que imprime el vector organizado*/
                    System.out.print(numeros[i]);
                    if (i!=cantidadNumeros-1) System.out.print("\t");
                }
                System.out.print("|");
                break;
            default:
                System.out.print("No se seleccionó ningún método");
        }
    }
}
