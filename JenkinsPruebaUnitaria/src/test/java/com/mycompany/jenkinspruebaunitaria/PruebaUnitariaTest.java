/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.jenkinspruebaunitaria;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author olivert
 */
public class PruebaUnitariaTest {
   

    /**
     * Test of numero_mayor method, of class PruebaUnitaria.
     */
    @Test
    public void testNumero_mayor() {
        System.out.println("numero_mayor");
        int a = 0;
        int b = 0;
        int c = 0;
        PruebaUnitaria instance = new PruebaUnitaria();
        int expResult = 0;
        int result = instance.numero_mayor(a, b, c);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testNumero_mayor_test1() {
        System.out.println("testNumero_mayor_test1");
        int a = 1;
        int b = 2;
        int c = 3;
        PruebaUnitaria instance = new PruebaUnitaria();
        int expResult = 3;
        int result = instance.numero_mayor(a, b, c);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testNumero_mayor_test2() {
        System.out.println("testNumero_mayor_test2");
        int a = 9;
        int b = 8;
        int c = 7;
        PruebaUnitaria instance = new PruebaUnitaria();
        int expResult = 9;
        int result = instance.numero_mayor(a, b, c);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testNumero_mayor_test3() {
        System.out.println("testNumero_mayor_test3");
        int a = 10;
        int b = 20;
        int c = 30;
        PruebaUnitaria instance = new PruebaUnitaria();
        int expResult = 30;
        int result = instance.numero_mayor(a, b, c);
        assertEquals(expResult, result);
    }
    
}
