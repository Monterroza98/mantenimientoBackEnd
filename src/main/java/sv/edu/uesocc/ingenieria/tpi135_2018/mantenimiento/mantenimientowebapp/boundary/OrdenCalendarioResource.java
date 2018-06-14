/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.boundary;

import javax.ejb.EJB;
import javax.ws.rs.Path;
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.controller.AbstractInterface;
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.controller.OrdenCalendarioFacadeLocal;
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.entity.OrdenCalendario;

/**
 *
 * @author joker
 */
@Path("ordencalendario")
public class OrdenCalendarioResource extends AbstractResource<OrdenCalendario> {

    @EJB
    private OrdenCalendarioFacadeLocal ocfl;


    @Override
    protected AbstractInterface<OrdenCalendario> getFacade() {
        return ocfl;
    }

    @Override
    protected OrdenCalendario crearNuevo() {
        return new OrdenCalendario();
    }

}
