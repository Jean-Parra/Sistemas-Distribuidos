package lab.Servidor;

import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.*;

public class SongServer implements SongServerInterface {

  private List<Song> songs;

  public SongServer() {

    songs = new ArrayList<>();

    Song song1 = new Song("Despacito", "Reggaeton", 2017);
    Song song2 = new Song("Gasolina", "Reggaeton", 2004);
    Song song3 = new Song("Limbo", "Reggaeton", 2012);
    Song song4 = new Song("Bon, Bon", "Hip Hop", 2010);
    Song song5 = new Song("Calypso", "Pop", 2018);
    Song song6 = new Song("Obsesión", "Bachata", 2002);
    Song song7 = new Song("El Perdedor", "Bachata", 2014);
    Song song8 = new Song("Vivir La Vida", "Salsa", 2013);
    Song song9 = new Song("Propuesta Indecente", "Bachata", 2013);
    Song song10 = new Song("Perdóname", "Pop", 2006);
    Song song11 = new Song("La Tortura", "Reggaeton", 2005);
    Song song12 = new Song("Bailando", "Reggaeton", 2014);
    Song song13 = new Song("Dura", "Reggaeton", 2018);
    Song song14 = new Song("La Camisa Negra", "Pop Rock", 2005);
    Song song15 = new Song("La Bicicleta", "Vallenato/Pop", 2016);

    songs.add(song1);
    songs.add(song2);
    songs.add(song3);
    songs.add(song4);
    songs.add(song5);
    songs.add(song6);
    songs.add(song7);
    songs.add(song8);
    songs.add(song9);
    songs.add(song10);
    songs.add(song11);
    songs.add(song12);
    songs.add(song13);
    songs.add(song14);
    songs.add(song15);

  }

  public List<Song> search(String term) throws RemoteException {
    List<Song> results = new ArrayList<>();

    for (Song song : songs) {
      if (song.getName().toLowerCase().contains(term.toLowerCase()) ||
          song.getGenre().toLowerCase().contains(term.toLowerCase()) ||
          song.getYear().toString().toLowerCase().contains(term.toLowerCase())) {
        results.add(song);
      }
    }
    return results;
  }

  public static void main(String[] args) {

    try {

      SongServer obj = new SongServer();
      SongServerInterface stub = (SongServerInterface) UnicastRemoteObject.exportObject(obj, 0);

      Registry registry = LocateRegistry.createRegistry(3000);

      registry.rebind("SongServer", stub);

      System.out.println("SongServer bound");
    } catch (Exception e) {
      System.err.println("Server exception: " + e.toString());
      e.printStackTrace();
    }
  }
}