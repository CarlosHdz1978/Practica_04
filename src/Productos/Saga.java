package Productos;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase para representar una saga de peliculas de RockBuster.
 * Una saga de pelicula tiene nombre, género, precio y duración.
 */
public class Saga implements Producto{
    private String nombre;
    private String genero;
    private List<Producto> peliculas;

    /**
     * Constructor de la clase Saga.
     * Inicializa una nueva instancia de Saga con los valores proporcionados.
     * @param nombre El nombre de la saga de peliculas.
     * @param genero El género de la saga de peliculas.
     */
    public Saga(String nombre, String genero){
        this.nombre = nombre;
        this.genero = genero;
        this.peliculas = new ArrayList<>();
    }

    /**
     * Agrega una película a la saga.
     * @param p La película a agregar a la lista de películas de la saga.
     */
    public void agregar(Producto p){
        peliculas.add(p);
    }

    /**
     * Remueve una película de la saga.
     * @param p La película a remover de la lista de películas de la saga.
     */
    public void remover(Producto p){
        peliculas.remove(p);
    }

    /**
     * Obtiene la lista de películas que componen la saga.
     * @return La lista de películas en la saga.
     */
    public List<Producto> getComponentes() { return peliculas; }

    /**
     * Obtiene el nombre de la saga de peliculas.
     * @return El nombre de la saga de peliculas.
     */
    @Override
    public String getNombre() { return nombre; }

    /**
     * Obtiene el género de la saga de peliculas.
     * @return El género de la saga de peliculas.
     */
    @Override
    public String getGenero() { return genero; }

    /**
     * Calcula la suma de los precios de todas las películas en la saga y le aplica un 5% de descuento.
     * @return El precio total de la saga de peliculas.
     */
    @Override
    public double getPrecio() { 
        double total = 0;
        for(Producto p : peliculas){
            total += p.getPrecio();
        }
        return total*0.95;
    }

    /**
     * Calcula la suma de las duraciones de todas las películas en la saga.
     * @return La duración total de la saga de peliculas.
     */
    @Override
    public int getDuracion() { 
        int total = 0;
        for(Producto p : peliculas){
            total += p.getDuracion();
        }
        return total;
    }

    /**
     * Muestra los detalles completos de la saga de peliculas.
     * Incluye nombre de la saga, género, nombre de las peliculas que contiene, precio y duracion.
     */
    @Override
    public void mostrarDetalles(){
        System.out.println("==========================================");
        System.out.println(                   nombre                     );
        System.out.println("==========================================");
        System.out.println("Genero: " + genero);
        System.out.println("Duracion: " + getDuracion());
        System.out.println("Esta Saga contiene las peliculas");
        System.out.println("------------------------------------------");
        for(Producto p : peliculas){
            p.mostrarInfoBasica();
        }
        System.out.println("------------------------------------------");
        System.out.println("Aplicando el descuento el precio final seria de: $" + getPrecio());
        System.out.println("==========================================");
    }

    /**
     * Muestra la información básica de la saga de peliculas.
     * Incluye nombre y precio total.
     */
    @Override
    public void mostrarInfoBasica(){
        System.out.println("Saga: " + nombre + " - $" + getPrecio());
    }
}