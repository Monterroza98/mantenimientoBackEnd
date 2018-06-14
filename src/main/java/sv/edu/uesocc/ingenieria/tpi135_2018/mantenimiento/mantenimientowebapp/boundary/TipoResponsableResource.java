/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.boundary;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.controller.TipoResponsableFacadeLocal;
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.mantenimientowebapp.entity.TipoResponsable;

/**
 *
 * @author joker
 */
@Path("tiporesponsable")
public class TipoResponsableResource {

    @EJB
    private TipoResponsableFacadeLocal tpfl;
    
    @GET
    @Path("findbyname/{tpbuscado}")
    @Produces({MediaType.APPLICATION_JSON + "; charset=utf-8"})
    public Response findByNombreLike(
            @PathParam("tpbuscado") String nombre
    ) {

        if (tpfl != null) {
            try {
                List<TipoResponsable> list = null;
                list = tpfl.findByNombreLike(nombre);
                if (list != null && !list.isEmpty()) {
                    JsonArrayBuilder ab = Json.createArrayBuilder();
                    for (TipoResponsable tp : list) {
                        ab.add(Json.createObjectBuilder()
                                .add("idTipoResponsable", tp.getIdTipoResponsable())
                                .add("nombre", tp.getNombre()));
                    }
                    return Response.ok(ab.build()).build();

                }
            } catch (Exception ex) {
                Logger.getLogger(getClass().getName()).log(Level.SEVERE, ex.getMessage(), ex);
            }
        }
        return Response.status(Response.Status.NOT_FOUND).header("filter-not-found", nombre).build();
    }

}
