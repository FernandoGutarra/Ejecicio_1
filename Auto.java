package Ejercicio_1;

public class Auto extends Item{
    private String tipo;
    private String marca;
    private String patente;
    private boolean disponible;
    public Auto(String nombre,String tipo,String marca,String patente) {
        super(nombre);
        this.tipo = tipo;
        this.marca = marca;
        this.patente = patente;
        disponible = true;
    }

    @Override
    public String toString() {
        return "Auto{" +getNombre() +", "+
                "tipo='" + tipo + '\'' +
                ", patente='" + patente + '\'' +
                ", disponible=" + disponible +
                '}';
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    private void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public boolean disponibleParaAlquilar() {
       return disponible;
    }
    public void actualizarDisponibilidad(){
        this.disponible = !disponible;
    }
    @Override
    public boolean alquilar(){
        if(disponibleParaAlquilar()){
            this.disponible = false;
            return true;
        }
        return false;
    }

    @Override
    public void devolver() {
        this.disponible = true;
    }
}
