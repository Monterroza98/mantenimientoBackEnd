/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.controller;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.entity.TipoResponsable;

/**
 *
 * @author joker
 */
@Stateless
public class TipoResponsableFacade extends AbstractFacade<TipoResponsable> implements TipoResponsableFacadeLocal {

    @PersistenceContext(unitName = "mantenimientoPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TipoResponsableFacade() {
        super(TipoResponsable.class);
    }

    @Override
    public List<TipoResponsable> findByNombreLike(String nombre) {
        if (nombre != null) {
            Query q = this.em.createNamedQuery("TipoResponsable.findByNombreLike");
            q.setParameter("nombre", "%" + nombre + "%");
            List lista = q.getResultList();
            return lista;
        }
        return new ArrayList<>();
    }
    
}
