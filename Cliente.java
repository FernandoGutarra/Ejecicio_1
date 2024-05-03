package Ejercicio_1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cliente {
    private ArrayList<Alquiler> alquileres;
    private String nombre;
    public Cliente(String nombre){
     this.nombre = nombre;
     this.alquileres = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "alquileres=" + alquileres +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    public String alquila(Item i, LocalDate fechaVencimiento){
        if(i.alquilar()){
          this.alquileres.add(new Alquiler(i,fechaVencimiento));
          return "El Cliente " + this.getNombre() + " Alquilo Con Exito El Item " + i.getNombre() ;
        }else {
            return "Nose Pudo Alquilar El Item "+i.getNombre();
        }
    }
    public void desalquilar(Alquiler a){
        Item i = a.getItemAlquilado();
        i.devolver();
        this.alquileres.remove(a);
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Alquiler> getAlquileres() {
        return new ArrayList<>(alquileres);
    }
    public void addAlquiler(Alquiler a){
          this.alquileres.add(a);
    }

    public boolean alquileresVencidos() {
        for(Alquiler a:alquileres){
            if(a.estoyVencido()){
               return true;
            }
        }
        return false;
    }
}
