package essais;

import java.util.Scanner;

import livre.Livre;


public class TestLivre {

	public static void main(String[] args) {

		int nombreLivre = 0 ;		
		
		/**
		 * affichage consigne et sauvegarde du nombre de livres donné par l'utilisateur
		 */
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Combien de livres à gérer ?");
		nombreLivre=sc1.nextInt();
		
		/**
		 * création du tableau livres
		 */
		Livre[] livres = new Livre[nombreLivre];
		
		/**
		 * 
		 */
		for (int i = 0; i < nombreLivre; i++) {
						
			Scanner sc2 = new Scanner(System.in);
			System.out.println("Donner le titre du livre "+(i+1));
			String titre = sc2.nextLine();
			
			Scanner sc3 = new Scanner(System.in);
			System.out.println("Donner l'auteur du livre "+(i+1));
			String auteur = sc3.nextLine();
			
			Scanner sc4 = new Scanner(System.in);
			System.out.println("Donner le prix du livre "+(i+1));
			int prix = sc4.nextInt();
						
			Livre livre = new Livre(titre,auteur,prix);
			
			livres[i] = livre ;
			
		}
		
		for (int i = 0; i < nombreLivre; i++) {
			
			System.out.println(livres[i].ToString());
			
		}
		
		System.out.println("Le nombre de livre est : "+nombreLivre);

	}
	
}
