package lab.Servidor;
import java.util.List;

import lab.Song;  

public interface IMusicService {

  public List<Song> search(String term);

}