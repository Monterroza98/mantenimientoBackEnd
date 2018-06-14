/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.boundary;

import javax.ejb.EJB;
import javax.ws.rs.Path;
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.controller.AbstractInterface;
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.controller.TipoParteFacadeLocal;
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.entity.TipoParte;

/**
 *
 * @author joker
 */
@Path("tipoparte")
public class TipoParteResource extends AbstractResource<TipoParte>{
    
    @EJB
    private TipoParteFacadeLocal tpfl;


    @Override
    protected AbstractInterface<TipoParte> getFacade() {
        return tpfl;
    }

    @Override
    protected TipoParte crearNuevo() {
        return new TipoParte();
    }
    
    
}
