/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.boundary;

import javax.ejb.EJB;
import javax.ws.rs.Path;
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.controller.AbstractInterface;
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.controller.OrdenTrabajoEquipoFacadeLocal;
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.entity.OrdenTrabajoEquipo;

/**
 *
 * @author joker
 */
@Path("ordentrabajoequipo")
public class OrdenTrabajoEquipoResource extends AbstractResource<OrdenTrabajoEquipo> {

    @EJB
    private OrdenTrabajoEquipoFacadeLocal otefl;


    @Override
    protected AbstractInterface<OrdenTrabajoEquipo> getFacade() {
        return otefl;
    }

    @Override
    protected OrdenTrabajoEquipo crearNuevo() {
        return new OrdenTrabajoEquipo();
    }

}
