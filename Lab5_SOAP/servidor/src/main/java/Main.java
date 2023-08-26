import javax.xml.ws.Endpoint;

import Controlador.Memoria;

public class Main {
    public static void main(String[] args) {
        String direccion = "http://localhost:3000/canciones";
        System.out.println("Servidor corriendo en: " + direccion);
        Endpoint.publish(direccion, new Memoria());
    }
}
