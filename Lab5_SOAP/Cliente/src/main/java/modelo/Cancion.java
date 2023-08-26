// Source code is decompiled from a .class file using FernFlower decompiler.
package modelo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
   name = "cancion",
   propOrder = {"anio", "genero", "titulo"}
)
public class Cancion {
   protected int anio;
   protected String genero;
   protected String titulo;

   public Cancion() {
   }

   public int getAnio() {
      return this.anio;
   }

   public void setAnio(int var1) {
      this.anio = var1;
   }

   public String getGenero() {
      return this.genero;
   }

   public void setGenero(String var1) {
      this.genero = var1;
   }

   public String getTitulo() {
      return this.titulo;
   }

   public void setTitulo(String var1) {
      this.titulo = var1;
   }
}
