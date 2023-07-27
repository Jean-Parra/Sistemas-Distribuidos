package Modelo;

import com.google.gson.JsonObject;

public class Propiedades implements Cancion {
    private String titulo;
    private int año;
    private String genero;

    public Propiedades(String titulo, int año, String genero) {
        this.titulo = titulo;
        this.año = año;
        this.genero = genero;
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public int getAño() {
        return año;
    }

    @Override
    public String getGenero() {
        return genero;
    }

    public JsonObject toJson() {
        JsonObject json = new JsonObject();
        json.addProperty("titulo", titulo);
        json.addProperty("año", año);
        json.addProperty("genero", genero);
        return json;
    }
}