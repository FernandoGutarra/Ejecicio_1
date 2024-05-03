package Ejercicio_1;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.time.LocalDate;
import java.util.ArrayList;
/*
Para evitar convertirse en un nuevo Blockbuster, un videoclub de barrio ha decidido
diversificarse e incorporar a su cartera de negocios el alquiler de autos. Para modernizarse,
abandonará los registros en papel e implementará un sistema unificado de alquiler. El sistema
debe permitir alquilar un determinado ítem a un cliente hasta una fecha determinada y llevar
control de los ítems alquilados a cada cliente. Las películas poseen información filmográfica
y la cantidad de copias que se dispone de la misma. De los vehículos, se registra marca, kms
y patente. Los vehículos pueden ser eléctricos, nafteros o diesel. Una película puede ser
alquilada si hay copias aún disponibles, mientras que los vehículos sólo pueden ser alquilados
a un cliente por vez.
Se debe proveer además la funcionalidad necesaria para permitir conocer quiénes son los
clientes que poseen alquileres vencido
*/
public class VideoClub {
    private static ArrayList<Item> items = new ArrayList<>();
    private static ArrayList<Cliente> clientes = new ArrayList<>();
    public static void clienteAlquilaItem(Cliente c,Item i,LocalDate fechaEntrega){
        System.out.println(c.alquila(i,fechaEntrega));
    }
    public static void clienteDevuelveItem(Cliente c,Alquiler a){
        Item i = a.getItemAlquilado();
        c.desalquilar(a);
        System.out.println("Gracias Por Devolver El Item " + i);
    }
    private static ArrayList<ArrayList<Alquiler>> buscarClientesConAlquileresVencidos(){
        ArrayList<ArrayList<Alquiler>> alquileresVencidosDeUsuarios = new ArrayList<>();
        for(Cliente c:clientes){
            ArrayList<Alquiler> alsVencidoCliente  =  c.alquileresVencidos();
            if(!alsVencidoCliente.isEmpty()){
               alquileresVencidosDeUsuarios.add(alsVencidoCliente);
            }
        }
        return alquileresVencidosDeUsuarios;
    }
    public static void main(String [] args){
        Cliente fernando = new Cliente("Fernando");
        Cliente pablo = new Cliente("pablo");
        clientes.add(pablo);
        clientes.add(fernando);
        Pelicula matrix = new Pelicula("matrix",2,"asdf");
        Pelicula matrix2 = new Pelicula("matrix2",2,"asdf");
        items.add(matrix);
        items.add(matrix2);
        clienteAlquilaItem(fernando,matrix,LocalDate.of(2022,06,01));
        clienteAlquilaItem(pablo,matrix,LocalDate.of(2026,06,01));
        System.out.println(buscarClientesConAlquileresVencidos());
        clienteDevuelveItem(fernando,fernando.getAlquileres().get(0));
        System.out.println(buscarClientesConAlquileresVencidos());
    }
}
