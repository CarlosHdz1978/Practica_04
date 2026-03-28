package Mixdown;

public class DiscoMusical{
    private String nombre, artista, genero;
    private int estreno;
    private double precio; 

    public DiscoMusical(String nombre, String artista, String genero, int estreno, double precio){
        this.nombre = nombre;
        this.artista = artista;
        this.genero = genero;
        this.estreno = estreno;
        this.precio = precio; 
    }

    public String getNombre(){
        return nombre;
    }

    public String getArtista(){
        return artista;
    }

    public String getGenero(){
        return genero;
    }

    public int getEstreno(){
        return estreno;
    }

    public double getPrecio(){
        return precio; 
    }

    public void mostrarInfoDisco(){
        System.out.println("Disco: " + nombre);
        System.out.println("Artista: " + artista);
        System.out.println("Género: " + genero);
        System.out.println("Año: " + estreno);
        System.out.println("Precio: $" + precio);
    }
}