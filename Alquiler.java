package Ejercicio_1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Alquiler {
    private String nombreDeCliente;
    private Item itemAlquilado;
    private LocalDate fechaDevolucion;
    public Alquiler(String nombreDeCliente,Item itemAlquilado,LocalDate fechaDevolucion){
         this.nombreDeCliente = nombreDeCliente;
         this.itemAlquilado = itemAlquilado;
         this.fechaDevolucion = fechaDevolucion;
    }

    @Override
    public String toString() {
        return "Alquiler{" +
                "nombreDeCliente='" + nombreDeCliente + '\'' +
                ", itemAlquilado=" + itemAlquilado +
                ", fechaDevolucion=" + fechaDevolucion +
                '}';
    }



    public boolean estoyVencido(){
        LocalDate fechaActual = LocalDate.now();
        return fechaDevolucion.isBefore(fechaActual);
    }

    public String getNombreDeCliente() {
        return nombreDeCliente;
    }

    public void setNombreDeCliente(String nombreDeCliente) {
        this.nombreDeCliente = nombreDeCliente;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public Item getItemAlquilado(){
        return this.itemAlquilado;
    }

}
