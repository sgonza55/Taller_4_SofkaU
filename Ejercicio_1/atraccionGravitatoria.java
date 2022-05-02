/*
 * Taller 4 - Sofka U
 */

import java.util.Scanner;

/**
 * Representa una clase para el cálculo de la atracción o fuerza gravitatoria. 
 * @author Santiago Gonzalez - sgi1604@hotmail.com
 */
public class atraccionGravitatoria {
    
    /**
     * Nombre del primer planeta para cálculo de atracción gravitatoria. 
     */
    public String planeta1;
    /**
     * Nombre del segundo planeta para cálculo de atracción gravitatoria.
     */
    public String planeta2;
    /**
     * Variable para cálculo de la fuerza gravitatoria. 
     */
    public Double fuerzaGravitatoria;
    /**
     * Distancia entre ejes de los planetas a calcular la atracción gravitatoria. 
     */
    public Double distanciaPlanetas;
    /**
     * Constante de gravitación universal. 
     */
    public final Double gravitacionUniversal = 6.67430E-11;

    /**
     * Método para ingresar el nombre del planeta 1
     * @return nombre planeta 1
     */
    public String planeta1() {
        System.out.println ("Ingrese nombre del planeta 1 para calcular atracción gravitatoria: ");
        Scanner entradaEscaner = new Scanner (System.in); /*Creación de un objeto Scanner*/
        planeta1 = entradaEscaner.nextLine (); /*Invocamos un método sobre un objeto Scanner*/
        return (planeta1);
    }
    
    /**
     * Método para ingresar el nombre del planeta 2
     * @return nombre planeta 2
     */
    public String planeta2() {
        System.out.println ("Ingrese nombre del planeta 2 para calcular atracción gravitatoria: ");
        Scanner entradaEscaner = new Scanner (System.in); 
        planeta2 = entradaEscaner.nextLine (); 
        return (planeta2);
    }
    
    /**
     * Método para ingresar la distancia entre planetas en km.  
     * @return distancia entre ejes de los planetas en km
     */
    public Double distanciaPlanetas() {
        System.out.println ("Ingrese distancia entre planetas en km en para calcular atracción gravitatoria: ");
        Scanner entradaEscaner = new Scanner (System.in); 
        distanciaPlanetas = Double.valueOf(entradaEscaner.nextLine()); 
        return (distanciaPlanetas);
    }
    
    /**
     * Método para calcular la fuerza gravitatoria. 
     * @param masaPlaneta1 masa del planeta 1
     * @param masaPlaneta2 masa del planeta 2
     * @param distanciaPlanetas distancia entre planetas
     * @return fuerza o atracción gravitatoria. 
     */
    public Double fuerzaGravitatoria (Double masaPlaneta1, Double masaPlaneta2, Double distanciaPlanetas) {
        Double distanciaPlanetasMetros = distanciaPlanetas * 1000;
        fuerzaGravitatoria = ((masaPlaneta1 * masaPlaneta2)/Math.pow(distanciaPlanetasMetros, 2))*gravitacionUniversal;
        return fuerzaGravitatoria;
    }

}
