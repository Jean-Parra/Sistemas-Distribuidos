// Source code is decompiled from a .class file using FernFlower decompiler.
package clases;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;

@WebServiceClient(
   name = "ServicioCancionesService",
   targetNamespace = "http://example.com/canciones",
   wsdlLocation = "http://localhost:9999/ws/canciones?wsdl"
)
public class ServicioCancionesService extends Service {
   private static final URL SERVICIOCANCIONESSERVICE_WSDL_LOCATION;
   private static final WebServiceException SERVICIOCANCIONESSERVICE_EXCEPTION;
   private static final QName SERVICIOCANCIONESSERVICE_QNAME = new QName("http://example.com/canciones", "ServicioCancionesService");

   public ServicioCancionesService() {
      super(__getWsdlLocation(), SERVICIOCANCIONESSERVICE_QNAME);
   }

   public ServicioCancionesService(WebServiceFeature... var1) {
      super(__getWsdlLocation(), SERVICIOCANCIONESSERVICE_QNAME, var1);
   }

   public ServicioCancionesService(URL var1) {
      super(var1, SERVICIOCANCIONESSERVICE_QNAME);
   }

   public ServicioCancionesService(URL var1, WebServiceFeature... var2) {
      super(var1, SERVICIOCANCIONESSERVICE_QNAME, var2);
   }

   public ServicioCancionesService(URL var1, QName var2) {
      super(var1, var2);
   }

   public ServicioCancionesService(URL var1, QName var2, WebServiceFeature... var3) {
      super(var1, var2, var3);
   }

   @WebEndpoint(
      name = "ServicioCancionesPort"
   )
   public ServicioCanciones getServicioCancionesPort() {
      return (ServicioCanciones)super.getPort(new QName("http://example.com/canciones", "ServicioCancionesPort"), ServicioCanciones.class);
   }

   @WebEndpoint(
      name = "ServicioCancionesPort"
   )
   public ServicioCanciones getServicioCancionesPort(WebServiceFeature... var1) {
      return (ServicioCanciones)super.getPort(new QName("http://example.com/canciones", "ServicioCancionesPort"), ServicioCanciones.class, var1);
   }

   private static URL __getWsdlLocation() {
      if (SERVICIOCANCIONESSERVICE_EXCEPTION != null) {
         throw SERVICIOCANCIONESSERVICE_EXCEPTION;
      } else {
         return SERVICIOCANCIONESSERVICE_WSDL_LOCATION;
      }
   }

   static {
      URL var0 = null;
      WebServiceException var1 = null;

      try {
         var0 = new URL("http://localhost:9999/ws/canciones?wsdl");
      } catch (MalformedURLException var3) {
         var1 = new WebServiceException(var3);
      }

      SERVICIOCANCIONESSERVICE_WSDL_LOCATION = var0;
      SERVICIOCANCIONESSERVICE_EXCEPTION = var1;
   }
}
