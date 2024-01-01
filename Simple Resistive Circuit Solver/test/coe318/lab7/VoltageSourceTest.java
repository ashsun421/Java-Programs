/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package coe318.lab7;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ashsu
 */
public class VoltageSourceTest {
    
    // Empty constructor
    public VoltageSourceTest() {
    }
    
    // Creates a test by creating and initializing objects and values
    @BeforeClass
    public static void setUpClass() {
    }
    
    // Releases system memory after test is done for the class
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
     * Test of getNodes method, of class VoltageSource.
     */
    @Test
    public void testGetNodes() {
        System.out.println("getNodes test");
        System.out.println("-------------");
        Node n1 = new Node();
        Node n2 = new Node();
        VoltageSource instance = new VoltageSource(5, n1, n2);
        Node[] expResult = {n1, n2};
        Node[] result = instance.getNodes();
        assertArrayEquals(expResult, result);
        System.out.println("Expected: " + expResult[0] + " " + expResult[1]);
        System.out.println("Actual: " + result[0] + " " + result[1]);

    }
    /**
     * Test of toString method, of class VoltageSource.
     */
    @Test
    public void testToString() {
        System.out.println("\ntoString test");
        System.out.println("-------------");
        Node n1 = new Node();
        Node n2 = new Node();
        VoltageSource instance = new VoltageSource(5,n1,n2);
        String expResult = "V" + instance.getId() + " " + n1.nodeId + " " + n2.nodeId + " DC " + instance.getVoltage();
        String result = instance.toString();
        assertEquals(expResult, result);
        System.out.println("Expected: " + expResult);
        System.out.println("Actual: " + result);
        

    }
    
    /**
     * Test of getVoltage method, of class VoltageSource.
     */
    @Test
    public void testGetVoltage() {
        System.out.println("\ngetVoltage test");
        System.out.println("---------------");
        Node n1 = new Node();
        Node n2 = new Node();
        VoltageSource instance = new VoltageSource(5, n1, n2);
        double expResult = 5;
        double result = instance.getVoltage();
        assertEquals(expResult, result, 0);
        System.out.println("Expected: " + expResult);
        System.out.println("Actual: " + result);
        
    }

    
    
}
