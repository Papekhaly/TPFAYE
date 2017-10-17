package com.company;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//

        Scanner sc = new Scanner(System.in);
        System.out.println("Saisissez votre répertoire :");
        File f = new File(sc.nextLine());
        // permet à l'utilisateur de saisir un répertoire
        String [] ListeFichiers;
        //On créé un tableau pour les fichiers présents dans le repertoire
        ListeFichiers = f.list();
        int i;




        for(i = 0; i<ListeFichiers.length;i++){
            System.out.println(ListeFichiers[i]);
        }

        // Cette méthode nous permet de lister les fichiers dans le répertoire saisie par l'utilisateur


        System.out.println("Répertoire: " + f.getAbsoluteFile());
        System.out.println("Liste des fichiers du répertoire: " + ListeFichiers[i]);

        //On affiche les fichiers présent dans le répertoire



    }



}
