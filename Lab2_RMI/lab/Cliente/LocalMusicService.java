package lab.Cliente;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.List;

import lab.Song;
import lab.Servidor.IMusicService;

public class LocalMusicService {

  public List<Song> search(String term) {
    
    try {
      Registry registry = LocateRegistry.getRegistry("localhost", 1099);
      IMusicService service = (IMusicService) registry.lookup("MusicService");
      
      return service.search(term);
      
    } catch (Exception e) {
      e.printStackTrace();
      return null;
    }

  }

}