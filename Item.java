package Ejercicio_1;

public abstract class Item {
    private String nombre;
    public Item(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }

    @Override
    public String toString() {
        return "Item{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    public abstract boolean disponibleParaAlquilar();
    public abstract boolean alquilar();
    public abstract void devolver();
}
