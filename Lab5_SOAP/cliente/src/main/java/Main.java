import modelo.Cancion;
import controlador.MemoriaService;
import controlador.Contrato;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        MemoriaService CancionsRepositoryService = new MemoriaService();
        Contrato CancionsRepository = CancionsRepositoryService.getMemoriaPort();

        List<Cancion> filteredByGenreCancions = CancionsRepository.getGenero("Reggaeton");
        System.out.println("Filtro por genero:");
        for(Cancion s: filteredByGenreCancions.stream().collect(Collectors.toList())) {
            System.out.println(s.getTitulo());
        }

        List<Cancion> filteredByYearCancions = CancionsRepository.getAnio(2014);
        System.out.println("\nFiltro por año:");
        for(Cancion s: filteredByYearCancions.stream().collect(Collectors.toList())) {
            System.out.println(s.getTitulo());
        }

        List<Cancion> filteredByNameCancions = CancionsRepository.getTitulo("de");
        System.out.println("\nFiltro por nombre:");
        for(Cancion s: filteredByNameCancions.stream().collect(Collectors.toList())) {
            System.out.println(s.getTitulo());
        }
    }
}