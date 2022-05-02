/*
 * Taller 4 - Sofka U
 */
package com.mycompany.ejercicio_3;

/**
 * Representa una clase para aplicar metodo de la burbuja para organizar números 
 * dentro de un array. 
 * @author Santiago Gonzalez - sgi1604@hotmail.com
 */

public class metodoBurbuja {
    
    /**
     * Método que organiza los datos de un vector de menor a mayor. 
     * @param arreglo vector a organizar. 
     * @return vector organizado. 
     */
    public static Double[] burbuja(Double[] arreglo) {
        Double auxiliar;
        Double[] arregloOrdenado;
        for(int i = 1; i < arreglo.length; i++){
            for(int j = 0;j < arreglo.length-i;j++){
                if(arreglo[j] > arreglo[j+1]) {
                    auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = auxiliar;
                }   
            }
        }
    arregloOrdenado = arreglo;
    return arregloOrdenado;
    } 
}
