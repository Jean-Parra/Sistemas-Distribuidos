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
        canciones.add(new Propiedades("Stairway to Heaven", 1971, "Rock"));
        canciones.add(new Propiedades("Hotel California", 1977, "Rock"));
        canciones.add(new Propiedades("Sweet Child o' Mine", 1987, "Rock"));
        canciones.add(new Propiedades("Imagine", 1971, "Pop"));

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
