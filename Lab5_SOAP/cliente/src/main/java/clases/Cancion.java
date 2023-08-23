// Source code is decompiled from a .class file using FernFlower decompiler.
package clases;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
   name = "cancion",
   propOrder = {"genre", "title", "year"}
)
public class Cancion {
   protected String genre;
   protected String title;
   protected int year;

   public Cancion() {
   }

   public String getGenre() {
      return this.genre;
   }

   public void setGenre(String var1) {
      this.genre = var1;
   }

   public String getTitle() {
      return this.title;
   }

   public void setTitle(String var1) {
      this.title = var1;
   }

   public int getYear() {
      return this.year;
   }

   public void setYear(int var1) {
      this.year = var1;
   }
}
