package Ejercicio_1;

public class Pelicula extends Item{
    private int cantCopias;
    private String info;
    public Pelicula(String nombre,int cantCopias,String info) {
        super(nombre);
        this.cantCopias = cantCopias;
        this.info = info;
    }

    @Override
    public String toString() {
        return "Pelicula{" +getNombre()+", "+
                "cantCopias=" + cantCopias +
                ", info='" + info + '\'' +
                '}';
    }

    public int getCantCopias() {
        return cantCopias;
    }

    public void setCantCopias(int cantCopias) {
        this.cantCopias = cantCopias;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public boolean disponibleParaAlquilar() {
        return cantCopias >= 1;
    }
    @Override
    public boolean alquilar(){
        if(disponibleParaAlquilar()){
            this.cantCopias--;
            return true;
        }
        return false;
    }
    public void devolver(){
       this.cantCopias++;
    }
}
