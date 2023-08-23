// Source code is decompiled from a .class file using FernFlower decompiler.
package clases;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
   name = "getByGenre",
   propOrder = {"arg0"}
)
public class GetByGenre {
   protected String arg0;

   public GetByGenre() {
   }

   public String getArg0() {
      return this.arg0;
   }

   public void setArg0(String var1) {
      this.arg0 = var1;
   }
}
