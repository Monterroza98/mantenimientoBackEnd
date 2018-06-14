/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.boundary;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.controller.AbstractInterface;
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.controller.OrdenFacadeLocal;
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.entity.Orden;

/**
 *
 * @author joker
 */
@Path("orden")
public class OrdenResource extends AbstractResource<Orden> {

    @EJB
    private OrdenFacadeLocal ofl;
    
    @GET
    @Path("activa")
    @Produces({MediaType.APPLICATION_JSON + "; charset=utf-8"})
    public List<Orden> findByActivo(){
            try {
        List<Orden> list = null;                
        list = ofl.findByActivo();
        if (list != null) {
                    return list;
                }
        } catch (Exception ex) {
                Logger.getLogger(getClass().getName()).log(Level.SEVERE, ex.getMessage(), ex);
            } 
            return new ArrayList<>();
    }
    
    @GET
    @Path("inactiva")
    @Produces({MediaType.APPLICATION_JSON + "; charset=utf-8"})
    public List<Orden> findByInactivo(){
            try {
        List<Orden> list1 = null;                
        list1 = ofl.findByInactivo();
        if (list1 != null) {
                    return list1;
                }
        } catch (Exception ex) {
                Logger.getLogger(getClass().getName()).log(Level.SEVERE, ex.getMessage(), ex);
            } 
            return new ArrayList<>();
    }

    @Override
    protected AbstractInterface<Orden> getFacade() {
        return ofl;
    }

    @Override
    protected Orden crearNuevo() {
        return new Orden();
    }

}
