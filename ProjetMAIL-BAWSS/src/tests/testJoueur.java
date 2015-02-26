package tests;


import static org.junit.Assert.*;

import main.Joueur;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class JoueurTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class testJoueur
{
    /**
     * Default constructor for test class JoueurTest
     */
    public testJoueur()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    /*
    @Test
    public void testSetterGetterNom()
    {
        Joueur joueur1 = new Joueur("ATT", "Zlatan", "Ibra", 10);
        assertEquals("Ibra", joueur1.getNom());
        joueur1.setNom("Ibrahimovic");
        assertEquals("Ibrahimovic", joueur1.getNom());
    }
    */

    @Test
    public void TST01()
    {
    	//Création d'un joueur effective
    	
        Joueur joueur1 = new Joueur("ATT", "Zlatan", "Ibra", 10);
        assertEquals("Ibra", joueur1.getNom());
        assertEquals("Zlatan", joueur1.getPrenom());
        assertEquals("ATT", joueur1.getPoste());
        assertEquals(10, joueur1.getNum());

    }
    
    @Test
    public void TST02()
    {
    	//Refuser les postes autres que « MIL », « ATT », « DEF » ou « GAR ».
    	
        Joueur joueur1 = new Joueur("NIMP", "Zlatan", "Ibra", 10);
        assertEquals(null, joueur1.getPoste());
        joueur1.setPoste("ATT");
        assertEquals("ATT" , joueur1.getPoste());
        joueur1.setPoste("TRUC");
        assertEquals("ATT" , joueur1.getPoste());
    }


}

