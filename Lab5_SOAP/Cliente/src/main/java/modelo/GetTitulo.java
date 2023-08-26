// Source code is decompiled from a .class file using FernFlower decompiler.
package modelo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
   name = "getTitulo",
   propOrder = {"arg0"}
)
public class GetTitulo {
   protected String arg0;

   public GetTitulo() {
   }

   public String getArg0() {
      return this.arg0;
   }

   public void setArg0(String var1) {
      this.arg0 = var1;
   }
}
