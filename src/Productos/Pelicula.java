package Productos;

/**
 * Clase para representar peliculas de RockBuster.
 * Una pelicula tiene nombre, director, género, sinopsis, precio y duración.
 */
public class Pelicula implements Producto{
    private String nombre;
    private String director;
    private String genero;
    private String sinopsis;
    private double precio;
    private int duracion;

    /**
     * Constructor de la clase Pelicula.
     * Inicializa una nueva instancia de Pelicula con los valores proporcionados.
     * @param nombre El nombre de la película.
     * @param director El director de la película.
     * @param genero El género de la película.
     * @param sinopsis La sinopsis de la película.
     * @param precio El precio de la película.
     * @param duracion La duración de la película en minutos.
     */
    public Pelicula(String nombre, String director, String genero, String sinopsis, double precio, int duracion){
        this.nombre = nombre;
        this.director = director;
        this.genero = genero;
        this.sinopsis = sinopsis; 
        this.precio = precio; 
        this.duracion = duracion;
    }

    /**
     * Obtiene el nombre de la película.
     * @return El nombre de la película.
     */
    @Override
    public String getNombre() { return nombre; }

    /**
     * Obtiene el director de la película.
     * @return El director de la película.
     */
    public String getDirector() { return director; }

    /**
     * Obtiene el género de la película.
     * @return El género de la película.
     */
    @Override
    public String getGenero() { return genero; }

    /**
     * Obtiene la sinopsis de la película.
     * @return La sinopsis de la película.
     */
    public String getSinopsis() { return sinopsis; }

    /**
     * Obtiene el precio de la película.
     * @return El precio de la película.
     */
    @Override
    public double getPrecio() { return precio; }

    /**
     * Obtiene la duración de la película.
     * @return La duración de la película.
     */
    @Override
    public int getDuracion() { return duracion; }

    /**
     * Muestra los detalles completos de la película.
     * Incluye nombre, director, duración, género, sinopsis y precio.
     */
    @Override
    public void mostrarDetalles(){
        System.out.println("==========================================");
        System.out.println(                   nombre                     );
        System.out.println("==========================================");
        System.out.println("Director: " + director);
        System.out.println("Duracion: " + duracion + " minutos");
        System.out.println("Genero: " + genero);
        System.out.println("Sinopsis: " + sinopsis);
        System.out.println("Precio: $" + precio);
        System.out.println("==========================================");
    }

    /**
     * Muestra la información básica de la película.
     * Incluye nombre y precio.
     */
    @Override
    public void mostrarInfoBasica(){
        System.out.println(nombre + " - $" + precio);
    }
}
