/*
 * Taller 4 Sofka U
 */

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Representa una clase de un vehiculo.
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
            
            System.out.println("Ingrese 1 para Coche");
            System.out.println("Ingrese 2 para Moto");
            System.out.println("Ingrese 3 para Camión");
            System.out.println("Ingrese 4 para Bicicleta");
            System.out.println("Ingrese 5 para Lancha");
            Integer tipoVehiculo; 
            Scanner entradaEscaner = new Scanner (System.in); 
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MMMM-dd hh:mm:ss"); 
            tipoVehiculo = Integer.parseInt(entradaEscaner.nextLine ());
            
            switch (tipoVehiculo){
                case 1: 
                    ArrayList<String> newCoche = new ArrayList<>(); /*Creación de lista para guardar datos del carro*/
                    coche coche = new coche(); /*Creación de un coche*/
                    newCoche.add("Carro: " + coche.nombre());
                    newCoche.add(Integer.toString(coche.noPasajeros()) + " pasajeros");
                    newCoche.add(Integer.toString(coche.noRuedas()) + " ruedas");
                    String strDateC = dateFormat.format(coche.fechaMatricula()); /*Variable para pasar la fecha de matricula de tipo Date a String.*/
                    newCoche.add(strDateC);
                    newCoche.add(coche.medioDesplazamiento());
                    newCoche.add(coche.tripulación());
                    newCoche.add(Integer.toString(coche.noPuertas()) + " puertas");
                    coche.setNewVehiculo(newCoche); /*Método para establecer la lista de vehiculo ya creada. */
                    System.out.println(coche.getNewVehiculo());
                    garage [i] = newCoche; /*Matriz donde cada posición es una lista con un vehculo diferente. */
                    break;
                
                case 2:
                    ArrayList<String> newMoto = new ArrayList<>(); /*Creación de lista para guardar datos de la moto*/
                    moto moto = new moto(); /*Creación de una moto*/
                    newMoto.add("Moto: " + moto.nombre());
                    newMoto.add(Integer.toString(moto.noPasajeros()) + " pasajeros");
                    newMoto.add(Integer.toString(moto.noRuedas()) + " ruedas");
                    String strDateM = dateFormat.format(moto.fechaMatricula()); /*Variable para pasar la fecha de matricula de tipo Date a String.*/
                    newMoto.add(strDateM);
                    newMoto.add(moto.medioDesplazamiento());
                    newMoto.add(moto.tripulación());
                    newMoto.add(moto.cilindraje());
                    moto.setNewVehiculo(newMoto); /*Método para establecer la lista de vehiculo ya creada. */
                    System.out.println(moto.getNewVehiculo());
                    garage [i] = newMoto; /*Matriz donde cada posición es una lista con un vehculo diferente. */
                    break;

                case 3:
                    ArrayList<String> newCamion = new ArrayList<>(); /*Creación de lista para guardar datos del camión*/
                    camion camion = new camion(); /*Creación de un camión*/
                    newCamion.add("Camión: " + camion.nombre());
                    newCamion.add(Integer.toString(camion.noPasajeros()) + " pasajeros");
                    newCamion.add(Integer.toString(camion.noRuedas()) + " ruedas");
                    String strDateCa = dateFormat.format(camion.fechaMatricula()); /*Variable para pasar la fecha de matricula de tipo Date a String.*/
                    newCamion.add(strDateCa);
                    newCamion.add(camion.medioDesplazamiento());
                    newCamion.add(camion.tripulación());
                    newCamion.add("Altura: " + Float.toString(camion.altura()) + " m");
                    camion.setNewVehiculo(newCamion); /*Método para establecer la lista de vehiculo ya creada. */
                    System.out.println(camion.getNewVehiculo());
                    garage [i] = newCamion; /*Matriz donde cada posición es una lista con un vehculo diferente. */
                    break;
                    
                case 4:
                    ArrayList<String> newBici = new ArrayList<>(); /*Creación de lista para guardar datos de la bicicleta*/
                    bicicleta bici = new bicicleta(); /*Creación de un bicicleta*/
                    newBici.add("Camión: " + bici.nombre());
                    newBici.add(Integer.toString(bici.noPasajeros()) + " pasajeros");
                    newBici.add(Integer.toString(bici.noRuedas()) + " ruedas");
                    String strDateB = dateFormat.format(bici.fechaMatricula()); /*Variable para pasar la fecha de matricula de tipo Date a String.*/
                    newBici.add(strDateB);
                    newBici.add(bici.medioDesplazamiento());
                    newBici.add(bici.tripulación());
                    newBici.add(bici.tipoBicicleta());
                    bici.setNewVehiculo(newBici); /*Método para establecer la lista de vehiculo ya creada. */
                    System.out.println(bici.getNewVehiculo());
                    garage [i] = newBici; /*Matriz donde cada posición es una lista con un vehculo diferente. */
                    break;
                    
                case 5:
                    ArrayList<String> newLancha = new ArrayList<>(); /*Creación de lista para guardar datos de la lancha*/
                    lancha lancha = new lancha(); /*Creación de una lancha*/
                    newLancha.add("Lancha: " + lancha.nombre());
                    newLancha.add(Integer.toString(lancha.noPasajeros()) + " pasajeros");
                    String strDateL = dateFormat.format(lancha.fechaMatricula()); /*Variable para pasar la fecha de matricula de tipo Date a String.*/
                    newLancha.add(strDateL);
                    newLancha.add(lancha.medioDesplazamiento());
                    newLancha.add(lancha.tripulación());
                    newLancha.add(lancha.tipoLancha());
                    lancha.setNewVehiculo(newLancha); /*Método para establecer la lista de vehiculo ya creada. */
                    System.out.println(lancha.getNewVehiculo());
                    garage [i] = newLancha; /*Matriz donde cada posición es una lista con un vehculo diferente. */
                    break;        
                
                default: 
                    System.out.println("No se establece");
            }   
            /**
             * Condicional para establacer si el usuario desea crear menos de 10 vehiculos. 
             */
            System.out.println("¿Desea agregar otro vehiculo?. Ingrese 1 para un nuevo vehiculo o 0 para terminar");
            Integer agregarVehiculo;
            agregarVehiculo = Integer.parseInt(entradaEscaner.nextLine());
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