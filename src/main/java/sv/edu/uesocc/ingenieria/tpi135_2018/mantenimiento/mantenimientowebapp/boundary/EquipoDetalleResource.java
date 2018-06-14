/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.boundary;

import javax.ejb.EJB;
import javax.ws.rs.Path;
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.controller.AbstractInterface;
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.controller.EquipoDetalleFacadeLocal;
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.entity.EquipoDetalle;

/**
 *
 * @author joker
 */
@Path("equipodetalle")
public class EquipoDetalleResource extends AbstractResource<EquipoDetalle> {

    @EJB
    private EquipoDetalleFacadeLocal edfl;


    @Override
    protected AbstractInterface<EquipoDetalle> getFacade() {
        return edfl;
    }

    @Override
    protected EquipoDetalle crearNuevo() {
        return new EquipoDetalle();
    }

}
