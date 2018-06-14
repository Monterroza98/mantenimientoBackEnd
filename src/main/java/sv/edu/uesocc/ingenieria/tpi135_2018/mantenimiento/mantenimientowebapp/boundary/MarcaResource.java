/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.boundary;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.controller.AbstractInterface;
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.controller.MarcaFacadeLocal;
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.entity.Marca;
import sv.uesocc.edu.ingenieria.tpi135_2018.mantto.web.exceptions.ControllerException;

/**
 *
 * @author joker
 */
@Path("marca")
public class MarcaResource extends AbstractResource<Marca>{

    @EJB
    private MarcaFacadeLocal mfl;

    @Override
    protected AbstractInterface<Marca> getFacade() {
        return mfl;
    }

    @Override
    protected Marca crearNuevo() {
        return new Marca();
    }

    public AbstractInterface<Marca> getFacadeName() {
        return mfl;
    }
    
    @GET
    @Path("name/{name}")
    @Produces({MediaType.APPLICATION_JSON + "; charset=utf-8"})
    public List<Marca> findByNombreLike(
            @PathParam("name") String name
    ) {
        if (getFacadeName() != null) {
                List<Marca> salida = mfl.findByNombreLike(name);
                if (salida != null) {
                    return salida;
                }
                throw new ControllerException(ControllerException.Message.REGISTRO_NO_ENCONTRADO);
        }
        throw new NullPointerException("Facade null");
    }

}
