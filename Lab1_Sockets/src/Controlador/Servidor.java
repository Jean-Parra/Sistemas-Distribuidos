package Controlador;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;

import Modelo.Cancion;
import Modelo.Propiedades;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Servidor {
    private static ArrayList<Cancion> canciones = new ArrayList<>();

    public static void main(String[] args) {
        // Agregar algunas canciones a la lista para buscar
        canciones.add(new Propiedades("Bohemian Rhapsody", 1975, "Rock"));
        canciones.add(new Propiedades("Despacito", 2017, "Reggaeton"));
        canciones.add(new Propiedades("Gasolina", 2004, "Reggaeton"));
        canciones.add(new Propiedades("Limbo", 2012, "Reggaeton"));
        canciones.add(new Propiedades("Bon, Bon", 2010, "Hip Hop"));
        canciones.add(new Propiedades("Calypso", 2018, "Pop"));
        canciones.add(new Propiedades("Obsesión", 2002, "Bachata"));
        canciones.add(new Propiedades("El Perdedor", 2014, "Bachata"));
        canciones.add(new Propiedades("Vivir La Vida", 2013, "Salsa"));
        canciones.add(new Propiedades("Propuesta Indecente", 2013, "Bachata"));
        canciones.add(new Propiedades("Perdóname", 2006, "Pop"));
        canciones.add(new Propiedades("La Tortura", 2005, "Reggaeton"));
        canciones.add(new Propiedades("Bailando", 2014, "Reggaeton"));
        canciones.add(new Propiedades("Dura", 2018, "Reggaeton"));
        canciones.add(new Propiedades("La Camisa Negra", 2005, "Pop Rock"));
        canciones.add(new Propiedades("La Bicicleta", 2016, "Vallenato/Pop"));

        try {
            // Crear un ServerSocket en el puerto 3000 para aceptar conexiones de clientes
            ServerSocket serverSocket = new ServerSocket(3000);

            // Esperar a que un cliente se conecte al servidor
            Socket clientSocket = serverSocket.accept();

            // Crear un BufferedReader para leer los mensajes enviados por el cliente
            BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            String message;
            // Bucle para leer continuamente los mensajes enviados por el cliente
            while ((message = reader.readLine()) != null) {
                // Convertir el mensaje JSON del cliente a un objeto JsonObject
                JsonObject request = JsonParser.parseString(message).getAsJsonObject();

                // Obtener la consulta del cliente del objeto JsonObject y convertirla a minúsculas
                String query = request.get("query").getAsString().toLowerCase();

                // Crear un JsonArray para almacenar las respuestas (las canciones que coinciden con la consulta)
                JsonArray response = new JsonArray();

                // Recorrer la lista de canciones y buscar coincidencias con la consulta
                for (Cancion cancion : canciones) {
                    // Convertir los valores de título y género a minúsculas y verificar si contienen la consulta
                    if (cancion.getTitulo().toLowerCase().contains(query) ||
                        cancion.getGenero().toLowerCase().contains(query) ||
                        String.valueOf(cancion.getAño()).contains(query)) {
                        // Si hay una coincidencia, agregar la canción al JsonArray de respuesta
                        response.add(((Propiedades) cancion).toJson());
                    }
                }

                // Enviar la respuesta al cliente convirtiéndola a bytes y escribiéndola en el OutputStream
                clientSocket.getOutputStream().write(response.toString().getBytes());
            }
            serverSocket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
