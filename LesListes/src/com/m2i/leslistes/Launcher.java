package com.m2i.leslistes;

import java.util.ArrayList;
import java.util.LinkedList;

import com.m2i.leslistes.classes.Produit;

public class Launcher {

	public static void main(String[] args) {
		// Les listes sont des tableaux qui ont une taille dynamique.
		// Elles poss�dent les "m�mes" fonctionnalit�s que les tableaux (et m�me davantage).
		// Exemples :
		// - Cr�er une liste  : ArrayList<String> prenoms = new ArrayList<String>();
		// - Cr�er un tableau : String[] prenoms = new String[3];
		// - Ajouter � une liste  : prenoms.add("Jake");
		// - Ajouter � un tableau : C'est impossible
		// - Modifier une case d'une liste  : prenoms.set(0, "Alice");
		// - Modifier une case d'un tableau : prenoms[0] = "Alice";
		// - Supprimer d'une liste  : prenoms.remove(0);
		// - Supprimer d'un tableau : C'est impossible
		// - Acc�der � une case d'une liste  : prenoms.get(0);
		// - Acc�der � une case d'un tableau : prenoms[0];
		// - Acc�der � la taille d'une liste  : prenoms.size();
		// - Acc�der � la taille d'un tableau : prenoms.length;
		
		// Exemple "trop complexe" de modification de la taille d'un tableau
		// - On cr�erait un tableau de 100 cases
		Produit[] produits = new Produit[100];
		// - Plus tard dans le programme, on le remplacerait par un tableau de 200 cases
		Produit[] produits2 = new Produit[200];
		// - Pour chaque case du premier tableau... On copie la valeur dans le deuxi�me
		for(int i = 0; i < produits.length; i++) {
			produits2[i] = produits[i];
		}
		// - On �craserait le premier tableau par le deuxi�me.
		produits = produits2;
		// - C'est trop compliqu� !
		
		// De plus, les tableaux n'ont pas de taille variable. Si on cr�e un tableau
		// de 200 cases, le tableau aura toujours 200 cases... m�me si on n'ajoute
		// aucun produit dedans.
		System.out.println("Taille tableau produits : " + produits.length);
		
		// Les listes permettent d'ajouter des cases dynamiquement.
		ArrayList<String> prenoms = new ArrayList<>();
		prenoms.add("Jake");  // Equivalent � prenoms[0] = "Jake";
		prenoms.add(0, "Nouveau"); // Si on veut ajouter au d�but de la liste
		prenoms.add(2, "Test"); // Si on veut ajouter � la case 2
		// Dans les deux cas, toutes les valeurs suivantes seront d�cal�es vers la droite
		
		
		// La taille d'une liste est dynamique. 
		// Celle-ci va varier au fur et � mesure des ajouts/suppressions.
		System.out.println("Taille pr�noms : " + prenoms.size()); // Taille = size/length
		prenoms.add("Alice"); 
		System.out.println("Taille pr�noms : " + prenoms.size());
		prenoms.add("Bob");   
		System.out.println("Taille pr�noms : " + prenoms.size());
		prenoms.remove(0); 
		System.out.println("Taille pr�noms : " + prenoms.size());
		
		// Les tableaux sont malgr� tout pratiques !
		// Ils sont utiles quand les valeurs sont d�j� d�finies et ne changeront
		// pas pendant l'ex�cution du programme.
		String[] difficultes = new String[] {
				"Facile", "Moyen", "Difficile"
		};
		// Ceci affichera "Facile"
		System.out.println(difficultes[0]);

		char[] minuscules = {'a', 'b', 'c', 'd', 'e' };
		// Ceci affichera "a"
		System.out.println(minuscules[0]);
		
		// Pour afficher tous les �l�ments d'une liste
		for(int i = 0; i < prenoms.size(); i++) {
			System.out.println(prenoms.get(i));
		}
		
		// Pour rechercher un �l�ment d'une liste
		prenoms.indexOf("Alice"); // 0
		
		// Exemple de forEach avec fonction lambda
		prenoms.forEach((String p) -> {
			System.out.println(p);
		});
		
		// Note 1 : Les listes ne prennent que des objets. Si l'on veut une
		// liste de nombres, on utilisera Integer (au lieu de int)
		ArrayList<Integer> nombres = new ArrayList<>();
		nombres.add(1);

		// Note 2 : Il existe d'autres types de listes, comme par
		// exemple les LinkedList.
		LinkedList<String> listeChainee = new LinkedList<String>();
		listeChainee.add("John");
	}

}
