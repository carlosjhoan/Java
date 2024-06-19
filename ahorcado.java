package com.example;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
      
    
        ArrayList<String> listStoredWords = new ArrayList<>();
        ArrayList<String> listUserLetters = new ArrayList<>();
        ArrayList<String> listSelectedword = new ArrayList<>();
        String objetiveWord;
        String wordToCompair;
        int failedAttempts = 0;
        String anonymWord = "";
        //word1.equals(word2)
        
        
        try (Scanner sc = new Scanner(System.in)) {
            boolean permise = true;
            Random randWord = new Random();
            String letterPress ;
            System.out.println("Ingrese las palabras que desea que el usuario adivine.");
            int countStoredWords = 0;
            String storedWord;

            // Aquí se ingresan las palabras que el admin desea guardar para que el programa después elija una.
            
            while ((JOptionPane.showConfirmDialog(null, "Mensaje", "Información", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE) == 0)) {
                countStoredWords++;
                System.out.println("Ingrese la palabra Nº " + countStoredWords);
                storedWord= sc.nextLine();
                listStoredWords.add(storedWord);
                

            }

            System.out.println("Has almacenado " + countStoredWords + " palabras.");
            
            //Elije una palabra de las que el admin ingresó
            int indexWord = randWord.nextInt(listStoredWords.size());
            objetiveWord = listStoredWords.get(indexWord);
            //objetiveWordLowercase = objetiveWord.toLowerCase();
           
            //System.out.println("La palabra elegida es: " + listStoredWords.get(indexWord));
            
            //
            for (int  i = 0 ; i < objetiveWord.length(); i++) {
                listUserLetters.add("_");
                listSelectedword.add(objetiveWord.substring(i, i+1));
                
            }

            // Empieza el juego
            while (permise == true) {
                anonymWord = "";
                wordToCompair = "";
                for (int  k = 0 ; k < objetiveWord.length(); k++) {
                    
                    anonymWord = anonymWord  + " " + listUserLetters.get(k);
                    wordToCompair += listUserLetters.get(k);
                    
                }
                //System.out.println("worToCompair " + wordToCompair);
                //System.out.println(wordToCompair.length() + " " + objetiveWord.length());
                System.out.println("Palabra a adivinar es : " + anonymWord);
                System.out.println(">> Presione una letra");
                letterPress = sc.next();
                while(letterPress.length()!=1){
                    System.out.println("\n- * - * - * - * - * - * - * - *");
                    System.out.println("Ingrese solamente un caracter!");
                    System.out.println("- * - * - * - * - * - * - * - *\n");
                    System.out.println(">> Presione una letra");
                    letterPress = sc.next();
                }

                if(listSelectedword.contains(letterPress) && !listUserLetters.contains(letterPress) ) {
                    System.out.println("\n= = = = = = = =");
                    System.out.println("Letra correcta.");
                    System.out.println("= = = = = = = =\n");

                    for (int  j = 0 ; j < listSelectedword.size(); j++) {
                    
                        if (listSelectedword.get(j).equals(letterPress)) {
                            listUserLetters.set(j , letterPress);
                            
                        }
                    }
                    //System.out.println(listUserLetters);
                    //listUserLetters.indexOf("_") == -1
                    if (listUserLetters.equals(listSelectedword)) {
                        System.out.println("G A N A S T E!!!");
                        permise = false;
                    }

                }
                else if (listSelectedword.contains(letterPress) && listUserLetters.contains(letterPress)){
                    System.out.println("Esta letra ya la adivinaste.\n");
                    continue;
                }
                else {
                    System.out.println("La palabra no contiene esta letra\n");
                    failedAttempts++;
                    if (failedAttempts == 3) {
                        System.out.println("AHORCADO!!");
                        permise = false;
                    }
                    else {
                        System.out.println("Fallaste!!\n" + "Te quedan: " + (3-failedAttempts) + " intentos.\n");
                    }
                   
                }
                
                //System.out.println("anonymWord: " + wordToCompair.length() + " " + "objetiveWord: " + objetiveWord.length());
                
            }
            
    
        }

        //System.out.println(listStoredWords);

    }

    


 
   
}
