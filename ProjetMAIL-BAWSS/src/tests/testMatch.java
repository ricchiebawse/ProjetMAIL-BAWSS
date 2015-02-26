package tests;

import static org.junit.Assert.*;

import main.Equipe;
import main.Ligue1;
import main.Match;

import org.junit.Test;

public class testMatch {

	@Test
	public void TST01() {
	//Construction et consultation de match effective.
		
        Equipe equipe1 = new Equipe("PSG");
        Equipe equipe2 = new Equipe("OM");
        Equipe equipe3 = new Equipe("OL");
        Equipe equipe4 = new Equipe("Monaco");
        
        Match match1 = new Match(equipe1, equipe2, 4, 0);
        Match match2 = new Match(equipe3, equipe4, 1, 1);
                
        Ligue1.getInstance().getListMatchs().add(match2);
        Ligue1.getInstance().getListMatchs().add(match1);

       assertEquals(Ligue1.getInstance().toString(),"Ligue1 [journee=0, prevChamion=null, listEquipes=[Equipe [nom=OL, listJoueurs=[], championnat=null], Equipe [nom=OM, listJoueurs=[], championnat=null], Equipe [nom=PSG, listJoueurs=[], championnat=null], Equipe [nom=PSG, listJoueurs=[], championnat=null], Equipe [nom=OM, listJoueurs=[], championnat=null], Equipe [nom=OL, listJoueurs=[], championnat=null]], listMatchs=[Match [equipeDomicile=OL, equipeExterieur=Monaco, score=1-1], Match [equipeDomicile=PSG, equipeExterieur=OM, score=4-0]]]");
        
	}

}
