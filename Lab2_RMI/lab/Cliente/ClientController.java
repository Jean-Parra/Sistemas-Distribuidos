package lab.Cliente;

import java.util.List;
import java.util.Scanner;

import lab.Song;

public class ClientController {

  private LocalMusicService musicService;

  public ClientController() {
    musicService = new LocalMusicService();
  }

  public void start() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese palabra a buscar: ");
    String term = scanner.nextLine();

    List<Song> results = musicService.search(term);
    
    System.out.println("Canciones encontradas:");
    for(Song song: results) {
      System.out.println(song.getName());
    }
  }

}