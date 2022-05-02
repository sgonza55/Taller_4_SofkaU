/*
 * Taller 4 - Sofka U
 */

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Representa un algoritmo para la creación de planetas 
 * y calculo de fuerza gravitatoria.
 * @author Santiago Gonzalez - sgi1604@hotmail.com
 */
public class Main {
    
    /**
     * Método main para creación de objetos (planetas).
     * @param args 
     */
    public static void main(String[] args) {
        
        /**
         * Interruptor para finalizar de crear planetas. 
         */
        Integer interrCrearPlanetas = 0;
        /**
         * Contador de creación de planetas. 
         */
        Integer contadorPlanetas = 0;
        /**
         * Lista donde se guardan los planetas creados. 
         */
        ArrayList<String> listaPlanetas = new ArrayList<>();
        
        /**
         * Ciclo do-while para la creación de planetas. Se crearan planetas 
         * siempre y cuando el interruptor interrCrearPlanetas siga valiendo 0.
         */
        do{
            contadorPlanetas = contadorPlanetas + 1; /* Contador de planetas, se suma +1 
                                                        ya que se va a crear uno nuevo*/
            
            planetas planeta = new planetas(); /* Creación de un nuevo planeta*/
            listaPlanetas.add(planeta.nombre());
            listaPlanetas.add(Integer.toString(planeta.ID()));
            listaPlanetas.add(Double.toString(planeta.diametro()));
            listaPlanetas.add(Double.toString(planeta.densidad()));
            listaPlanetas.add(Double.toString(planeta.distanciaAlSol()));
            listaPlanetas.add(Double.toString(planeta.gravedad()));
            listaPlanetas.add(Double.toString(planeta.masa()));
            
            
            System.out.println("¿Desea agregar otro planeta?. Ingrese cualquier número para continuar "
                    + "agregando planetas o 0 para terminar de agregar");
            Scanner entradaEscaner = new Scanner (System.in); 
            /**
             * Variable para decidir si se quieren seguir o no creando plaentas. 
             * Cualquier número Integer para aregar más planetas, 0 para terminar.
             */
            Integer agregarPlaneta = Integer.parseInt(entradaEscaner.nextLine()); 
                /**
                 * Ciclo if para decidir si se siguen o no creando planetas. 
                 * Cualquier número Integer para aregar más planetas, 0 para terminar.
                 */
                if (agregarPlaneta==0){
                    interrCrearPlanetas = interrCrearPlanetas + 1; /*En caso de no querer seguir se apaga el interruptor*/
                    System.out.println("Ha finalizado de crear el sistema planetario");
                    }
            }
        while (interrCrearPlanetas<1);  
        
        /**
         * Creación de clase para traer métodos para calcular atracción gravitatoria. 
         */
        atraccionGravitatoria fuerzaG = new atraccionGravitatoria();
        /**
         * Busca el valor ingreado en la lista de planetas creados anteriormente 
         * y devuelve la posición del atributo masa correspondiente a ese planeta. 
         * Luego con el valor de posción obtiene el valor de la masa de dicho planeta
         * y los gurda en las variables masa 1 y masa 2. 
         */
        int posMasa1=listaPlanetas.indexOf(fuerzaG.planeta1())+6; /*Posición masa planeta 1*/
        Double masa1=Double.parseDouble(listaPlanetas.get(posMasa1)); /*Masa planeta 1*/
        int posMasa2=listaPlanetas.indexOf(fuerzaG.planeta2())+6; /*Posición masa planeta 2 */
        Double masa2=Double.parseDouble(listaPlanetas.get(posMasa2)); /*Masa planeta 2*/
        /**
         * Solicita valor de distancia entre planetas. 
         */
        Double distanciaPlanetas = fuerzaG.distanciaPlanetas();
        /**
         * Cálculo de la atracción gravitatoria. 
         */
        fuerzaG.fuerzaGravitatoria(masa1, masa2,distanciaPlanetas);
        System.out.println("La fuerza gravitatoria es de: " + fuerzaG.fuerzaGravitatoria + " N.");
    }
}
