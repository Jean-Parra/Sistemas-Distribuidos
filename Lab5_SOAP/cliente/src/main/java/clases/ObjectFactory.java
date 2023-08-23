// Source code is decompiled from a .class file using FernFlower decompiler.
package clases;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {
   private static final QName _GetByYearResponse_QNAME = new QName("http://example.com/canciones", "getByYearResponse");
   private static final QName _GetByNameResponse_QNAME = new QName("http://example.com/canciones", "getByNameResponse");
   private static final QName _GetByGenre_QNAME = new QName("http://example.com/canciones", "getByGenre");
   private static final QName _GetByGenreResponse_QNAME = new QName("http://example.com/canciones", "getByGenreResponse");
   private static final QName _GetByName_QNAME = new QName("http://example.com/canciones", "getByName");
   private static final QName _GetByYear_QNAME = new QName("http://example.com/canciones", "getByYear");
   private static final QName _Cancion_QNAME = new QName("http://example.com/canciones", "cancion");

   public ObjectFactory() {
   }

   public GetByNameResponse createGetByNameResponse() {
      return new GetByNameResponse();
   }

   public GetByYearResponse createGetByYearResponse() {
      return new GetByYearResponse();
   }

   public GetByGenre createGetByGenre() {
      return new GetByGenre();
   }

   public GetByName createGetByName() {
      return new GetByName();
   }

   public GetByGenreResponse createGetByGenreResponse() {
      return new GetByGenreResponse();
   }

   public Cancion createCancion() {
      return new Cancion();
   }

   public GetByYear createGetByYear() {
      return new GetByYear();
   }

   @XmlElementDecl(
      namespace = "http://example.com/canciones",
      name = "getByYearResponse"
   )
   public JAXBElement<GetByYearResponse> createGetByYearResponse(GetByYearResponse var1) {
      return new JAXBElement(_GetByYearResponse_QNAME, GetByYearResponse.class, (Class)null, var1);
   }

   @XmlElementDecl(
      namespace = "http://example.com/canciones",
      name = "getByNameResponse"
   )
   public JAXBElement<GetByNameResponse> createGetByNameResponse(GetByNameResponse var1) {
      return new JAXBElement(_GetByNameResponse_QNAME, GetByNameResponse.class, (Class)null, var1);
   }

   @XmlElementDecl(
      namespace = "http://example.com/canciones",
      name = "getByGenre"
   )
   public JAXBElement<GetByGenre> createGetByGenre(GetByGenre var1) {
      return new JAXBElement(_GetByGenre_QNAME, GetByGenre.class, (Class)null, var1);
   }

   @XmlElementDecl(
      namespace = "http://example.com/canciones",
      name = "getByGenreResponse"
   )
   public JAXBElement<GetByGenreResponse> createGetByGenreResponse(GetByGenreResponse var1) {
      return new JAXBElement(_GetByGenreResponse_QNAME, GetByGenreResponse.class, (Class)null, var1);
   }

   @XmlElementDecl(
      namespace = "http://example.com/canciones",
      name = "getByName"
   )
   public JAXBElement<GetByName> createGetByName(GetByName var1) {
      return new JAXBElement(_GetByName_QNAME, GetByName.class, (Class)null, var1);
   }

   @XmlElementDecl(
      namespace = "http://example.com/canciones",
      name = "getByYear"
   )
   public JAXBElement<GetByYear> createGetByYear(GetByYear var1) {
      return new JAXBElement(_GetByYear_QNAME, GetByYear.class, (Class)null, var1);
   }

   @XmlElementDecl(
      namespace = "http://example.com/canciones",
      name = "cancion"
   )
   public JAXBElement<Cancion> createCancion(Cancion var1) {
      return new JAXBElement(_Cancion_QNAME, Cancion.class, (Class)null, var1);
   }
}
