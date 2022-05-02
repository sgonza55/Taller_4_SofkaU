/*
 * Taller 4 - Sofka U
 */

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Representa una clase abstracta de un vehiculo
 * @author Santiago Gonzalez - sgi1604@hotmail.com
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /**
         * Representa un interruptor para limitar la creación de vehiculos a 10. 
         */
        int interrVehiculos=0;
        /**
         * Matriz garage para guardar los vehiculos creados.
         */
        ArrayList garage[]= new ArrayList[10];

        /**
         * Ciclo for para creación de vehiculos, maximo 10 vehiculos. 
         */
        for (int i=0; i<10;i++){
            /**
             * Creación de lista para guardar datos del vehiculo.
             */
            ArrayList<String> newVehiculo = new ArrayList<>();
            /**
             * Creación de un nuevo vehiculo. 
             */
            vehiculo vehiculo = new vehiculo();

            /**
             * Implementnación de métodos de la clase vehiculo 
             * que se agregan a la lista creada anteriormente.
             */
            newVehiculo.add(vehiculo.nombre());
            newVehiculo.add(Integer.toString(vehiculo.noPasajeros()));
            newVehiculo.add(Integer.toString(vehiculo.noRuedas()));
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MMMM-dd hh:mm:ss");  
            /**
             * Variable para pasar la fecha de matricula de tipo Date a String.
             */
            String strDate = dateFormat.format(vehiculo.fechaMatricula()); 
            newVehiculo.add(strDate);
            newVehiculo.add(vehiculo.medioDesplazamiento());
            newVehiculo.add(vehiculo.tripulación());
            vehiculo.setNewVehiculo(newVehiculo); /*Método para establecer la lista de vehiculo ya creada.*/
            System.out.println(vehiculo.getNewVehiculo());
            
            /**
             * Condicional para establacer si el usuario desea crear menos de 10 vehiculos. 
             */
            System.out.println("¿Desea agregar otro vehiculo?. Ingrese 1 para un nuevo vehiculo o 0 para terminar");
            Integer agregarVehiculo;
            Scanner entradaEscaner = new Scanner (System.in); 
            agregarVehiculo = Integer.parseInt(entradaEscaner.nextLine());
            garage [i] = newVehiculo; /*Matriz donde cada posición es una lista con un vehculo diferente.*/
            interrVehiculos = interrVehiculos + 1;
                if (agregarVehiculo==0){
                    i = i + 10;
                }
        }
        /**
         * Ciclo for para imprimir en consola los vehiculos creados.
         */
        for (int j=0; j<interrVehiculos;j++){
            System.out.println(garage[j]);
        }
    }
}