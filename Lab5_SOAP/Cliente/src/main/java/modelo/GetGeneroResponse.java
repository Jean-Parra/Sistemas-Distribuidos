// Source code is decompiled from a .class file using FernFlower decompiler.
package modelo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
   name = "getGeneroResponse",
   propOrder = {"_return"}
)
public class GetGeneroResponse {
   @XmlElement(
      name = "return"
   )
   protected List<Cancion> _return;

   public GetGeneroResponse() {
   }

   public List<Cancion> getReturn() {
      if (this._return == null) {
         this._return = new ArrayList();
      }

      return this._return;
   }
}
