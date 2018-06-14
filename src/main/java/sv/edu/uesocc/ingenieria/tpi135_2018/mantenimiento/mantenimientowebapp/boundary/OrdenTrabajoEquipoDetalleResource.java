/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.boundary;

import javax.ejb.EJB;
import javax.ws.rs.Path;
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.controller.AbstractInterface;
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.controller.OrdenTrabajoEquipoDetalleFacadeLocal;
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.entity.OrdenTrabajoEquipoDetalle;

/**
 *
 * @author joker
 */
@Path("ordentrabajoequipodetalle")
public class OrdenTrabajoEquipoDetalleResource extends AbstractResource<OrdenTrabajoEquipoDetalle> {

    @EJB
    private OrdenTrabajoEquipoDetalleFacadeLocal otqdfl;


    @Override
    protected AbstractInterface<OrdenTrabajoEquipoDetalle> getFacade() {
        return otqdfl;
    }

    @Override
    protected OrdenTrabajoEquipoDetalle crearNuevo() {
        return new OrdenTrabajoEquipoDetalle();
    }

}
