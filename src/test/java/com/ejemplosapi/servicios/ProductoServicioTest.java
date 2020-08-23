/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplosapi.servicios;

import com.ejemplosapi.modelo.Producto;
import javax.ws.rs.core.Response;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author FABRICA.SOFTWARE6
 */
public class ProductoServicioTest {
    
    public ProductoServicioTest() {
    }

    @org.junit.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.junit.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    /**
     * Test of getProductos method, of class ProductoServicio.
     */
    @org.junit.Test
    public void testGetProductos() {
        System.out.println("getProductos");
        ProductoServicio instance = new ProductoServicio();
        Response expResult = null;
        Response result = instance.getProductos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProducto method, of class ProductoServicio.
     */
    @org.junit.Test
    public void testGetProducto() {
        System.out.println("getProducto");
        int id = 0;
        ProductoServicio instance = new ProductoServicio();
        Response expResult = null;
        Response result = instance.getProducto(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of borrarProducto method, of class ProductoServicio.
     */
    @org.junit.Test
    public void testBorrarProducto() {
        System.out.println("borrarProducto");
        int id = 0;
        ProductoServicio instance = new ProductoServicio();
        Response expResult = null;
        Response result = instance.borrarProducto(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of guardarProducto method, of class ProductoServicio.
     */
    @org.junit.Test
    public void testGuardarProducto() {
        System.out.println("guardarProducto");
        Producto producto = null;
        ProductoServicio instance = new ProductoServicio();
        Response expResult = null;
        Response result = instance.guardarProducto(producto);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
