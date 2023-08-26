package Controlador;

import javax.jws.WebService;

import Modelo.Cancion;
import Modelo.Contrato;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@WebService(endpointInterface = "Modelo.Contrato")
public class Memoria implements Contrato {
    private ArrayList<Cancion> canciones = new ArrayList<>();

    public Memoria() {
        canciones.add(new Cancion("Bohemian Rhapsody", 1975, "Rock"));
        canciones.add(new Cancion("Despacito", 2017, "Reggaeton"));
        canciones.add(new Cancion("Gasolina", 2004, "Reggaeton"));
        canciones.add(new Cancion("Limbo", 2012, "Reggaeton"));
        canciones.add(new Cancion("Bon, Bon", 2010, "Hip Hop"));
        canciones.add(new Cancion("Calypso", 2018, "Pop"));
        canciones.add(new Cancion("Obsesión", 2002, "Bachata"));
        canciones.add(new Cancion("El Perdedor", 2014, "Bachata"));
        canciones.add(new Cancion("Vivir La Vida", 2013, "Salsa"));
        canciones.add(new Cancion("Propuesta Indecente", 2013, "Bachata"));
        canciones.add(new Cancion("Perdóname", 2006, "Pop"));
        canciones.add(new Cancion("La Tortura", 2005, "Reggaeton"));
        canciones.add(new Cancion("Bailando", 2014, "Reggaeton"));
        canciones.add(new Cancion("Dura", 2018, "Reggaeton"));
        canciones.add(new Cancion("La Camisa Negra", 2005, "Pop Rock"));
        canciones.add(new Cancion("La Bicicleta", 2016, "Vallenato/Pop"));
    }

    @Override
    public List<Cancion> getTitulo(String titulo) {
        List<Cancion> filtro = canciones.stream().filter(cancion -> {
            String filtroTitulo = cancion.getTitulo().toUpperCase();
            return filtroTitulo.contains(titulo.toUpperCase());
        }).collect(Collectors.toList());

        return filtro;
    }

    @Override
    public List<Cancion> getGenero(String genero) {
        List<Cancion> filtro = canciones.stream().filter(cancion -> {
            String filtroGenero = cancion.getGenero().toUpperCase();
            return filtroGenero.contains(genero.toUpperCase());
        }).collect(Collectors.toList());

        return filtro;
    }

    @Override
    public List<Cancion> getAnio(int anio) {
        List<Cancion> filtro = canciones.stream().filter(cancion -> {
            int filtroAnio = cancion.getAnio();
            return filtroAnio == anio;
        }).collect(Collectors.toList());

        return filtro;
    }
}
