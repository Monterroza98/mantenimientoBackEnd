/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.boundary;

import javax.ejb.EJB;
import javax.ws.rs.Path;
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.controller.AbstractInterface;
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.controller.CalendarioFacadeLocal;
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.entity.Calendario;

/**
 *
 * @author joker
 */
@Path("calendario")
public class CalendarioResource extends AbstractResource<Calendario>{

    @EJB
    private CalendarioFacadeLocal cfl;


    @Override
    protected AbstractInterface<Calendario> getFacade() {
        return cfl;
    }

    @Override
    protected Calendario crearNuevo() {
        return new Calendario();
    }
    
}
