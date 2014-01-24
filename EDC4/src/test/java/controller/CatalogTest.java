/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import java.util.List;
import model.Item;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bpridemore
 */
public class CatalogTest {
    
    public CatalogTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getPagingInfo method, of class Catalog.
     */
    @Test
    public void testGetPagingInfo() {
        System.out.println("getPagingInfo");
        Catalog instance = new Catalog();
        PagingInfo expResult = null;
        PagingInfo result = instance.getPagingInfo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNextItems method, of class Catalog.
     */
    @Test
    public void testGetNextItems() {
        System.out.println("getNextItems");
        int maxResults = 0;
        int firstResult = 0;
        Catalog instance = new Catalog();
        List<Item> expResult = null;
        List<Item> result = instance.getNextItems(maxResults, firstResult);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItems method, of class Catalog.
     */
    @Test
    public void testGetItems() {
        System.out.println("getItems");
        Catalog instance = new Catalog();
        List<Item> expResult = null;
        List<Item> result = instance.getItems();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItem method, of class Catalog.
     */
    @Test
    public void testGetItem() {
        System.out.println("getItem");
        Catalog instance = new Catalog();
        Item expResult = null;
        Item result = instance.getItem();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of next method, of class Catalog.
     */
    @Test
    public void testNext() {
        System.out.println("next");
        Catalog instance = new Catalog();
        String expResult = "";
        String result = instance.next();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of prev method, of class Catalog.
     */
    @Test
    public void testPrev() {
        System.out.println("prev");
        Catalog instance = new Catalog();
        String expResult = "";
        String result = instance.prev();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showDetail method, of class Catalog.
     */
    @Test
    public void testShowDetail() {
        System.out.println("showDetail");
        Item item = null;
        Catalog instance = new Catalog();
        String expResult = "";
        String result = instance.showDetail(item);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItemCount method, of class Catalog.
     */
    @Test
    public void testGetItemCount() {
        System.out.println("getItemCount");
        Catalog instance = new Catalog();
        int expResult = 0;
        int result = instance.getItemCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
