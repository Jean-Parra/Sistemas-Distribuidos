package modelo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Cancion {
    private final String title;
    private final int year;
    private final String genre;

    public Cancion(String title,  int year, String genre) {
        this.title = title;
        this.genre = genre;
        this.year = year;
    }

    // Required by JAXB
    public Cancion() {
        this.title = "";
        this.year = 0;
        this.genre = "";
       
    }

    @XmlElement
    public String getTitle() {
        return title;
    }


    @XmlElement
    public String getGenre() {
        return genre;
    }

    @XmlElement

    public int getYear() {
        return year;
    }
}