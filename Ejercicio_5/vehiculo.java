/*
 * Taller 4 - Sofka U
 */

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * Representa una clase de un vehiculo.
 * @author Santiago Gonzalez - sgi1604@hotmail.com
 */

public class vehiculo {
    
    /**
     * Propietario, dueño, marca o algun nombre que identifique el vehiculo
     */
    public String nombre;
    /**
     * Número de pasajeros que lleva el vehiculo.
     */
    public Integer noPasajeros;
    /**
     * Número de ruedas del vehiculo
     */
    public Integer noRuedas;
    /**
     * Fecha de matricula del vehiculo
     */
    public Date fechaMatricula;
    /**
     * Medio de desplazamiento del vehiculo.
     */
    public String medioDesplazamiento;
    /**
     * Representa si el vehiculo tiene tripulación o no.
     */
    public String tripulación;
    
    /**
     * Lista para guardar todos los atributos del vehiculo. 
     */
    public ArrayList<String> newvehiculo = new ArrayList<>();
    
    /**
     * Método que pide nombre del vehiculo por consola. 
     * @return propietario, dueño, marca o algun nombre que identifique el vehiculo
     */
    public String nombre() {
        System.out.println ("Ingrese propietario, dueño, marca o algun nombre que identifique el vehiculo: ");
        Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
        nombre = entradaEscaner.nextLine (); //Invocamos un método sobre un objeto Scanner
        return (nombre);
    }
    
    /**
     * Método que pide por consola la cantidad de pasajeros que lleva el vehiculo.
     * @return Número de pasajeros
     */
    public Integer noPasajeros() {
        System.out.println ("Ingrese número de pasajeros que lleva el vehiculo: ");
        Scanner entradaEscaner = new Scanner (System.in); 
        noPasajeros = Integer.parseInt(entradaEscaner.nextLine ()); 
        System.out.println ("El vehiculo lleva " + noPasajeros + " pasajeros.");
        return (noPasajeros);
    }

    /**
     * Método que pide por consola la cantidad de ruedas del vehiculo.
     * @return 
     */
    public Integer noRuedas() {
        System.out.println ("Ingrese número de ruedas del vehiculo: ");
        Scanner entradaEscaner = new Scanner (System.in); 
        noRuedas = Integer.parseInt(entradaEscaner.nextLine ()); 
        System.out.println ("El vehiculo tiene " + noRuedas + " ruedas.");
        return(noRuedas);
    }

    /**
     * Método que establece la fehca de matricula del vehiculo
     * @return fehca de matricula del vahiculo
     */
    public Date fechaMatricula() {
        int dia = 0, mes = 0, year;
        Scanner entradaEscaner = new Scanner (System.in); 
        System.out.println ("Ingrese el dia de la fecha de matricula del vehiculo: ");
        /**
         * Try and catch para evaluar si los datos ingresados para día y mes son validos
         */
        try {
            dia = Integer.parseInt(entradaEscaner.nextLine ());
             if (dia>31){
                 throw new Exception ("El número no puede ser mayor a 31");
             }
        } catch (Exception excdia){
            System.out.println (excdia.getMessage());
        }   
        System.out.println ("Ingrese el mes de la fecha de matricula del vehiculo: ");
        try {
            mes = Integer.parseInt(entradaEscaner.nextLine ());
             if (mes>12){
                 throw new Exception ("El número no puede ser mayor a 12");
             }
        } catch (Exception excmes){
            System.out.println (excmes.getMessage());
        }
        System.out.println ("Ingrese el año de la fecha de matricula del vehiculo: ");
        year = Integer.parseInt(entradaEscaner.nextLine ());
        Date fecha = new Date(year-1900, mes-1, dia);
        fechaMatricula = fecha;
        System.out.println ("La fecha de matricula del vehiculo es: " + fechaMatricula + " ");
        return(fechaMatricula);
    }
    
    /**
     * Método que establece por consola el tipo de medio por el que se desplaza el vehiculo
     * @return Medio por el que se desplaza el vehiculo: terrestre, acuatico o otro. 
     */
    public String medioDesplazamiento() {
        int medioDes;
        System.out.println ("Ingrese 1 si el vehiculo se desplaza por medio terrestre, "
                + "ingrese 2 si se desplaza por medio acuatico o ingrese culaquier otro número"
                + "si es otro tipo de medio: ");
        Scanner entradaEscaner = new Scanner (System.in); 
        medioDes = Integer.parseInt(entradaEscaner.nextLine ()); 
        if (medioDes==1){
            medioDesplazamiento = "Terrestre";
        } else if (medioDes==2){
            medioDesplazamiento = "Acuatico";
        } else {
            System.out.println ("Ingrese tipo de medio diferente "
                    + "a terrestre y acuatico: "); //En casa de no ser terreestre o acuatico
            medioDesplazamiento = entradaEscaner.nextLine ();
        }   
        return(medioDesplazamiento);
    }
    
    /**
     * Método que establece si hay o no presencia de tripulación en el vehiculo
     * @return Presencia o ausencia de tripulación.
     */
    public String tripulación() {
        Integer noTripulacion;
        System.out.println ("Ingrese cantidad de tripulantes del vehiculo: ");
        Scanner entradaEscaner = new Scanner (System.in); 
        noTripulacion = Integer.parseInt(entradaEscaner.nextLine ()); 
            if (noTripulacion>=1){
                tripulación = "Presencia de tripulación";
            } else if (noTripulacion==0){
                tripulación = "Ausencia de tripulación";
            }
        return(tripulación);
    }
    
    /**
     * Devuelve una lista con los atributos de cada vehiculo dados por los 
     * metodos anteriores.
     * @return Lista atributos vehiculo.
     */
    public ArrayList<String> getNewVehiculo() {
        return newvehiculo;
    }
    
    /**
     * Lista que establece los atributos del vehiculo.
     * @param newvehiculo lista con atributos del vehiculo. 
     */
    public void setNewVehiculo(ArrayList<String> newvehiculo) {
        this.newvehiculo = newvehiculo;
    }

}
