package fr.khaly.exo1;


import java.io.File;
import java.util.Scanner;
import java.io.File;
import java.util.Scanner;
//Package à importer afin d'utiliser l'objet File, et Scanner


public class exo1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Saisissez le nom de votre fichier:");
        File f = new File(sc.nextLine());
        //L'utilisateur entre le nom de son fichier


        System.out.println("Chemin du fichier : " + f.getAbsolutePath()); //affiche le chemin du fichier
        //
        System.out.println("Nom du fichier : " + f.getName()); // affiche le nom du fichier
        System.out.println("C'est un répertoire ? " + f.isDirectory());// Nous dit si c'est un répertoire au non
        System.out.println("C'est un fichier ? " + f.isFile()); // Nous dit si c'est un fichier ou non

        // Le fichier entrée par l'utilisateur est analysé par les méthodes suivante




    }
}