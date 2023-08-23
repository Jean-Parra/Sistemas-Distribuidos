package controlador;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import modelo.*;

@WebService(targetNamespace = "http://example.com/canciones")
public class ServicioCanciones implements Contrato {

  private static ArrayList<Cancion> canciones = new ArrayList<>();

  public ServicioCanciones() {
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

  @WebMethod
  public List<Cancion> getByName(String nombre) {
    ArrayList<Cancion> getnombre = new ArrayList<>();

    for (Cancion cancion : canciones) {
      if (cancion.getTitle().toLowerCase().contains(nombre)) {
        getnombre.add(cancion);

      }
    }
    return getnombre;
  }

  @WebMethod
  public List<Cancion> getByGenre(String genero) {
    ArrayList<Cancion> getgenero = new ArrayList<>();

    for (Cancion cancion : canciones) {
      if (cancion.getGenre().toLowerCase().contains(genero)) {
        getgenero.add(cancion);

      }
    }
    return getgenero;
  }

  @WebMethod
  public List<Cancion> getByYear(int anio) {
    ArrayList<Cancion> getanio = new ArrayList<>();

    for (Cancion cancion : canciones) {
        if (String.valueOf(cancion.getYear()).contains(String.valueOf(anio))) {
            getanio.add(cancion);
        }
    }

    return getanio;
}

}