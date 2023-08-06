package lab.Cliente;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

import lab.Servidor.SongServerInterface;

public class ClientUI {

  private SongServerInterface server;

  public ClientUI() {
    try {
      Registry registry = LocateRegistry.getRegistry(3000);
      server = (SongServerInterface) registry.lookup("SongServer"); 
    } catch (Exception e) {
      e.printStackTrace();
    }
    
    run();
  }


  public void run() {
    try (Scanner in = new Scanner(System.in)) {
      try {
       

        while(true) {
          System.out.print("Enter search term: ");
          String term = in.nextLine();

          System.out.println(server.search(term)); 
        }

      } catch (Exception e) {
          System.err.println("Client exception: " + e.toString());
          e.printStackTrace();
      }
    }
  }

  public static void main(String[] args) {
    new ClientUI();
  }

}