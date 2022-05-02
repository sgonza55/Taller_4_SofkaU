/*
 * Taller 4 - Sofka U
 */

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * Representa una clase de un coche. 
 * @author Santiago Gonzalez - sgi1604@hotmail.com
 */

public class coche extends vehiculo{
    
    /**
     * Número de puertas dek vehiculo
     */
    public Integer noPuertas;
    public ArrayList<String> coche = new ArrayList<>();

    @Override
    public String nombre() {
        return super.nombre(); 
    }
    
    @Override
    public Integer noRuedas() {
        noRuedas = 4;
        return (noRuedas); 
    }
    
    @Override
    public Integer noPasajeros() {
        return super.noPasajeros(); 
    }

    @Override
    public String tripulación() {
        return super.tripulación(); 
    }

    @Override
    public String medioDesplazamiento() {
        medioDesplazamiento = "Terrestre";
        return (medioDesplazamiento); 
    }

    @Override
    public Date fechaMatricula() {
        return super.fechaMatricula(); 
    }

    @Override
    public void setNewVehiculo(ArrayList<String> newvehiculo) {
        super.setNewVehiculo(newvehiculo); 
    }

    @Override
    public ArrayList<String> getNewVehiculo() {
        return super.getNewVehiculo(); 
    }
    
    /**
     * Método que establece el valor del número de puertas del coche. 
     * @return numero de puertas
     */
    public Integer noPuertas() {
        Integer numPuertas=0;
        System.out.println("Ingrese número de puertas del carro");
        Scanner entradaEscaner = new Scanner (System.in); 
        /**
         * Try and catch para evaluar el numero de puertas ya que solo se puede escoger entre 3 y 5 puertas. 
         */
         try {
            numPuertas = Integer.parseInt(entradaEscaner.nextLine ());
             if (numPuertas>5){
                 throw new Exception ("El número no puede ser mayor a 5");
             } else if (numPuertas<2) {
                 throw new Exception ("El número no puede ser menor a 2");
             } else if (numPuertas==4) {
                 throw new Exception ("El número no puede ser igual a 4");
             }
        } catch (Exception excdia){
            System.out.println (excdia.getMessage());
        }   
        
        if (numPuertas==3){
            noPuertas=3;
            System.out.println("El carro tiene 3 puertas");
        } else if (numPuertas==5){
            noPuertas=5;
            System.out.println("El carro tiene 5 puertas");
        } else {
            noPuertas=numPuertas;
            System.out.println("El valor no es adecuado");
        }
        return(noPuertas);
    }  
        
}
