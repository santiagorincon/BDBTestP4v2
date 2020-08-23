/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplosapi.servicios;

import com.ejemplosapi.dao.ProductoDAO;
import com.ejemplosapi.modelo.Producto;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Santiago Rincón
 */
@Path("productos")
public class ProductoServicio {
    private static List<Producto> lista = ProductoDAO.getProductos();
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getProductos() {
        return Response.ok(lista).build();
    }
    
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getProducto(@PathParam("id") int id){
        Producto producto = new Producto();
        producto.setId(id);
        if (lista.contains(producto)){
            for(Producto obj: lista)
                if (obj.getId()==id)
                    return Response.ok(obj).build();
        }
        return Response.status(Response.Status.NOT_FOUND).build();
    }
    
    @DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response borrarProducto(@PathParam("id") int id){
        Producto producto = new Producto();
        producto.setId(id);
        if (lista.contains(producto)){
            lista.remove(producto);
            return Response.ok().build();
        }
        return Response.status(Response.Status.NOT_FOUND).build();
    }
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response guardarProducto(Producto producto){
        lista.add(producto);
        return Response.status(Response.Status.CREATED).entity(producto).build();
    }
}
