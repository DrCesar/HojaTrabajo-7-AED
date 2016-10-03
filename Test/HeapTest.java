/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.PriorityQueue;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author wadeowen
 */
public class HeapTest {
    
    public HeapTest() {
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
     * Test of getArray method, of class Heap.
     */
    @Test
    public void testGetArray() {
        System.out.println("getArray");
        Heap instance = new Heap();
        PriorityQueue<Nodo> expResult = null;
        PriorityQueue<Nodo> result = instance.getArray();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setArray method, of class Heap.
     */
    @Test
    public void testSetArray() {
        System.out.println("setArray");
        PriorityQueue<Nodo> array = null;
        Heap instance = new Heap();
        //instance.setArray(array);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
