package Modelo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Cancion {
    private final String titulo;
    private final int anio;
    private final String genero;

    public Cancion(String titulo, int anio, String genero) {
        this.titulo = titulo;
        this.anio = anio;
        this.genero = genero;
    }

    public Cancion() {
        this.titulo = "";
        this.anio = 0;
        this.genero = "";
    }

    @XmlElement
    public String getTitulo() {
        return titulo;
    }

    @XmlElement
    public int getAnio() {
        return anio;
    }

    @XmlElement
    public String getGenero() {
        return genero;
    }
}