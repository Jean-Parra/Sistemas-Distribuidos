package Vista;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;
public class Cliente {
    public static void main(String[] args) {
        try {
            // Establecer una conexión con el servidor en localhost y puerto 3000
            Socket socket = new Socket("localhost", 3000);

            // Crear un PrintWriter para enviar mensajes al servidor
            PrintWriter writer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);

            // Crear un objeto Scanner para leer la entrada del usuario desde la consola
            Scanner scanner = new Scanner(System.in);

            // Bucle para realizar consultas continuas al servidor
            while (true) {
                System.out.print("Ingrese una consulta (o 'exit' para salir): ");
                String query = scanner.nextLine();

                // Salir del bucle si el usuario ingresa 'exit'
                if (query.equalsIgnoreCase("exit")) {
                    break;
                }

                // Crear un objeto JsonObject para representar la solicitud al servidor
                JsonObject request = new JsonObject();

                // Agregar la consulta del usuario al objeto JsonObject con la clave "query"
                request.addProperty("query", query);

                // Enviar la solicitud al servidor convirtiéndola a una cadena y terminándola con un salto de línea
                writer.println(request.toString());

                // Crear un búfer de bytes para recibir la respuesta del servidor
                byte[] buffer = new byte[1024];

                // Leer la respuesta del servidor desde el InputStream y almacenarla en el búfer de bytes
                int bytesRead = socket.getInputStream().read(buffer);

                // Convertir la respuesta del servidor, que está en formato de bytes, a una cadena
                String responseString = new String(buffer, 0, bytesRead);

                // Convertir la cadena de respuesta a un objeto JsonArray utilizando la librería Gson
                JsonArray response = JsonParser.parseString(responseString).getAsJsonArray();

                // Imprimir la respuesta del servidor (las canciones que coinciden con la consulta del usuario)
                System.out.println(response);
            }

            // Cerrar los flujos y sockets al finalizar la comunicación
            writer.close();
            scanner.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
