// Source code is decompiled from a .class file using FernFlower decompiler.
package clases;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.naming.spi.ObjectFactory;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(
   name = "ServicioCanciones",
   targetNamespace = "http://example.com/canciones"
)
@XmlSeeAlso({ObjectFactory.class})
public interface ServicioCanciones {
   @WebMethod
   @WebResult(
      targetNamespace = ""
   )
   @RequestWrapper(
      localName = "getByName",
      targetNamespace = "http://example.com/canciones",
      className = "clases.GetByName"
   )
   @ResponseWrapper(
      localName = "getByNameResponse",
      targetNamespace = "http://example.com/canciones",
      className = "clases.GetByNameResponse"
   )
   @Action(
      input = "http://example.com/canciones/ServicioCanciones/getByNameRequest",
      output = "http://example.com/canciones/ServicioCanciones/getByNameResponse"
   )
   List<Cancion> getByName(@WebParam(name = "arg0",targetNamespace = "") String var1);

   @WebMethod
   @WebResult(
      targetNamespace = ""
   )
   @RequestWrapper(
      localName = "getByGenre",
      targetNamespace = "http://example.com/canciones",
      className = "clases.GetByGenre"
   )
   @ResponseWrapper(
      localName = "getByGenreResponse",
      targetNamespace = "http://example.com/canciones",
      className = "clases.GetByGenreResponse"
   )
   @Action(
      input = "http://example.com/canciones/ServicioCanciones/getByGenreRequest",
      output = "http://example.com/canciones/ServicioCanciones/getByGenreResponse"
   )
   List<Cancion> getByGenre(@WebParam(name = "arg0",targetNamespace = "") String var1);

   @WebMethod
   @WebResult(
      targetNamespace = ""
   )
   @RequestWrapper(
      localName = "getByYear",
      targetNamespace = "http://example.com/canciones",
      className = "clases.GetByYear"
   )
   @ResponseWrapper(
      localName = "getByYearResponse",
      targetNamespace = "http://example.com/canciones",
      className = "clases.GetByYearResponse"
   )
   @Action(
      input = "http://example.com/canciones/ServicioCanciones/getByYearRequest",
      output = "http://example.com/canciones/ServicioCanciones/getByYearResponse"
   )
   List<Cancion> getByYear(@WebParam(name = "arg0",targetNamespace = "") int var1);
}
