/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplosapi.dao;

import com.ejemplosapi.modelo.Producto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Santiago Rincón
 */
public class ProductoDAO {
    public static List<Producto> getProductos(){
        List<Producto> lista = new ArrayList();
        Producto producto1 = new Producto(1,"HARINA",500);
        Producto producto2 = new Producto(2,"ARROZ",600);
        Producto producto3 = new Producto(3,"PASTA",700);
        Producto producto4 = new Producto(4,"ACEITE",800);
        Producto producto5 = new Producto(5,"ATUN",900);
    
        lista.add(producto1);
        lista.add(producto2);
        lista.add(producto3);
        lista.add(producto4);
        lista.add(producto5);
        
        return lista;
        
    }
}
