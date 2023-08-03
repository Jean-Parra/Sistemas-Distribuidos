package lab.Servidor;
import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {

  public static void main(String[] args) {

    try {
      Registry registry = LocateRegistry.createRegistry(1099);

      MusicService service = new MusicService();
      registry.rebind("MusicService", (Remote) service);

      System.out.println("Servicio RMI iniciado");

    } catch (Exception e) {
      e.printStackTrace();
    }

  }

}