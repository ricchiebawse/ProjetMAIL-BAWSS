package main;
import java.util.ArrayList;
import java.util.List;


public class Ligue1 {

	private static volatile Ligue1 instance = null;//Unique instance de Ligue1
	
	private int journee;
	private Equipe prevChamion;
	private List<Equipe> listEquipes;
	private List<Match> listMatchs;
	
	private Ligue1(){
		super();
		this.journee=0;
		this.listEquipes=new ArrayList<Equipe>();
		this.listMatchs=new ArrayList<Match>();

	}
	
	private Ligue1(Equipe prevChampion){
		super();
		this.prevChamion=prevChampion;
		this.journee=0;
		this.listEquipes=new ArrayList<Equipe>();
		this.listMatchs=new ArrayList<Match>();
	}
	
    public final static Ligue1 getInstance() {
    	if (Ligue1.instance == null) {
           synchronized(Ligue1.class) {
             if (Ligue1.instance == null) {
               Ligue1.instance = new Ligue1();
             }
           }
        }
        return Ligue1.instance;
    }

	/**
	 * @return the journee
	 */
	public int getJournee() {
		return journee;
	}

	/**
	 * @param journee the journee to set
	 */
	public void setJournee(int journee) {
		this.journee = journee;
	}

	/**
	 * @return the prevChamion
	 */
	public Equipe getPrevChamion() {
		return prevChamion;
	}

	/**
	 * @param prevChamion the prevChamion to set
	 */
	public void setPrevChamion(Equipe prevChamion) {
		this.prevChamion = prevChamion;
	}

	/**
	 * @return the listEquipes
	 */
	public List<Equipe> getListEquipes() {
		return listEquipes;
	}

	/**
	 * @param listEquipes the listEquipes to set
	 */
	public void setListEquipes(List<Equipe> listEquipes) {
		this.listEquipes = listEquipes;
	}
	
	public void addEquipe(Equipe e){
		this.listEquipes.add(e);
	}



	/**
	 * @return the listMatchs
	 */
	public List<Match> getListMatchs() {
		return listMatchs;
	}

	/**
	 * @param listMatchs the listMatchs to set
	 */
	public void setListMatchs(List<Match> listMatchs) {
		this.listMatchs = listMatchs;
	}
	
	public void addMatch(Match m){
		this.listMatchs.add(m);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Ligue1 [journee=" + journee + ", prevChamion=" + prevChamion
				+ ", listEquipes=" + listEquipes + ", listMatchs=" + listMatchs
				+ "]";
	}
	
	
	
}
