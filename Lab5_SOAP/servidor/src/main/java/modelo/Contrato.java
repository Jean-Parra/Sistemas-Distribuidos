package modelo;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;


@WebService
public interface Contrato {
    @WebMethod
    List<Cancion> getByName(@WebParam  String name);

    @WebMethod
    List<Cancion> getByGenre(@WebParam String genre);

    @WebMethod
    List<Cancion> getByYear(@WebParam int year);
}