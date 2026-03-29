package Mixdown;

/**
 * Clase que representa un disco musical con sus atributos básicos.
 * Incluye nombre, artista, género, año y precio.
 */
public class DiscoMusical{
    private String nombre, artista, genero;
    private int estreno;
    private double precio; 

    /**
     * Constructor que inicializa un disco musical con todos sus atributos.
     * @param nombre El nombre del disco.
     * @param artista El artista del disco.
     * @param genero El género musical del disco.
     * @param estreno El año de estreno del disco.
     * @param precio El precio del disco.
     */
    public DiscoMusical(String nombre, String artista, String genero, int estreno, double precio){
        this.nombre = nombre;
        this.artista = artista;
        this.genero = genero;
        this.estreno = estreno;
        this.precio = precio; 
    }

    /**
     * Obtiene el nombre del disco musical.
     * @return El nombre del disco.
     */
    public String getNombre(){
        return nombre;
    }

    /**
     * Obtiene el artista del disco musical.
     * @return El artista del disco.
     */
    public String getArtista(){
        return artista;
    }

    /**
     * Obtiene el género musical del disco.
     * @return El género del disco.
     */
    public String getGenero(){
        return genero;
    }

    /**
     * Obtiene el año de estreno del disco musical.
     * @return El año de estreno del disco.
     */
    public int getEstreno(){
        return estreno;
    }

    /**
     * Obtiene el precio del disco musical.
     * @return El precio del disco.
     */
    public double getPrecio(){
        return precio; 
    }

    /**
     * Muestra la información completa del disco.
     * Incluye nombre, artista, género, año y precio.
     */
    public void mostrarInfoDisco(){
        System.out.println("Disco: " + nombre);
        System.out.println("Artista: " + artista);
        System.out.println("Género: " + genero);
        System.out.println("Año: " + estreno);
        System.out.println("Precio: $" + precio);
    }
}