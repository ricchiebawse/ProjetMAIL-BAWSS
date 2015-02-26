package tests;
import static org.junit.Assert.*;

import main.Equipe;
import main.Ligue1;

import org.junit.Test;


public class testLigue1 {

	@Test
	public void TST01() {
	//Construction du championnat Ligue1 effective.
		
        Equipe equipe1 = new Equipe("PSG");
        Equipe equipe2 = new Equipe("OM");
        Equipe equipe3 = new Equipe("OL");
        
        Ligue1.getInstance().getListEquipes().add(equipe3);
        Ligue1.getInstance().getListEquipes().add(equipe2);
        Ligue1.getInstance().getListEquipes().add(equipe1);

       assertEquals(Ligue1.getInstance().toString(),"Ligue1 [journee=0, prevChamion=null, listEquipes=[Equipe [nom=OL, listJoueurs=[], championnat=null], Equipe [nom=OM, listJoueurs=[], championnat=null], Equipe [nom=PSG, listJoueurs=[], championnat=null]], listMatchs=[]]");
        
	}
	
	@Test
	public void TST02() {
	// Unicité du championnat Ligue 1.
		
        Equipe equipe1 = new Equipe("PSG");
        Equipe equipe2 = new Equipe("OM");
        Equipe equipe3 = new Equipe("OL");
        
        Ligue1 ligue = Ligue1.getInstance();
        ligue.getListEquipes().add(equipe1);
        ligue.getListEquipes().add(equipe2);
        ligue.getListEquipes().add(equipe3);
     
        assertEquals(ligue, Ligue1.getInstance());
        
	}

}
