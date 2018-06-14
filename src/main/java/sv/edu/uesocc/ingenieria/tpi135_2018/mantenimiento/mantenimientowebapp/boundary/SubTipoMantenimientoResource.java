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
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.controller.SubTipoMantenimientoFacadeLocal;
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.entity.Marca;
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.entity.SubTipoMantenimiento;
import sv.uesocc.edu.ingenieria.tpi135_2018.mantto.web.exceptions.ControllerException;

/**
 *
 * @author joker
 */
@Path("subtipomantenimiento")
public class SubTipoMantenimientoResource extends AbstractResource<SubTipoMantenimiento> {

    @EJB
    private SubTipoMantenimientoFacadeLocal stmfl;


    @Override
    protected AbstractInterface<SubTipoMantenimiento> getFacade() {
        return stmfl;
    }

    @Override
    protected SubTipoMantenimiento crearNuevo() {
        return new SubTipoMantenimiento();
    }

    public AbstractInterface<SubTipoMantenimiento> getFacadeName() {
        return stmfl;
    }
    
    @GET
    @Path("name/{name}")
    @Produces({MediaType.APPLICATION_JSON + "; charset=utf-8"})
    public List<SubTipoMantenimiento> findByNombreLike(
            @PathParam("name") String name
    ) {
        if (getFacadeName() != null) {
                List<SubTipoMantenimiento> salida = stmfl.findByNombreLike(name);
                if (salida != null) {
                    return salida;
                }
                throw new ControllerException(ControllerException.Message.REGISTRO_NO_ENCONTRADO);
        }
        throw new NullPointerException("Facade null");
    }

}
