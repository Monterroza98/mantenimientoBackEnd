/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.boundary;

import javax.ejb.EJB;
import javax.ws.rs.Path;
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.controller.AbstractInterface;
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.controller.TipoMantenimientoFacadeLocal;
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.entity.TipoMantenimiento;

/**
 *
 * @author joker
 */
@Path("tipomantenimiento")
public class TipoMantenimientoResource extends AbstractResource<TipoMantenimiento> {

    @EJB
    private TipoMantenimientoFacadeLocal tmfl;


    @Override
    protected AbstractInterface<TipoMantenimiento> getFacade() {
        return tmfl;
    }

    @Override
    protected TipoMantenimiento crearNuevo() {
        return new TipoMantenimiento();
    }

}
