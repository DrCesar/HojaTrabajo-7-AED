/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
public class BinaryTreeTest {
    
    public BinaryTreeTest() {
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
     * Test of addNodo method, of class BinaryTree.
     */
    @Test
    public void testAddNodo() {
        System.out.println("addNodo");
        int ele = 0;
        Nodo temp = null;
        BinaryTree instance = new BinaryTree();
        //instance.addNodo(ele, temp);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of searchNodo method, of class BinaryTree.
     */
    @Test
    public void testSearchNodo() {
        System.out.println("searchNodo");
        int ele = 0;
        Nodo temp = null;
        BinaryTree instance = new BinaryTree();
        Nodo expResult = null;
        Nodo result = instance.searchNodo(ele, temp);
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getRoot method, of class BinaryTree.
     */
    @Test
    public void testGetRoot() {
        System.out.println("getRoot");
        BinaryTree instance = new BinaryTree();
        Nodo expResult = null;
        Nodo result = instance.getRoot();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setRoot method, of class BinaryTree.
     */
    @Test
    public void testSetRoot() {
        System.out.println("setRoot");
        Nodo root = null;
        BinaryTree instance = new BinaryTree();
        //instance.setRoot(root);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
