package lab.Servidor;

import java.io.Serializable;

public class Song implements Serializable {

  private String name;
  
  private String genre;
  
  private Integer year;

  public Song(String name, String genre, Integer year) {
    this.name = name;
    this.genre = genre; 
    this.year = year;
  }

  public String getName() {
    return name;
  }

  public String getGenre() {
    return genre;
  }

  public Integer getYear() {
    return year;
  }

  @Override
  public String toString() {
    return "Song [name=" + name + ", genre=" + genre + ", year=" + year + "]";
  }

}