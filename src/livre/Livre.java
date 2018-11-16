package livre;

/**
 * 
 * @author Mélanie Pichery
 * @version 1.0
 *
 */

public class Livre {

	public static int compteur = 0;
	private int id = 0;
	private String titre;
	private String auteur;
	private int prix;
	
	/**
	 * constructeur
	 */
	public Livre() {	
		
		compteur++;
		this.id = compteur;
		
	}
	
	/**
	 * 
	 * @param titre : titre du livre
	 * @param auteur : auteur du livre
	 * @param prix : prix du livre
	 */
	public Livre(String titre, String auteur, int prix) {
		
		compteur++;
		this.id = compteur;
		this.titre = titre;
		this.auteur = auteur;
		this.prix = prix;
				
	}

	/**
	 * 
	 * @return id
	 */
	public int getId() {
		
		return id;
		
	}
	
	/**
	 * 
	 * @param id
	 */
	public void setId(int id) {
		
		this.id = id;
		
	}
	
	/**
	 * 
	 * @return titre
	 */
	public String getTitre() {
		
		return titre;
		
	}
	
	/**
	 * 
	 * @param titre
	 */
	public void setTitre(String titre) {
		
		this.titre = titre;
		
	}
	
	/**
	 * 
	 * @return auteur
	 */
	public String getAuteur() {
		
		return auteur;
		
	}
	
	/**
	 * 
	 * @param auteur
	 */
	public void setAuteur(String auteur) {
		
		this.auteur = auteur;
		
	}
	
	/**
	 * 
	 * @return prix
	 */
	public int getPrix() {
		
		return prix;
		
	}
	
	/**
	 * 
	 * @param prix
	 */
	public void setPrix(int prix) {
		
		this.prix = prix;
		
	}
	
	/**
	 * 
	 * @return toString
	 */
	public String ToString() {
		
		return "Le prix du livre "+titre+" de l'auteur "+auteur+" est : "+prix+" euros \nLa référence du livre est "+id;
		
	}		
	
}
