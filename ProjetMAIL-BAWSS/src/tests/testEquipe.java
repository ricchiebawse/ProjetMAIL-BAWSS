package tests;


import static org.junit.Assert.*;

import main.Equipe;
import main.Joueur;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class EquipeTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class testEquipe
{
    /**
     * Default constructor for test class EquipeTest
     */
    public testEquipe()
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

    @Test
    public void TST01()
    {
    	
    	//Bidirectionnalité effective entre jouer et équipe.
    	
        Joueur joueur1 = new Joueur("MIL", "Eden", "Hazard", 10);
        Joueur joueur2 = new Joueur("ATT", "Didier", "Drogba", 11);
        Equipe equipe1 = new Equipe("Chelsea FC");
        equipe1.addJoueur(joueur1);
        equipe1.addJoueur(joueur2);
        assertEquals("Equipe [nom=Chelsea FC, listJoueurs=[Joueur [num=10, poste=MIL, prenom=Eden, nom=Hazard, datenaiss=null, nationnalite=null, equipe=Chelsea FC], Joueur [num=11, poste=ATT, prenom=Didier, nom=Drogba, datenaiss=null, nationnalite=null, equipe=Chelsea FC]], championnat=null]", equipe1.toString());
        assertEquals("Joueur [num=10, poste=MIL, prenom=Eden, nom=Hazard, datenaiss=null, nationnalite=null, equipe=Chelsea FC]", joueur1.toString());
        assertEquals("Joueur [num=11, poste=ATT, prenom=Didier, nom=Drogba, datenaiss=null, nationnalite=null, equipe=Chelsea FC]", joueur2.toString());
    }
    
    @Test
    public void TST02()
    {
    	//Refuser les équipes de plus de 11 joueurs. 
    	
        Joueur joueur1 = new Joueur("MIL", "Eden", "Hazard", 10);
        Joueur joueur2 = new Joueur("ATT", "Didier", "Drogba", 11);
        Joueur joueur3 = new Joueur();
        Joueur joueur4 = new Joueur();
        Joueur joueur5 = new Joueur();
        Joueur joueur6 = new Joueur();
        Joueur joueur7 = new Joueur();
        Joueur joueur8 = new Joueur();
        Joueur joueur9 = new Joueur();
        Joueur joueur10 = new Joueur();
        Joueur joueur11 = new Joueur();
        Joueur joueur12 = new Joueur();

        Equipe equipe1 = new Equipe("Chelsea FC");
        equipe1.addJoueur(joueur1);
        equipe1.addJoueur(joueur2);
        equipe1.addJoueur(joueur3);
        equipe1.addJoueur(joueur4);
        equipe1.addJoueur(joueur5);
        equipe1.addJoueur(joueur6);
        equipe1.addJoueur(joueur7);
        equipe1.addJoueur(joueur8);
        equipe1.addJoueur(joueur9);
        equipe1.addJoueur(joueur10);
        equipe1.addJoueur(joueur11);
        equipe1.addJoueur(joueur12);

        assertEquals(11,equipe1.getListJoueurs().size());
    }
}

