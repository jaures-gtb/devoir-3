package src;

import java.util.Scanner;
import java.util.ArrayList;

public class GestionaireMoto {
	
	    private ArrayList<Moto> motos;
	    private Scanner scanner;
	       
	public static void main (String[] arg ) {
		
		ArrayList<String>motos = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        
        // ajouter une moto 
       
        
        	
        System.out.println("choisisser une marque:");
        int i = 1;
        for (Marques marque : Marques.values()) {
            System.out.println(i + ". " + marque);
            i++;
        }
        int choixMarque = scan.nextInt();
        Marques marqueChoisie = Marques.values()[choixMarque - 1];

        System.out.print("Entrez le modèle de la moto: ");
        String modèle = scan.next();

        System.out.print("Entrez l'année de la moto: ");
        int année = scan.nextInt();

        System.out.print("Entrez la couleur de la moto: ");
        String couleur = scan.next();

        System.out.print("Entrez le kilométrage de la moto: ");
        double kilométrage = scan.nextInt();
	
	 Moto moto = new Moto(marqueChoisie, modèle, année, couleur, kilométrage);
     motos.add(moto);
     System.out.println("Moto ajoutée avec succès!");
     
	
	
	// afficher toutes les moto de la liste 
	
	if (motos.isEmpty()) {
        System.out.println("Aucune moto dans la liste.");
    } else {
        for (int i = 0; i < motos.size(); i++) {
            System.out.println((i + 1) + ". " + motos.get(i).toString());
        }
        
        // supprimer moto 
        
        afficherMotos();
        if (!motos.isEmpty()) {
            System.out.print("Choisissez une moto à supprimer (numéro): ");
            int choix = scan.nextInt();
            if (choix > 0 && choix <= motos.size()) {
                motos.remove(choix - 1);
                System.out.println("Moto supprimée avec succès!");
            } else {
                System.out.println("Choix invalide.");
            }
            
            afficherMotos();
            if (!motos.isEmpty()) {
                System.out.print("Choisissez une moto (numéro): ");
                int choix = scan.nextInt();
                if (choix > 0 && choix <= motos.size()) {
                    System.out.print("Entrez la distance à ajouter au kilométrage: ");
                    int distance = scan.nextInt();
                    motos.get(choix - 1).augmenterKilométrage(distance);
                    System.out.println("Kilométrage mis à jour.");
                } else {
                    System.out.println("Choix invalide.");
                    
                }
        
	
		



