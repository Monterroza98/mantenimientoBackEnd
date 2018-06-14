/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.boundary;

import javax.ejb.EJB;
import javax.ws.rs.Path;
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.controller.AbstractInterface;
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.controller.DiagnosticoFacadeLocal;
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.entity.Diagnostico;

/**
 *
 * @author joker
 */
@Path("diagnostico")
public class DiagnosticoResource extends AbstractResource<Diagnostico> {

    @EJB
    private DiagnosticoFacadeLocal dfl;


    @Override
    protected AbstractInterface<Diagnostico> getFacade() {
        return dfl;
    }

    @Override
    protected Diagnostico crearNuevo() {
        return new Diagnostico();
    }

}
