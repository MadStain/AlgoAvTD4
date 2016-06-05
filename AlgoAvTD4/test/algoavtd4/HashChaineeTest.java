/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoavtd4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Geoffrey
 */
public class HashChaineeTest {
    
    public HashChaineeTest() {
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
     * Test of ajouter method, of class HashChainee.
     */
    @Test
    public void testAjouter() {
        System.out.println("ajouter");
        
        HashDico<String> monDico = new HashChainee<>(512);
        char c1 = 33;
        char c2 = 126;
        int fin;
        fin = c2 - c1;
        String s = "";
        for (int i = 0; i < fin; i++) {
            s = String.valueOf(c1) + " - " + String.valueOf(c2);
            monDico.ajouter(String.valueOf(c1) + String.valueOf(c2), s);
            c1++;
            c2--;
        }
        
        assertEquals(monDico.rechercher("RM"), "R - M");
        assertEquals(monDico.rechercher("RRRR"), null);
        
    }

    /**
     * Test of rechercher method, of class HashChainee.
     */
    @Test
    public void testRechercher() {
        System.out.println("rechercher");
        String cle = "";
        HashChainee instance = null;
        Object expResult = null;
        Object result = instance.rechercher(cle);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of exist method, of class HashChainee.
     */
    @Test
    public void testExist() {
        System.out.println("exist");
        
        HashDico<String> monDico = new HashChainee<>(512);
        char c1 = 33;
        char c2 = 126;
        int fin;
        fin = c2 - c1;
        String s = "";
        for (int i = 0; i < fin; i++) {
            s = String.valueOf(c1) + " - " + String.valueOf(c2);
            monDico.ajouter(String.valueOf(c1) + String.valueOf(c2), s);
            c1++;
            c2--;
        }
        
        assertTrue(monDico.exist("RM"));
        assertFalse(monDico.exist("RRRR"));
    }

    /**
     * Test of supprimer method, of class HashChainee.
     */
    @Test
    public void testSupprimer() {
        System.out.println("supprimer");
        String cle = "";
        HashChainee instance = null;
        Object expResult = null;
        Object result = instance.supprimer(cle);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nbElem method, of class HashChainee.
     */
    @Test
    public void testNbElem() {
        System.out.println("nbElem");
        HashChainee instance = null;
        int expResult = 0;
        int result = instance.nbElem();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of vider method, of class HashChainee.
     */
    @Test
    public void testVider() {
        System.out.println("vider");
        HashChainee instance = null;
        instance.vider();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of estVide method, of class HashChainee.
     */
    @Test
    public void testEstVide() {
        System.out.println("estVide");
        HashChainee instance = null;
        boolean expResult = false;
        boolean result = instance.estVide();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of estOrganise method, of class HashChainee.
     */
    @Test
    public void testEstOrganise() {
        System.out.println("estOrganise");
        HashChainee instance = null;
        boolean expResult = false;
        boolean result = instance.estOrganise();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of organiser method, of class HashChainee.
     */
    @Test
    public void testOrganiser() {
        System.out.println("organiser");
        HashChainee instance = null;
        instance.organiser();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toSTring method, of class HashChainee.
     */
    @Test
    public void testToSTring() {
        System.out.println("toSTring");
        HashChainee instance = null;
        String expResult = "";
        String result = instance.toSTring();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}