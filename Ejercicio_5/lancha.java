/*
 * Taller 4 - Sofka U.
 */

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * Representa una clase de una lancha.
 * @author Santiago Gonzalez - sgi1604@hotmail.com
 */

public class lancha extends vehiculo{
    
    /**
     * Atributo que representa el tipo de lancha. 
     */
    public String tipoLancha;
    
    @Override
    public String tripulación() {
        return super.tripulación(); 
    }

    @Override
    public String medioDesplazamiento() {
        medioDesplazamiento = "Acuatico";
        return (medioDesplazamiento);
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
    
    /**
     * Método que establece el tipo de lancha
     * @return tipo motor, vela o remo.
     */
    public String tipoLancha() {
        Integer tipo;
        System.out.println("Ingrese 1 si la lancha es de motor, ingrese 2 si es de vela o remo");
        Scanner entradaEscaner = new Scanner (System.in); 
        tipo = Integer.parseInt(entradaEscaner.nextLine ()); 
        if (tipo==1){
            tipoLancha=("Tipo motor");
        } else if (tipo==2){
            tipoLancha=("Tipo vela o remo");
        } else {
            tipoLancha = "No especificado";
        }
        return(tipoLancha);
    } 
}
