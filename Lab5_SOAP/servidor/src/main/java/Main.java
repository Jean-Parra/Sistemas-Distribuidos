import javax.xml.ws.Endpoint;

import controlador.ServicioCanciones;

public class Main {
  
  public static void main(String[] args) {
    Endpoint.publish("http://localhost:9999/ws/canciones", new ServicioCanciones()); 
  }

}