package com.betplay.Views;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CoachView {
    public CoachView() {

    }

    public void CoachMenu () {
        IntroView myMenu = new IntroView();
        Scanner sc = new Scanner(System.in);
        boolean validator = true;
        int option = 0;
        System.out.println("\n\n_______________________");
        System.out.println("\nE N T R E N A D O R E S");
        System.out.println("\n= = = = = = = = = = = =\n\t Menú\n= = = = = = = = = = = =");
        System.out.println("\n1. Agregar entrenador");
        System.out.println("\n2. Eliminar entrenador");
        System.out.println("\n0. Volver");
        System.out.println("\n- - - - - - - - - - - -");

        
            while (validator == true) {
                try {
                    System.out.println("\n¿Qué desea realizar?");
                    option = sc.nextInt();
                    validator = false;
                }

                catch (InputMismatchException e) {
                    System.out.println("\n* * * * * * * * * * * * *\nDebe ser un número entero\n>>> Intente de nuevo <<<\n* * * * * * * * * * * * *");
                    sc.next();
            }

           
        }

        switch (option) {
            case 1:
                System.out.println("\n>>> Agregar Entrenador");
                System.out.println("\nEntrenador agregado exitosamente.\nPresiona una tecla para volver al menú.");
                sc.next();
                CoachMenu();
                break;
        
            case 2:
                System.out.println("\n>>> Eliminar Entrenador");
                System.out.println("\nEntrenador eliminado exitosamente.\nPresiona una tecla para volver al menú.");
                sc.next();
                CoachMenu();
                break;


            default:
                myMenu.GeneralMenu();
                break;
        }


    }
}
