package Ejercicio_1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Alquiler {
    private Item itemAlquilado;
    private LocalDate fechaDevolucion;
    public Alquiler(Item itemAlquilado,LocalDate fechaDevolucion){
         this.itemAlquilado = itemAlquilado;
         this.fechaDevolucion = fechaDevolucion;
    }

    @Override
    public String toString() {
        return "Alquiler{" +
                "itemAlquilado=" + itemAlquilado +
                ", fechaDevolucion=" + fechaDevolucion +
                '}';
    }

    public boolean estoyVencido(){
        LocalDate fechaActual = LocalDate.now();
        return fechaDevolucion.isBefore(fechaActual);
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public Item getItemAlquilado(){
        return this.itemAlquilado;
    }

}
