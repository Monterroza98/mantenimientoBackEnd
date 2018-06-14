/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.boundary;

import javax.ejb.EJB;
import javax.ws.rs.Path;
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.controller.AbstractInterface;
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.controller.ParteFacadeLocal;
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.entity.Parte;

/**
 *
 * @author joker
 */
@Path("parte")
public class ParteResource extends AbstractResource<Parte> {

    @EJB
    private ParteFacadeLocal pfl;


    @Override
    protected AbstractInterface<Parte> getFacade() {
        return pfl;
    }

    @Override
    protected Parte crearNuevo() {
        return new Parte();
    }

}
