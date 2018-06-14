/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.controller;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.entity.Orden;

/**
 *
 * @author joker
 */
@Stateless
public class OrdenFacade extends AbstractFacade<Orden> implements OrdenFacadeLocal {

    @PersistenceContext(unitName = "mantenimientoPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public OrdenFacade() {
        super(Orden.class);
    }

    @Override
    public List<Orden> findByActivo() {
            Query q = this.em.createNamedQuery("Orden.findByActivo");
            List lista = q.getResultList();
            return lista;
    }

    @Override
    public List<Orden> findByInactivo() {
            Query q1 = this.em.createNamedQuery("Orden.findByInactivo");
            List lista = q1.getResultList();
            return lista;
    }
    
}
