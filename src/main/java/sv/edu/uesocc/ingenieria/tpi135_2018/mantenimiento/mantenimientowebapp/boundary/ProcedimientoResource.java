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
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.controller.ProcedimientoFacadeLocal;
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.entity.Procedimiento;
import sv.uesocc.edu.ingenieria.tpi135_2018.mantto.web.exceptions.ControllerException;

/**
 *
 * @author joker
 */
@Path("procedimiento")
public class ProcedimientoResource extends AbstractResource<Procedimiento>{

    @EJB
    private ProcedimientoFacadeLocal pfl;


    @Override
    protected AbstractInterface<Procedimiento> getFacade() {
        return pfl;
    }

    @Override
    protected Procedimiento crearNuevo() {
        return new Procedimiento();
    }

    public AbstractInterface<Procedimiento> getFacadeName() {
        return pfl;
    }
    
    @GET
    @Path("name/{name}")
    @Produces({MediaType.APPLICATION_JSON + "; charset=utf-8"})
    public List<Procedimiento> findByNombreLike(
            @PathParam("name") String name
    ) {
        if (getFacadeName() != null) {
                List<Procedimiento> salida = pfl.findByNombreLike(name);
                if (salida != null) {
                    return salida;
                }
                throw new ControllerException(ControllerException.Message.REGISTRO_NO_ENCONTRADO);
        }
        throw new NullPointerException("Facade null");
    }

}
