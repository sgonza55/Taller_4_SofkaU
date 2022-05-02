/*
 * Taller 4 Sofka U
 */

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * Representa una clase de un camión.
 * @author Santiago Gonzalez - sgi1604@hotmail.com
 */

public class camion extends vehiculo{
    
    /**
     * Altura del camión
     */
    public Float altura;
    
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
        noRuedas = 4;
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
        return super.getNewVehiculo(); 
    }
    
    /**
     * Método que establece la altura del camión.
     * @return altura del camión.
     */
    public Float altura() {
        System.out.println("Ingrese la altura del camión en metros: ");
        Scanner entradaEscaner = new Scanner (System.in); 
        altura = Float.valueOf(entradaEscaner.nextLine ());
        return (altura);
    }
    
}
