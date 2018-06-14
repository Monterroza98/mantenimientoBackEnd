/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.boundary;

import javax.ejb.EJB;
import javax.ws.rs.Path;
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.controller.AbstractInterface;
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.controller.CalendarioExcepcionFacadeLocal;
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.entity.CalendarioExcepcion;

/**
 *
 * @author joker
 */
@Path("diagnosticoexcepcion")
public class CalendarioExcepcionResource extends AbstractResource<CalendarioExcepcion> {

    @EJB
    private CalendarioExcepcionFacadeLocal cefl;


    @Override
    protected AbstractInterface<CalendarioExcepcion> getFacade() {
        return cefl;
    }

    @Override
    protected CalendarioExcepcion crearNuevo() {
        return new CalendarioExcepcion();
    }

}
