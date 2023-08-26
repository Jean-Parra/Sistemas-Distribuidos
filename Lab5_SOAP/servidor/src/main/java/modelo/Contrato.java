package Modelo;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface Contrato {
    @WebMethod
    List<Cancion> getTitulo(@WebParam String titulo);

    @WebMethod
    List<Cancion> getGenero(@WebParam String genero);

    @WebMethod
    List<Cancion> getAnio(@WebParam int anio);
}
