/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.boundary;

import javax.ejb.EJB;
import javax.ws.rs.Path;
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.controller.AbstractInterface;
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.controller.DiagnosticoParteFacadeLocal;
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.entity.DiagnosticoParte;

/**
 *
 * @author joker
 */
@Path("diagnosticoparte")
public class DiagnosticoParteResource extends AbstractResource<DiagnosticoParte> {

    @EJB
    private DiagnosticoParteFacadeLocal dpfl;


    @Override
    protected AbstractInterface<DiagnosticoParte> getFacade() {
        return dpfl;
    }

    @Override
    protected DiagnosticoParte crearNuevo() {
        return new DiagnosticoParte();
    }

}
