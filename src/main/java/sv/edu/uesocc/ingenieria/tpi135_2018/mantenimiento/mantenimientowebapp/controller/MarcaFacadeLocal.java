/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.controller;

import java.util.List;
import javax.ejb.Local;
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.entity.Marca;

/**
 *
 * @author joker
 */
@Local
public interface MarcaFacadeLocal extends AbstractInterface<Marca>{
    
    public List<Marca> findByNombreLike(String name);
    
}