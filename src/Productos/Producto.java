package src.Productos;

/**
 * Interfaz que define los métodos para un producto.
 * Las clases Pelicula, Saga y AdaptadorDisco la aplicaran para utilizar el patron Composite. 
 */
public interface Producto {
    
    /**
     * Obtiene el nombre del producto.
     * @return El nombre del producto.
     */
    String getNombre();

    /**
     * Obtiene el género del producto.
     * @return El género del producto.
     */
    String getGenero();

    /**
     * Obtiene el precio del producto.
     * @return El precio del producto.
     */
    double getPrecio();

    /**
     * Obtiene la duración del producto en minutos.
     * @return La duración del producto.
     */
    int getDuracion();

    /**
     * Muestra los detalles completos del producto.
     */
    void mostrarDetalles();

    /**
     * Muestra la información básica del producto.
     */
    void mostrarInfoBasica();
}