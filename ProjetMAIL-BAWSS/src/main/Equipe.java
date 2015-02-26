package main;
import java.util.ArrayList;
import java.util.List;


/**
 * Write a description of class Equipe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Equipe
{
    // instance variables - replace the example below with your own
    private String nom;
    private List<Joueur> listJoueurs;
    private String championnat;
    

    /**
     * Constructor for objects of class Equipe
     */
    public Equipe(String nom)
    {
    	this.nom = nom;
    	listJoueurs = new ArrayList<Joueur>();
        // initialise instance variables
    }


	public Equipe(String nom, List<Joueur> listJoueurs, String championnat) {
		super();
		this.nom = nom;
		this.listJoueurs = listJoueurs;
		this.championnat = championnat;
	}


	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}


	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}


	public void addJoueur(Joueur j){
		if(this.listJoueurs.size()<11){
			this.listJoueurs.add(j);
			j.setEquipe(this);			
		}
	}
	/**
	 * @return the listJoueurs
	 */
	public List<Joueur> getListJoueurs() {
		return listJoueurs;
	}


	/**
	 * @param listJoueurs the listJoueurs to set
	 */
	public void setListJoueurs(List<Joueur> listJoueurs) {
		this.listJoueurs = listJoueurs;
	}


	/**
	 * @return the championnat
	 */
	public String getChampionnat() {
		return championnat;
	}


	/**
	 * @param championnat the championnat to set
	 */
	public void setChampionnat(String championnat) {
		this.championnat = championnat;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Equipe [nom=" + nom + ", listJoueurs=" + listJoueurs
				+ ", championnat=" + championnat + "]";
	}

    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    /*public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }*/
}
