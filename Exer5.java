package fr.khaly.Exer5;

import java.io.*;
import java.util.Scanner;

public class Exer5 {


        public static void main(String args[]) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Entrer le nom de votre fichier: ");
            try (FileReader aLire = new FileReader(sc.nextLine());
               //Le fichier rentrer par l'utilisateur est lu
                 FileWriter aEcrire = new FileWriter(sc.nextLine())) {
                /*fichier à écrire*/
                int c = aLire.read();
                while(c!=-1) {
                    aEcrire.write(c);
                    c = aLire.read();
                }
            }
                 catch(IOException e) {
                e.printStackTrace();
            }
        }
    }

