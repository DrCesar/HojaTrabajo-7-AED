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
public class HuffmanTest {
    
    public HuffmanTest() {
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
     * Test of getFrequencies method, of class Huffman.
     */
    @Test
    public void testGetFrequencies() {
        System.out.println("getFrequencies");
        String s = "";
        Huffman instance = new Huffman();
        //instance.getFrequencies(s);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of createNodos method, of class Huffman.
     */
    @Test
    public void testCreateNodos() {
        System.out.println("createNodos");
        Huffman instance = new Huffman();
        //instance.createNodos();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of createTree method, of class Huffman.
     */
    @Test
    public void testCreateTree() {
        System.out.println("createTree");
        Huffman instance = new Huffman();
        //instance.createTree();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of printTree method, of class Huffman.
     */
    @Test
    public void testPrintTree() {
        System.out.println("printTree");
        Nodo n = null;
        String s = "";
        Huffman instance = new Huffman();
        //instance.printTree(n, s);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of decodMessage method, of class Huffman.
     */
    @Test
    public void testDecodMessage() {
        System.out.println("decodMessage");
        String s = "";
        Huffman instance = new Huffman();
        //instance.decodMessage(s);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of printMessage method, of class Huffman.
     */
    @Test
    public void testPrintMessage() {
        System.out.println("printMessage");
        Nodo n = null;
        String s = "";
        Huffman instance = new Huffman();
        //instance.printMessage(n, s);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTree method, of class Huffman.
     */
    @Test
    public void testGetTree() {
        System.out.println("getTree");
        Huffman instance = new Huffman();
        BinaryTree expResult = null;
        BinaryTree result = instance.getTree();
        if(expResult == result)
            fail("The test case is a prototype.");
    }
    
}
