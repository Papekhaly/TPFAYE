package fr.khaly.Exer3;

import java.io.File;
import java.util.Scanner;

public class Exer3 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Saisissez votre répertoire :");
        File f = new File(sc.nextLine());
        // permet à l'utilisateur de saisir un répertoire
        String [] ListeFichiers;
        //On créé un tableau pour les fichiers présents dans le repertoire
        ListeFichiers = f.list();
        int i;

        for(i = 0; i<ListeFichiers.length;i++) {


            // le else if va nous permettre définir les extensions voulu et les afficher

            if (ListeFichiers[i].endsWith(".txt") == true) {
                // endsWith pour avoir accéder au dernier caractères des fichiers du répertoire

                System.out.println("Fichiers du répertoire avec l'extension .txt : " + ListeFichiers[i]);


            } else if (ListeFichiers[i].endsWith(".png") == true) {
                System.out.println("Fichier du répertoire avec l'extension .png : " + ListeFichiers[i]);


            } else if (ListeFichiers[i].endsWith(".pdf") == true) {

                System.out.println("Fichier du répertoire avec l'extension .pdf : " + ListeFichiers[i]);

            }

            else {

                System.out.println("");
                // si aucune fichier avec l'extension voulu est trouvé rien ne sera affiché
            }







        }
        // Cette méthode nous permet de lister les fichiers dans le répertoire saisie par l'utilisateur
        //On affiche les fichiers présent dans le répertoire


        System.out.println("Répertoire: " + f.getAbsoluteFile());


    }
}





