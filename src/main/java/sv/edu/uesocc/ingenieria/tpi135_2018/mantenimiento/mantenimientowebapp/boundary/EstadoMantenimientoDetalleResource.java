/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.boundary;

import javax.ejb.EJB;
import javax.ws.rs.Path;
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.controller.AbstractInterface;
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.controller.EstadoMantenimientoDetalleFacadeLocal;
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.entity.EstadoMantenimientoDetalle;

/**
 *
 * @author joker
 */
@Path("estadomantenimientodetalle")
public class EstadoMantenimientoDetalleResource extends AbstractResource<EstadoMantenimientoDetalle> {

    @EJB
    private EstadoMantenimientoDetalleFacadeLocal emdfl;


    @Override
    protected AbstractInterface<EstadoMantenimientoDetalle> getFacade() {
        return emdfl;
    }

    @Override
    protected EstadoMantenimientoDetalle crearNuevo() {
        return new EstadoMantenimientoDetalle();
    }

}
