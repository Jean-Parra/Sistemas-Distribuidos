// Source code is decompiled from a .class file using FernFlower decompiler.
package clases;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
   name = "getByNameResponse",
   propOrder = {"_return"}
)
public class GetByNameResponse {
   @XmlElement(
      name = "return"
   )
   protected List<Cancion> _return;

   public GetByNameResponse() {
   }

   public List<Cancion> getReturn() {
      if (this._return == null) {
         this._return = new ArrayList();
      }

      return this._return;
   }
}
