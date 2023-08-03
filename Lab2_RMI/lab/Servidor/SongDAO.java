package lab.Servidor;
import java.util.ArrayList;
import java.util.List;

import lab.Song;

public class SongDAO {

  private List<Song> songs;
  
  public SongDAO() {
    songs = new ArrayList<>();
    Song song1 = new Song("Bohemian Rhapsody", "Rock", 1975);
    Song song2 = new Song("Imagine", "Pop", 1980);
    songs.add(song1);
    songs.add(song2);
  }

  public List<Song> search(String term) {
    List<Song> results = new ArrayList<>();
    for(Song song: songs) {
        if(song.getName().contains(term) ||
        song.getGenre().contains(term) || 
        song.getYear().toString().contains(term)) {
 
          results.add(song);
     }
    }
    return results; 
  }

}