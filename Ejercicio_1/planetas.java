/*
 * Taller 4 - Sofka U
 */

import java.util.Scanner;

/**
 * Representa una clase de un planeta, esta clase se extiende de la clase 
 * abstracta del sistema planetario. 
 * @author Santiago Gonzalez - sgi1604@hotmail.com
 */

public class planetas extends sistemaPlanetario{

    /**
     * Método para ingresar el nombre del planeta
     * @return nombre del planeta
     */
    @Override
    public String nombre() {
        System.out.println ("Ingrese nombre del planeta");
        Scanner entradaEscaner = new Scanner (System.in); /*Creación de un objeto Scanner*/
        nombre = entradaEscaner.nextLine (); /*Invocamos un método sobre un objeto Scanner*/
        System.out.println ("El planeta se llama " + nombre);
        return (nombre);
    }

    /**
     * Método para ingresar identificador del planeta.
     * @return identificador del planeta.
     */
    @Override
    public Integer ID() {
        System.out.println ("Ingrese número identificador del planeta");
        Scanner entradaEscaner = new Scanner (System.in); 
        ID = Integer.parseInt(entradaEscaner.nextLine()); 
        System.out.println ("El identificador del planeta " + nombre + " es " + ID);
        return (ID);
    }
    
    /**
     * Método para ingresar la densidad.
     * @return densidad del planeta
     */
    @Override
    public Double densidad() {
        System.out.println ("Ingrese densidad del planeta en g/cm3");
        Scanner entradaEscaner = new Scanner (System.in); 
        densidad = Double.valueOf(entradaEscaner.nextLine()); 
        System.out.println ("La densidad del planeta " + nombre + " es " + densidad + "g/cm3.");
        return (densidad);
    }

    /**
     * Método para ingresar el diametro del planeta.
     * @return diametro del planeta. 
     */
    @Override
    public Double diametro() {
        System.out.println ("Ingrese diametro del planeta en km");
        Scanner entradaEscaner = new Scanner (System.in); 
        diametro = Double.valueOf(entradaEscaner.nextLine()); 
        System.out.println ("El diametro del planeta " + nombre + " es " + diametro + "km.");
        return (diametro);   
    }

    /**
     * Método para ingresar la distancia a la que orbita del sol.
     * @return distancia al sol. 
     */
    @Override
    public Double distanciaAlSol() {
        System.out.println ("Ingrese distancia al sol del planeta en km");
        Scanner entradaEscaner = new Scanner (System.in); 
        distanciaAlSol = Double.valueOf(entradaEscaner.nextLine()); 
        System.out.println ("La distancia al sol del planeta " + nombre + " es " + distanciaAlSol + "km.");        
        return (distanciaAlSol);
    }
    
    /**
     * Método para ingresar la gravedad del planeta
     * @return gravedad del planeta. 
     */
    @Override
    public Double gravedad() {
        System.out.println ("Ingrese gravedad del planeta en m/s2");
        Scanner entradaEscaner = new Scanner (System.in); 
        gravedad = Double.valueOf(entradaEscaner.nextLine()); 
        System.out.println ("La gravedad del planeta " + nombre + " es " + gravedad + "m/s2.");        
        return (gravedad);        
    }
 
    /**
     * Método que calcula la masa del planeta. 
     * @return masa del planeta. 
     */
    @Override
    public Double masa() {
        Double radio = (diametro / 2) * 1000; /*multiplicar por 1000 para pasar a m.*/
        masa = (gravedad * radio * radio) / gravitacionUniversal ; /*m=(g*r^2)/G*/
        System.out.println ("La masa del planeta " + nombre + " es " + masa + "kg.");
        return (masa);
    }

}
