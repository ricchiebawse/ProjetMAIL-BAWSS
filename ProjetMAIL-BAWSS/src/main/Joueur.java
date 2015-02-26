package main;

/**
 * Write a description of class Joueur here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Joueur
{
    // instance variables - replace the example below with your own
    private int num;
    private String poste;
    private String prenom;
    private String nom;
    private String datenaiss;
    private String nationnalite;
    private Equipe equipe;
    

	/**
	 * @return the equipe
	 */
	public Equipe getEquipe() {
		return equipe;
	}

	/**
	 * @param equipe the equipe to set
	 */
	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}

	public Joueur(){
		
	}
	
	public Joueur(int num, String poste, String prenom, String nom,
			String datenaiss, String nationnalite) {
		super();
		this.num = num;
		if(poste.equals("MIL") || poste.equals("ATT") || poste.equals("GAR") || poste.equals("DEF"))
			this.poste = poste;
		this.prenom = prenom;
		this.nom = nom;
		this.datenaiss = datenaiss;
		this.nationnalite = nationnalite;
	}

	/**
     * Constructor for objects of class Joueur
     */
    public Joueur(String poste, String prenom, String nom, int num)
    {
        // initialise instance variables
        this.num = num;
		if(poste.equals("MIL") || poste.equals("ATT") || poste.equals("GAR") || poste.equals("DEF"))
			this.poste = poste;
        this.prenom = prenom;
        this.nom = nom;
    }
    

	public String toString() {
		return "Joueur [num=" + num + ", poste=" + poste + ", prenom=" + prenom
				+ ", nom=" + nom + ", datenaiss=" + datenaiss
				+ ", nationnalite=" + nationnalite + 
				 ", equipe=" + equipe.getNom() +"]";
	}

    

    /**
	 * @return the num
	 */
	public int getNum() {
		return num;
	}

	/**
	 * @param num the num to set
	 */
	public void setNum(int num) {
		this.num = num;
	}

	/**
	 * @return the poste
	 */
	public String getPoste() {
		return poste;
	}

	/**
	 * @param poste the poste to set
	 */
	public void setPoste(String poste) {
		if(poste.equals("MIL") || poste.equals("ATT") || poste.equals("GAR") || poste.equals("DEF"))
			this.poste = poste;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
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

	/**
	 * @return the datenaiss
	 */
	public String getDatenaiss() {
		return datenaiss;
	}

	/**
	 * @param datenaiss the datenaiss to set
	 */
	public void setDatenaiss(String datenaiss) {
		this.datenaiss = datenaiss;
	}

	/**
	 * @return the nationnalite
	 */
	public String getNationnalite() {
		return nationnalite;
	}

	/**
	 * @param nationnalite the nationnalite to set
	 */
	public void setNationnalite(String nationnalite) {
		this.nationnalite = nationnalite;
	}

	/**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return num + y;
    }
}
