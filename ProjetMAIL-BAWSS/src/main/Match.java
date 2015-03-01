package main;

public class Match {

	private Equipe equipeDomicile;
	private Equipe equipeExterieur;
	private int scoreDomicile;
	private int scoreExterieur;
	
	
	public Match(Equipe equipe1, Equipe equipe2, int scoreDomicile, int scoreExterieur){
		this.equipeDomicile=equipe1;
		this.equipeExterieur=equipe2;
		this.scoreDomicile=scoreDomicile;
		this.scoreExterieur=scoreExterieur;
	}
	public Match(){
		
	}
	/**
	 * @return the equipeDomicile
	 */
	public Equipe getEquipeDomicile() {
		return equipeDomicile;
	}
	/**
	 * @param equipeDomicile the equipeDomicile to set
	 */
	public void setEquipeDomicile(Equipe equipeDomicile) {
		this.equipeDomicile = equipeDomicile;
	}
	/**
	 * @return the equipeExterieur
	 */
	public Equipe getEquipeExterieur() {
		return equipeExterieur;
	}
	/**
	 * @param equipeExterieur the equipeExterieur to set
	 */
	public void setEquipeExterieur(Equipe equipeExterieur) {
		this.equipeExterieur = equipeExterieur;
	}
	/**
	 * @return the scoreDomicile
	 */
	public int getScoreDomicile() {
		return scoreDomicile;
	}
	/**
	 * @param scoreDomicile the scoreDomicile to set
	 */
	public void setScoreDomicile(int scoreDomicile) {
		this.scoreDomicile = scoreDomicile;
	}
	/**
	 * @return the scoreExterieur
	 */
	public int getScoreExterieur() {
		return scoreExterieur;
	}
	/**
	 * @param scoreExterieur the scoreExterieur to set
	 */
	public void setScoreExterieur(int scoreExterieur) {
		this.scoreExterieur = scoreExterieur;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Match [equipeDomicile=" + equipeDomicile.getNom() + ", equipeExterieur="
				+ equipeExterieur.getNom() + ", score=" + scoreDomicile
				+ "-"+ scoreExterieur + "]";
	}
	
	
}
