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
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.entity.Procedimiento;

/**
 *
 * @author joker
 */
@Stateless
public class ProcedimientoFacade extends AbstractFacade<Procedimiento> implements ProcedimientoFacadeLocal {

    @PersistenceContext(unitName = "mantenimientoPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProcedimientoFacade() {
        super(Procedimiento.class);
    }

    @Override
    public List<Procedimiento> findByNombreLike(String name) {
        if (name != null) {
            Query q = this.em.createNamedQuery("Procedimiento.findByNombreLike");
            q.setParameter("name", "%" + name + "%");
            List lista = q.getResultList();
            return lista;
        }
        return new ArrayList<>();
    }


    
}
