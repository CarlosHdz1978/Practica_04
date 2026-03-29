package Mixdown;

import Productos.*;

/**
 * Clase adaptadora que permite que un DiscoMusical sea tratado como un Producto.
 * Implementa la interfaz Producto para integrar discos musicales en el catálogo.
 */
public class AdaptadorDiscoMusical implements Producto{

    private DiscoMusical disco; 

    /**
     * Constructor que inicializa el adaptador con un disco musical.
     * @param disco El disco musical a adaptar.
     */
    public AdaptadorDiscoMusical(DiscoMusical disco){
        this.disco = disco;
    }

    /**
     * Obtiene el nombre del disco musical.
     * @return El nombre del disco.
     */
    public String getNombre(){
        return disco.getNombre();
    }

    /**
     * Obtiene el género del disco musical.
     * @return El género del disco.
     */
    public String getGenero(){
        return disco.getGenero(); 
    }

    /**
     * Obtiene el precio del disco musical.
     * @return El precio del disco.
     */
    public double getPrecio(){
        return disco.getPrecio(); 
    }

    /**
     * Obtiene la duración del producto. Para discos musicales, siempre retorna 0
     * ya que la práctica no requiere esta propiedad.
     * @return La duración en minutos, siempre 0.
     */
    public int getDuracion(){
        return 0; 
    }

    /**
     * Muestra los detalles completos del disco musical.
     */
    public void mostrarDetalles(){
        disco.mostrarInfoDisco();
    }

    /**
     * Muestra la información básica del disco: nombre y precio.
     */
    public void mostrarInfoBasica(){
        System.out.println(this.disco.getNombre() + ":" + this.disco.getPrecio());
    }

}