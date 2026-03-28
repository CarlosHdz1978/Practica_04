package Productos;

/**
 * Interfaz que define los métodos para un producto.
 * Las clases Pelicula, Saga y AdaptadorDisco la aplicaran para utilizar el patron Composite. 
 */
public interface Producto {
    
    /**
     * Obtiene el nombre del producto.
     * @return El nombre del producto.
     */
    public String getNombre();

    /**
     * Obtiene el género del producto.
     * @return El género del producto.
     */
    public String getGenero();

    /**
     * Obtiene el precio del producto.
     * @return El precio del producto.
     */
    public double getPrecio();

    /**
     * Obtiene la duración del producto en minutos.
     * @return La duración del producto.
     */
    public int getDuracion();

    /**
     * Muestra los detalles completos del producto.
     */
    public void mostrarDetalles();

    /**
     * Muestra la información básica del producto.
     */
    public void mostrarInfoBasica();
}