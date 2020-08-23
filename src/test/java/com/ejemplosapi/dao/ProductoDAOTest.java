/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplosapi.dao;

import com.ejemplosapi.modelo.Producto;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Santiago Rincón
 */
public class ProductoDAOTest {
    
    public ProductoDAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getProductos method, of class ProductoDAO.
     */
    @Test
    public void testGetProductos() {
        int expResult = 6;
        List<Producto> lista = ProductoDAO.getProductos();
        int result = lista.size();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetProducto() {
        String expResult = "HARINA";
        Producto producto = ProductoDAO.getProducto(1);
        String result = producto.nombre;
        assertEquals(expResult, result);
    }
    
}
