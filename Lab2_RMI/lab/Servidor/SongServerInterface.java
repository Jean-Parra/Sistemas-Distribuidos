package lab.Servidor;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface SongServerInterface extends Remote {
  public List<Song> search(String term) throws RemoteException; 
}