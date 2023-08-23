import java.util.List;
import java.util.stream.Collectors;

import clases.*;



public class Main {

  public static void main(String[] args) {
    System.out.println("hola");
    
    ServicioCancionesService servicio = new ServicioCancionesService();
    ServicioCanciones cliente = servicio.getServicioCancionesPort();

    List<Cancion> filteredByGenreCancions = cliente.getByGenre("Rock");
    System.out.println("Cancions filtered by genre:");
    for(Cancion s: filteredByGenreCancions.stream().collect(Collectors.toList())) {
        System.out.println(s.getTitle());
    }

    List<Cancion> filteredByYearCancions = cliente.getByYear(2007);
    System.out.println("\nCancions filtered by year:");
    for(Cancion s: filteredByYearCancions.stream().collect(Collectors.toList())) {
        System.out.println(s.getTitle());
    }

    List<Cancion> filteredByNameCancions = cliente.getByName("Cancion 1");
    System.out.println("\nCancions filtered by name:");
    for(Cancion s: filteredByNameCancions.stream().collect(Collectors.toList())) {
        System.out.println(s.getTitle());
    }

  }

}