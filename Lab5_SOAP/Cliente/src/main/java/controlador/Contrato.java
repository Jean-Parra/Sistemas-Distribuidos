// Source code is decompiled from a .class file using FernFlower decompiler.
package controlador;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import modelo.Cancion;
import modelo.ObjectFactory;

@WebService(
   name = "Contrato",
   targetNamespace = "http://Modelo/"
)
@XmlSeeAlso({ObjectFactory.class})
public interface Contrato {
   @WebMethod
   @WebResult(
      targetNamespace = ""
   )
   @RequestWrapper(
      localName = "getTitulo",
      targetNamespace = "http://Modelo/",
      className = "modelo.GetTitulo"
   )
   @ResponseWrapper(
      localName = "getTituloResponse",
      targetNamespace = "http://Modelo/",
      className = "modelo.GetTituloResponse"
   )
   @Action(
      input = "http://Modelo/Contrato/getTituloRequest",
      output = "http://Modelo/Contrato/getTituloResponse"
   )
   List<Cancion> getTitulo(@WebParam(name = "arg0",targetNamespace = "") String var1);

   @WebMethod
   @WebResult(
      targetNamespace = ""
   )
   @RequestWrapper(
      localName = "getAnio",
      targetNamespace = "http://Modelo/",
      className = "modelo.GetAnio"
   )
   @ResponseWrapper(
      localName = "getAnioResponse",
      targetNamespace = "http://Modelo/",
      className = "modelo.GetAnioResponse"
   )
   @Action(
      input = "http://Modelo/Contrato/getAnioRequest",
      output = "http://Modelo/Contrato/getAnioResponse"
   )
   List<Cancion> getAnio(@WebParam(name = "arg0",targetNamespace = "") int var1);

   @WebMethod
   @WebResult(
      targetNamespace = ""
   )
   @RequestWrapper(
      localName = "getGenero",
      targetNamespace = "http://Modelo/",
      className = "modelo.GetGenero"
   )
   @ResponseWrapper(
      localName = "getGeneroResponse",
      targetNamespace = "http://Modelo/",
      className = "modelo.GetGeneroResponse"
   )
   @Action(
      input = "http://Modelo/Contrato/getGeneroRequest",
      output = "http://Modelo/Contrato/getGeneroResponse"
   )
   List<Cancion> getGenero(@WebParam(name = "arg0",targetNamespace = "") String var1);
}
