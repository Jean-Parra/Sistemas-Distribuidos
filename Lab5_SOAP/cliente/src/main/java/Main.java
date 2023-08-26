import modelo.Cancion;
import controlador.MemoriaService;
import controlador.Contrato;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        try {
            MemoriaService Memoria = new MemoriaService();
            Contrato Canciones = Memoria.getMemoriaPort();

            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese una palabra para filtrar (o 'exit' para salir): ");
            String query = scanner.nextLine();

            List<Cancion> canciones = Canciones.getGenero("");

            System.out.println("Resultados para la palabra: " + query);
            for (Cancion cancion : canciones.stream().collect(Collectors.toList())) {
                if (cancion.getTitulo().toLowerCase().contains(query.toLowerCase()) ||
                        cancion.getGenero().toLowerCase().contains(query.toLowerCase()) ||
                        String.valueOf(cancion.getAnio()).contains(query)) {
                    System.out.println("Título: " + cancion.getTitulo());
                    System.out.println("Género: " + cancion.getGenero());
                    System.out.println("Año: " + cancion.getAnio());
                    System.out.println("----------------------");
                }
            }
            scanner.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
