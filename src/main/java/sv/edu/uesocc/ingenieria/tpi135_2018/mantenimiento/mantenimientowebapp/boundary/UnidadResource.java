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
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.controller.UnidadFacadeLocal;
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.entity.Marca;
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.entity.Unidad;
import sv.uesocc.edu.ingenieria.tpi135_2018.mantto.web.exceptions.ControllerException;

/**
 *
 * @author joker
 */
@Path("unidad")
public class UnidadResource extends AbstractResource<Unidad>{

    @EJB
    private UnidadFacadeLocal ufl;


    @Override
    protected AbstractInterface<Unidad> getFacade() {
        return ufl;
    }

    @Override
    protected Unidad crearNuevo() {
        return new Unidad();
    }

    public AbstractInterface<Unidad> getFacadeName() {
        return ufl;
    }
    
    @GET
    @Path("name/{name}")
    @Produces({MediaType.APPLICATION_JSON + "; charset=utf-8"})
    public List<Unidad> findByNombreLike(
            @PathParam("name") String name
    ) {
        if (getFacadeName() != null) {
                List<Unidad> salida = ufl.findByNombreLike(name);
                if (salida != null) {
                    return salida;
                }
                throw new ControllerException(ControllerException.Message.REGISTRO_NO_ENCONTRADO);
        }
        throw new NullPointerException("Facade null");
    }
    

}
