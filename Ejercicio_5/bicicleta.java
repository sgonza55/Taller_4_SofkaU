/*
 * Taller 4 Sofka U
 */

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * Representa una clase de una bicicleta.
 * @author Santiago Gonzalez - sgi1604@hotmail.com
 */

public class bicicleta extends vehiculo{
    
    /**
     * Representa el tipo de bicicleta.
     */
    public String tipoBicicleta;
            
    @Override
    public String tripulación() {
        return super.tripulación();
    }

    @Override
    public String medioDesplazamiento() {
        return ("Terrestre"); 
    }

    @Override
    public Date fechaMatricula() {
        return super.fechaMatricula(); 
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
        return super.getNewVehiculo(); 
    }

    @Override
    public Integer noRuedas() {
        return (2); 
    }
    
    /**
     * Método que establece el tipo de bicicleta entre 4 opciones, se da una 
     * quinta opcion para que el usuario escribe el tipo de bicicleta en caso 
     * de que las 4 opciones anteriores no sea el tipo de bicicleta que se 
     * desea registrar. 
     * @return Tipo de bicicleta. 
     */
    public String tipoBicicleta( ){
        Integer tipo;
        System.out.println("Ingrese 1 si la bicicleta es tipo urbana, "
                + "ingrese 2 si es de montaña, "
                + "ingrese 3 si es BMX, "
                + "ingrese 4 si es tandem, "
                + "ingrese 5 si es otro y especifiquelo: ");
        Scanner entradaEscaner = new Scanner (System.in); 
        tipo = Integer.parseInt(entradaEscaner.nextLine ()); 
        if (tipo==1){
            tipoBicicleta=("Tipo urbana");
        } else if (tipo==2){
            tipoBicicleta=("Tipo montaña");
        } else if (tipo==3){
            tipoBicicleta=("Tipo BMX");
        } else if (tipo==4){
            tipoBicicleta=("Tipo tandem");
        } else if (tipo==5){
        System.out.println("Especifique el tipo de bicicleta: ");
            tipoBicicleta= (entradaEscaner.nextLine ()); 
        } else {
            tipoBicicleta = "No especificado";
        }
        return (tipoBicicleta);
    }

}
