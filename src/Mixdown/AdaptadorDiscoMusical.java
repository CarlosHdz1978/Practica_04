package src.Mixdown;

public class AdaptadorDiscoMusical implements Producto{

    private DiscoMusical discoMusical; 

    public AdaptadorDiscoMusical(DiscoMusical discoMusical){
        this.discoMusical = discoMusical;
    }

    public String getNombre(){
        this.discoMusical.getNombre();
    }

    public String getGenero(){
        this.discoMusical.getGenero(); 
    }

    public double getPrecio(){
        this.discoMusical.getPrecio(); 
    }

    public int getDuracion(){
        this.discoMusical.getDuracion();
    }

    public void mostrarDetalles(){
        this.discoMusical.imprimirDatos();
    }

    public void mostrarInfoBasica(){
        System.out.println(this.discoMusical.getNombre() + ":" + this.discoMusical.getPrecio());
    }


}