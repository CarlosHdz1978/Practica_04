package src.Mixdown;

public class AdaptadorDiscoMusical implements Producto{

    private DiscoMusical disco; 

    public AdaptadorDiscoMusical(DiscoMusical disco){
        this.disco = disco;
    }

    public String getNombre(){
        this.disco.getNombre();
    }

    public String getGenero(){
        this.disco.getGenero(); 
    }

    public double getPrecio(){
        this.disco.getPrecio(); 
    }

    public int getDuracion(){
        this.disco.getDuracion();
    }

    public void mostrarDetalles(){
        this.disco.mostrarInfoDisco();
    }

    public void mostrarInfoBasica(){
        System.out.println(this.disco.getNombre() + ":" + this.discoMusical.getPrecio());
    }


}