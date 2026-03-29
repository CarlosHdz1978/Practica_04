import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Productos.*; 

public class Catalogo {
    
    private List<Producto> listaProductos;
    private Scanner scanner;

    public Catalogo() {
        listaProductos = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void agregarProducto(Producto p) {
        listaProductos.add(p);
    }

    public int getCantidadProductos() {
        return listaProductos.size();
    }

    // --- MENÚ INTERACTIVO ---

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


    private void verCatalogoCompleto() {
        System.out.println("\n--- CATÁLOGO DE ROCKBUSTER ---");
        // Al mostrar el catálogo sólo se debe mostrar el nombre de los productos y su precio
        for (int i = 0; i < listaProductos.size(); i++) {
            Producto p = listaProductos.get(i);
            System.out.println((i + 1) + ". " + p.getNombre() + " - $" + p.getPrecio());
        }
    }

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