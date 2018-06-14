/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.boundary;

import javax.ejb.EJB;
import javax.ws.rs.Path;
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.controller.AbstractInterface;
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.controller.MantenimientoDetalleFacadeLocal;
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.entity.MantenimientoDetalle;

/**
 *
 * @author joker
 */
@Path("mantenimientodetalle")
public class MantenimientoDetalleResource extends AbstractResource<MantenimientoDetalle> {

    @EJB
    private MantenimientoDetalleFacadeLocal mdfl;


    @Override
    protected AbstractInterface<MantenimientoDetalle> getFacade() {
        return mdfl;
    }

    @Override
    protected MantenimientoDetalle crearNuevo() {
        return new MantenimientoDetalle();
    }

}
