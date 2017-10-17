package fr.khaly.Exer4;

import java.io.*;
import java.net.URL;
import java.util.Scanner;


public class Exer4 {


    static File file = new File("/Users/Pape Khaly Faye/Desktop/file.txt");

        public static void main(String[] args){

            String s = "";
            Scanner scan = new Scanner(System.in);

            while(!s.equals("quit")){   //Le mot cléf quit permettra d'arrêter la saisie
                System.out.println("Entrer votre saisie à copier dans le fichier file.txt");
                s = scan.nextLine();    /

                if(!s.equals("quit")){   //si non quit, on écrit dans le fichier

                    // Création d'un nouveau fichier avec ré-écriture par dessus
                    try(FileWriter writer = new FileWriter(file,true);) {
                        s = s + "\n";
                        writer.write(s);
                    }
                    catch(FileNotFoundException e){
                        e.printStackTrace();
                    }
                    catch(IOException e){
                        e.printStackTrace();
                    }
                }
            }
        }
    }



