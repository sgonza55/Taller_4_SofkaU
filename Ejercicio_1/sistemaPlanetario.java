/*
 * Taller 4 - Sofka U.
 */

/**
 * Representa una clase abstracta de un sistema planetario. 
 * @author Santiago Gonzalez - sgi1604@hotmail.com
 */
public abstract class sistemaPlanetario {
    
    /**
     * Nombre del planeta.
     */
    public String nombre;
    /**
     * Identificador del planeta
     */
    public Integer ID;
    /**
     * Masa del planeta
     */
    public Double masa;
    /**
     * Densidad del planeta.
     */
    public Double densidad;
    /**
     * Diametro del planeta
     */
    public Double diametro;
    /**
     * Distancia al sol del planeta.
     */
    public Double distanciaAlSol;
    /**
     * Gravedad del planeta. 
     */
    public Double gravedad;
    /**
     * Cosntante de gravitación universal.
     */
    public final Double gravitacionUniversal = 6.67430E-11;
    
    /**
     * Método abstracto para ingresar el nombre del planeta.
     * @return nombre
     */
    public abstract String nombre();
    /**
     * Método abstracto para ingresar el identificador del planeta.
     * @return identificador 
     */
    public abstract Integer ID();
    /**
     * Método abstracto para ingresar la densidad del planeta.
     * @return densidad 
     */
    public abstract Double densidad();
    /**
     * Método abstracto para ingresar el diametro del planeta.
     * @return diametro
     */
    public abstract Double diametro();
    /**
     * Método abstracto para ingresar la distancia a 
     * la que orbita del sol del planeta.
     * @return distancia al sol.
     */
    public abstract Double distanciaAlSol();
    /**
     * Método abstracto para ingresar gravedad del planeta.
     * @return gravedad
     */
    public abstract Double gravedad();
    /**
     * Método abstracto para calcualr la masa del planeta.
     * @return masa 
     */
    public abstract Double masa();
}
