import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Productos.*; 

/**
 * Clase que representa el catálogo de productos de RockBuster.
 * Permite mostrar música y películas, obtener información y navegar mediante un menú interactivo.
 * 
 * @author Syntax Error
 */
public class Catalogo {
    
    private List<Producto> listaProductos;
    private Scanner scanner;

    /**
     * Constructor que inicializa el catálogo con una lista vacía de productos y un scanner para entrada.
     */
    public Catalogo() {
        listaProductos = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    /**
     * Agrega un producto al catálogo.
     * @param p El producto a agregar a la lista (película, saga o disco con el adaptador)
     */
    public void agregarProducto(Producto p) {
        listaProductos.add(p);
    }

    /**
     * Obtiene la cantidad de productos en el catálogo.
     * @return El número total de productos en la lista.
     */
    public int getCantidadProductos() {
        return listaProductos.size();
    }

    /**
     * Muestra el menú interactivo para navegar por el catálogo.
     * Permite ver el catálogo completo, filtrar por género o costo, y ver detalles de productos.
     * Las opciones incluyen:
     * <ul>
     *  <li>1. Ver catálogo completo</li>
     *  <li>2. Filtrar por género</li>
     *  <li>3. Filtrar por costo máximo</li>
     *  <li>4. Salir del programa</li>
     * </ul>
     * El menú se repite hasta que el usuario decida salir 
     */
    public void mostrarMenu() {
        int opcion = 0;
        do {
            System.out.println("\n=== MENÚ PRINCIPAL ROCKBUSTER ===");
            System.out.println("1. Ver el catálogo completo");
            System.out.println("2. Filtrar por género");
            System.out.println("3. Filtrar por un costo máximo");
            System.out.println("4. Mostrar información completa de un producto");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            
            try {
                opcion = Integer.parseInt(scanner.nextLine());
                
                switch (opcion) {
                    case 1:
                        verCatalogoCompleto();
                        break;
                    case 2:
                        // Mostramos géneros disponibles
                        mostrarGenerosDisponibles();
                        System.out.print("Ingresa el género a buscar: ");
                        String genero = scanner.nextLine();
                        filtrarPorGenero(genero);
                        break;
                    case 3:
                        System.out.print("Ingresa el costo máximo: $");
                        double costo = Double.parseDouble(scanner.nextLine());
                        filtrarPorCostoMaximo(costo);
                        break;
                    case 4:
                        System.out.print("Ingresa el número del producto para ver sus detalles (1 - " + listaProductos.size() + "): ");
                        int seleccion = Integer.parseInt(scanner.nextLine());
                        mostrarDetallesProducto(seleccion);
                        break;
                    case 5:
                        System.out.println("¡Gracias por visitar RockBuster!");
                        break;
                    default:
                        System.out.println("Opción inválida. Intenta de nuevo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingresa un número válido.");
            }
            
        } while (opcion != 5);
    }


    /**
     * Muestra el catálogo completo con nombre y precio de cada producto.
     * Para cada producto se muestra su número de índice, nombre y precio.
     */
    private void verCatalogoCompleto() {
        System.out.println("\n--- CATÁLOGO DE ROCKBUSTER ---");
        // Al mostrar el catálogo sólo se debe mostrar el nombre de los productos y su precio
        for (int i = 0; i < listaProductos.size(); i++) {
            Producto p = listaProductos.get(i);
            System.out.println((i + 1) + ". " + p.getNombre() + " - $" + p.getPrecio());
        }
    }

    /**
     * Muestra todos los géneros disponibles en el catálogo.
     * Este método recorre todos los productos y extrae los géneros sin repetir,
     * proporcionando al usuario una referencia de qué géneros puede buscar.
     * <p>Los géneros se muestran en el orden en que aparecen en el catálogo.
     */
    private void mostrarGenerosDisponibles() {
        List<String> generosUnicos = new ArrayList<>();
        for (Producto p : listaProductos) {
            String genero = p.getGenero();
            if (!generosUnicos.contains(genero)) {
                generosUnicos.add(genero);
            }
        }
        
        System.out.println("\n Géneros disponibles en el catálogo:");
        for (String g : generosUnicos) {
            System.out.println("  - " + g);
        }
        System.out.println();
    }

    /**
     * Filtra y muestra los productos que coinciden con el género especificado.
     * Utiliza una búsqueda flexible que considera tanto coincidencias exactas
     * como parciales.
     * Muestra una lista de géneros disponibles como sugerencia para el usuario.
     * Después de mostrar los resultados, permite al usuario seleccionar
     * un producto para ver sus detalles completos.
     * @param generoBuscado El género a buscar 
     */
    private void filtrarPorGenero(String genero) {
        System.out.println("\n--- RESULTADOS PARA GÉNERO: " + genero.toUpperCase() + " ---");
        //boolean encontrado = false;

        List<Producto> productosFiltrados = new ArrayList<>();
        List<Integer> indicesOriginales = new ArrayList<>();

        // Buscar productos con coincidencia parcial
        for (int i = 0; i < listaProductos.size(); i++) {
            Producto p = listaProductos.get(i);
            String generoProducto = p.getGenero();

            // Revisando si hay coincidencia exacta o parcial
            if (generoProducto.equalsIgnoreCase(genero) || generoProducto.toLowerCase().contains(genero.toLowerCase())){
                productosFiltrados.add(p);
                indicesOriginales.add(i+1);
                //encontrado = true;
            }
        }
        if (productosFiltrados.isEmpty()) {
            System.out.println("No se encontraron productos de ese género.");
            System.out.println("Sugerencia: Ingresa uno de los géneros mostrados anteriormente.");
            return;
        }
        
        // Mostramos resultados
        System.out.println("\n Resultados (" + productosFiltrados.size() + " productos): ");
        for (int i = 0; i < productosFiltrados.size(); i++) {
            Producto p = productosFiltrados.get(i);
            System.out.println(" [" + indicesOriginales.get(i) + "] " + p.getNombre() + " - $" + p.getPrecio());
        }

        // Preguntamos si el usuario quiere ver detalles
        System.out.println("\n ¿Desea ver detalles de algún producto? (Ingrese número o 0 para salir)");
        try {
            int seleccion = Integer.parseInt(scanner.nextLine());
            if (seleccion > 0 && seleccion <= listaProductos.size()) {
                listaProductos.get(seleccion -1).mostrarDetalles();
            }
        } catch (NumberFormatException e) {
            //System.out.println("Entrada inválida");
        }
    }

    /**
     * Filtra y muestra los productos cuyo precio es menor o igual al costo máximo especificado.
     * @param costoMaximo El precio máximo para filtrar los productos
     */
    private void filtrarPorCostoMaximo(double costoMaximo) {
        System.out.println("\n--- PRODUCTOS HASTA: $" + costoMaximo + " ---");
        boolean encontrado = false;
        for (int i = 0; i < listaProductos.size(); i++) {
            Producto p = listaProductos.get(i);
            if (p.getPrecio() <= costoMaximo) {
                System.out.println((i + 1) + ". " + p.getNombre() + " - $" + p.getPrecio());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No hay productos por debajo de ese costo.");
        }
    }

    /**
     * Muestra los detalles completos del producto seleccionado por índice.
     * @param seleccion El número del producto (1-based) a mostrar.
     */
    private void mostrarDetallesProducto(int seleccion) {
            
        int indice = seleccion - 1; 
        
        if (indice >= 0 && indice < listaProductos.size()) {
            System.out.println("\n=== DETALLES DEL PRODUCTO ===");
            Producto p = listaProductos.get(indice);
            p.mostrarDetalles(); 
        } else {
            System.out.println("Selección inválida. El producto no existe.");
        }
    }
}