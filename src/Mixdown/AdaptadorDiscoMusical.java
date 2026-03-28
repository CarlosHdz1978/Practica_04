package Mixdown;

import Productos.*;

public class AdaptadorDiscoMusical implements Producto{

    private DiscoMusical disco; 

    public AdaptadorDiscoMusical(DiscoMusical disco){
        this.disco = disco;
    }

    public String getNombre(){
        return disco.getNombre();
    }

    public String getGenero(){
        return disco.getGenero(); 
    }

    public double getPrecio(){
        return disco.getPrecio(); 
    }

    public int getDuracion(){
        //La práctica no pide que los discos de Mixdown posean la propiedad de "duracion"
        //solamente regresa 0 para cumplir con la interfaz Producto
        return 0; 
    }

    public void mostrarDetalles(){
        disco.mostrarInfoDisco();
    }

    public void mostrarInfoBasica(){
        System.out.println(this.disco.getNombre() + ":" + this.disco.getPrecio());
    }

}