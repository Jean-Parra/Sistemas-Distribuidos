// Source code is decompiled from a .class file using FernFlower decompiler.
package modelo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {
   private static final QName _Cancion_QNAME = new QName("http://Modelo/", "cancion");
   private static final QName _GetAnioResponse_QNAME = new QName("http://Modelo/", "getAnioResponse");
   private static final QName _GetGeneroResponse_QNAME = new QName("http://Modelo/", "getGeneroResponse");
   private static final QName _GetTitulo_QNAME = new QName("http://Modelo/", "getTitulo");
   private static final QName _GetAnio_QNAME = new QName("http://Modelo/", "getAnio");
   private static final QName _GetGenero_QNAME = new QName("http://Modelo/", "getGenero");
   private static final QName _GetTituloResponse_QNAME = new QName("http://Modelo/", "getTituloResponse");

   public ObjectFactory() {
   }

   public GetTituloResponse createGetTituloResponse() {
      return new GetTituloResponse();
   }

   public GetAnio createGetAnio() {
      return new GetAnio();
   }

   public GetGenero createGetGenero() {
      return new GetGenero();
   }

   public GetTitulo createGetTitulo() {
      return new GetTitulo();
   }

   public Cancion createCancion() {
      return new Cancion();
   }

   public GetAnioResponse createGetAnioResponse() {
      return new GetAnioResponse();
   }

   public GetGeneroResponse createGetGeneroResponse() {
      return new GetGeneroResponse();
   }

   @XmlElementDecl(
      namespace = "http://Modelo/",
      name = "cancion"
   )
   public JAXBElement<Cancion> createCancion(Cancion var1) {
      return new JAXBElement(_Cancion_QNAME, Cancion.class, (Class)null, var1);
   }

   @XmlElementDecl(
      namespace = "http://Modelo/",
      name = "getAnioResponse"
   )
   public JAXBElement<GetAnioResponse> createGetAnioResponse(GetAnioResponse var1) {
      return new JAXBElement(_GetAnioResponse_QNAME, GetAnioResponse.class, (Class)null, var1);
   }

   @XmlElementDecl(
      namespace = "http://Modelo/",
      name = "getGeneroResponse"
   )
   public JAXBElement<GetGeneroResponse> createGetGeneroResponse(GetGeneroResponse var1) {
      return new JAXBElement(_GetGeneroResponse_QNAME, GetGeneroResponse.class, (Class)null, var1);
   }

   @XmlElementDecl(
      namespace = "http://Modelo/",
      name = "getTitulo"
   )
   public JAXBElement<GetTitulo> createGetTitulo(GetTitulo var1) {
      return new JAXBElement(_GetTitulo_QNAME, GetTitulo.class, (Class)null, var1);
   }

   @XmlElementDecl(
      namespace = "http://Modelo/",
      name = "getAnio"
   )
   public JAXBElement<GetAnio> createGetAnio(GetAnio var1) {
      return new JAXBElement(_GetAnio_QNAME, GetAnio.class, (Class)null, var1);
   }

   @XmlElementDecl(
      namespace = "http://Modelo/",
      name = "getGenero"
   )
   public JAXBElement<GetGenero> createGetGenero(GetGenero var1) {
      return new JAXBElement(_GetGenero_QNAME, GetGenero.class, (Class)null, var1);
   }

   @XmlElementDecl(
      namespace = "http://Modelo/",
      name = "getTituloResponse"
   )
   public JAXBElement<GetTituloResponse> createGetTituloResponse(GetTituloResponse var1) {
      return new JAXBElement(_GetTituloResponse_QNAME, GetTituloResponse.class, (Class)null, var1);
   }
}
