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

    public 


}