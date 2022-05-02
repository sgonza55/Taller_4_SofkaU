/*
 * Taller 4 - Sofka U
 */

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * Representa una clase de una moto.
 * @author Santiago Gonzalez - sgi1604@hotmail.com
 */

public class moto extends vehiculo {
    
    /**
     * Atrbuto que define si la moto es de cilindraje alto o bajo. 
     */
    public String cilindraje;
    
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
    public Integer noRuedas() {
        noRuedas = 2;
        return noRuedas; 
    }

    @Override
    public Integer noPasajeros() {
        return super.noPasajeros(); 
    }

    @Override
    public String nombre() {
        return super.nombre(); 
    }
     
    @Override
    public void setNewVehiculo(ArrayList<String> newvehiculo) {
        super.setNewVehiculo(newvehiculo); 
    }

    @Override
    public ArrayList<String> getNewVehiculo() {
        return super.getNewVehiculo(); // 
    }
    
    /**
     * Método que establece el cilindraje de la moto
     * @return Alto o bajo cilindraje.
     */
    public String cilindraje() {
        Integer cilindrajeValor;
        System.out.println("Ingrese 1 si el cilindraje es alto, ingrese 2 si es bajo");
        Scanner entradaEscaner = new Scanner (System.in); 
        cilindrajeValor = Integer.parseInt(entradaEscaner.nextLine ()); 
        if (cilindrajeValor==1){
            cilindraje=("Alto cilindraje");
        } else if (cilindrajeValor==2){
            cilindraje=("Bajo cilindraje");
        } else {
            cilindraje = "No especificado";
        }
        return(cilindraje);
    }  

}
