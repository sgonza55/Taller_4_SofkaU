/**
 * Taller 4 - Sofka U
 */
package com.mycompany.ejercicio_3;

/**
 * Representa una clase para aplicar metodo de Quick Sort para organizar números 
 * dentro de un array. 
 * @author Santiago Gonzalez - sgi1604@hotmail.com
 */

public class metodoQuickSort {
    
    /**
     * Método Quick Sort para organizar números dentro de un vector. 
     * @param arreglo vector a organizar. 
     * @param primero primer valor a escoger dentro del vector. 
     * Segun el numero que se escoja, el método converge mas rapido. 
     * @param ultimo tamaño del vector - 1.
     */
    public static void quicksort(Double arreglo[],int primero,int ultimo){
        int central,i,j;
        Double pivote;
        central=(primero+ultimo)/2;
        pivote=arreglo[central];
        i=primero;
        j=ultimo;
        
        do{
            while(arreglo[i]<pivote) i++;
            while(arreglo[j]>pivote) j--;
                if(i<=j){
                    Double temp;
                    temp=arreglo[i];
                    arreglo[i]=arreglo[j]; /*intercambia A[i] con A[j] */
                    arreglo[j]=temp;
                    i++;
                    j--;
                }
        }
        while(i<=j);
            if(primero<j)
                quicksort(arreglo,primero,j); /*mismo proceso con sublista izquierda*/
            if(i<ultimo)
                quicksort(arreglo,i,ultimo); /*mismo proceso con sublista derecha*/
    }
}
