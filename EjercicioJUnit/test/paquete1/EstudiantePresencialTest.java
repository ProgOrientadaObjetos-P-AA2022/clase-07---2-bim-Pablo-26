/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.lang.reflect.Field;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USER
 */
public class EstudiantePresencialTest {
    private EstudiantePresencial instance;
    
    public EstudiantePresencialTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new EstudiantePresencial();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of establecerNumeroCreditos method, of class EstudiantePresencial.
     */
    @Test
    public void testEstablecerNumeroCreditos()  throws 
            IllegalArgumentException, 
            NoSuchFieldException, 
            IllegalAccessException{
        System.out.println("establecerNumeroCreditos");
        int numero = 120;
        instance.establecerNumeroCreditos(numero);
        Field field = instance.getClass().getDeclaredField("numeroCreditos");
        field.setAccessible(true);
        assertEquals(field.get(instance), 120);
    }

    /**
     * Test of establecerCostoCredito method, of class EstudiantePresencial.
     */
    @Test
    public void testEstablecerCostoCredito() throws 
            IllegalArgumentException, 
            NoSuchFieldException, 
            IllegalAccessException {
        System.out.println("establecerCostoCredito");
        double valor = 7.50;
        instance.establecerCostoCredito(valor);
        Field field = instance.getClass().getDeclaredField("costoCredito");
        field.setAccessible(true);
        assertEquals(field.get(instance), 7.50);
    }

    /**
     * Test of calcularMatriculaPresencial method, of class EstudiantePresencial.
     */
    @Test
    public void testCalcularMatriculaPresencial() throws 
            IllegalArgumentException, 
            NoSuchFieldException, 
            IllegalAccessException {
        System.out.println("calcularMatriculaDistancia");
        instance.establecerCostoCredito(7.50);
        instance.establecerNumeroCreditos(120);
        instance.calcularMatriculaPresencial();
        Field field = instance.getClass().getDeclaredField("matriculaPresencial");
        field.setAccessible(true);
        assertEquals(field.get(instance), 900.0);
    }

    /**
     * Test of obtenerNumeroCreditos method, of class EstudiantePresencial.
     */
    @Test
    public void testObtenerNumeroCreditos() {
        System.out.println("obtenerNumeroCreditos");
        int expResult = 120;
         instance.establecerNumeroCreditos(120);
        int result = instance.obtenerNumeroCreditos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerCostoCredito method, of class EstudiantePresencial.
     */
    @Test
    public void testObtenerCostoCredito() {
        System.out.println("obtenerCostoCredito");
        double expResult = 120;
        instance.establecerCostoCredito(120);
        double result = instance.obtenerCostoCredito();
        assertEquals(expResult, result, 0.0);
          // https://stackoverflow.com/questions/5939788/junit-assertequalsdouble-expected-double-actual-double-epsilon
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerMatriculaPresencial method, of class EstudiantePresencial.
     */
    @Test
    public void testObtenerMatriculaPresencial() {
        System.out.println("obtenerMatriculaDistancia");
        instance.establecerCostoCredito(7.50);
        instance.establecerNumeroCreditos(120);
        instance.calcularMatriculaPresencial();
        double expResult = 900.0;
        double result = instance.obtenerMatriculaPresencial();
        assertEquals(expResult, result, 0.0);
        
    }
    
}
