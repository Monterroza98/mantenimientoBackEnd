/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.boundary;

import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.controller.AbstractInterface;
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.controller.PrioridadFacadeLocal;
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.entity.Marca;
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.entity.Prioridad;
import sv.uesocc.edu.ingenieria.tpi135_2018.mantto.web.exceptions.ControllerException;

/**
 *
 * @author joker
 */
@Path("prioridad")
public class PrioridadResource extends AbstractResource<Prioridad> {

    @EJB
    private PrioridadFacadeLocal pfl;


    @Override
    protected AbstractInterface<Prioridad> getFacade() {
        return pfl;
    }

    @Override
    protected Prioridad crearNuevo() {
        return new Prioridad();
    }

    public AbstractInterface<Prioridad> getFacadeName() {
        return pfl;
    }
    
    @GET
    @Path("name/{name}")
    @Produces({MediaType.APPLICATION_JSON + "; charset=utf-8"})
    public List<Prioridad> findByNombreLike(
            @PathParam("name") String name
    ) {
        if (getFacadeName() != null) {
                List<Prioridad> salida = pfl.findByNombreLike(name);
                if (salida != null) {
                    return salida;
                }
                throw new ControllerException(ControllerException.Message.REGISTRO_NO_ENCONTRADO);
        }
        throw new NullPointerException("Facade null");
    }

}
