// Source code is decompiled from a .class file using FernFlower decompiler.
package controlador;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;

@WebServiceClient(
   name = "MemoriaService",
   targetNamespace = "http://Controlador/",
   wsdlLocation = "http://localhost:3000/canciones?wsdl"
)
public class MemoriaService extends Service {
   private static final URL MEMORIASERVICE_WSDL_LOCATION;
   private static final WebServiceException MEMORIASERVICE_EXCEPTION;
   private static final QName MEMORIASERVICE_QNAME = new QName("http://Controlador/", "MemoriaService");

   public MemoriaService() {
      super(__getWsdlLocation(), MEMORIASERVICE_QNAME);
   }

   public MemoriaService(WebServiceFeature... var1) {
      super(__getWsdlLocation(), MEMORIASERVICE_QNAME, var1);
   }

   public MemoriaService(URL var1) {
      super(var1, MEMORIASERVICE_QNAME);
   }

   public MemoriaService(URL var1, WebServiceFeature... var2) {
      super(var1, MEMORIASERVICE_QNAME, var2);
   }

   public MemoriaService(URL var1, QName var2) {
      super(var1, var2);
   }

   public MemoriaService(URL var1, QName var2, WebServiceFeature... var3) {
      super(var1, var2, var3);
   }

   @WebEndpoint(
      name = "MemoriaPort"
   )
   public Contrato getMemoriaPort() {
      return (Contrato)super.getPort(new QName("http://Controlador/", "MemoriaPort"), Contrato.class);
   }

   @WebEndpoint(
      name = "MemoriaPort"
   )
   public Contrato getMemoriaPort(WebServiceFeature... var1) {
      return (Contrato)super.getPort(new QName("http://Controlador/", "MemoriaPort"), Contrato.class, var1);
   }

   private static URL __getWsdlLocation() {
      if (MEMORIASERVICE_EXCEPTION != null) {
         throw MEMORIASERVICE_EXCEPTION;
      } else {
         return MEMORIASERVICE_WSDL_LOCATION;
      }
   }

   static {
      URL var0 = null;
      WebServiceException var1 = null;

      try {
         var0 = new URL("http://localhost:3000/canciones?wsdl");
      } catch (MalformedURLException var3) {
         var1 = new WebServiceException(var3);
      }

      MEMORIASERVICE_WSDL_LOCATION = var0;
      MEMORIASERVICE_EXCEPTION = var1;
   }
}
