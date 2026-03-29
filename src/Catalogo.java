import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Productos.*; 

/**
 * Clase que representa el catálogo de productos de RockBuster.
 * Permite agregar productos, obtener información y navegar mediante un menú interactivo.
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
     * @param p El producto a agregar a la lista.
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
                        System.out.print("Ingresa el género a buscar (ej. Ciencia Ficción, Musical, Aventura/Acción, Drama, Comedia Romántica, Rock y Pop): ");
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
     * Filtra y muestra los productos que coinciden con el género especificado.
     * @param genero El género a buscar (ignorando mayúsculas/minúsculas).
     */
    private void filtrarPorGenero(String genero) {
        System.out.println("\n--- RESULTADOS PARA GÉNERO: " + genero.toUpperCase() + " ---");
        boolean encontrado = false;
        for (int i = 0; i < listaProductos.size(); i++) {
            Producto p = listaProductos.get(i);
            // Compara ignorando mayúsculas y minúsculas
            if (p.getGenero().equalsIgnoreCase(genero)) {
                System.out.println((i + 1) + ". " + p.getNombre() + " - $" + p.getPrecio());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron productos de ese género.");
        }
    }

    /**
     * Filtra y muestra los productos con precio menor o igual al costo máximo.
     * @param costoMaximo El precio máximo a considerar.
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