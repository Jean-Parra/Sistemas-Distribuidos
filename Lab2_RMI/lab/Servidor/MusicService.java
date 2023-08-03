package lab.Servidor;
import java.util.List;

import lab.Song;

public class MusicService implements IMusicService {

  SongDAO songDAO;

  public MusicService() {
    songDAO = new SongDAO();
  }

  public List<Song> search(String term) {
    return songDAO.search(term);
  }

}