package com.betplay.Views;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TeamView {
    public TeamView () {

    }

    public void TeamMenu () {
        IntroView myMenu = new IntroView();
        Scanner sc = new Scanner(System.in);
        boolean validator = true;
        int option = 0;
        System.out.println("\n\n_____________________");
        System.out.println("\n    E Q U I P O S");
        System.out.println("\n= = = = = = = = = = =\n\tMenú\n= = = = = = = = = = =");
        System.out.println("\n1. Agregar equipo");
        System.out.println("\n2. Eliminar equipo");
        System.out.println("\n0. Volver");
        System.out.println("\n- - - - - - - - - - -");

        
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
                System.out.println("\n>>> Agregar Equipo");
                System.out.println("\nEquipo agregado exitosamente.\nPresiona una tecla para volver al menú.");
                sc.next();
                TeamMenu();
                break;
        
            case 2:
                System.out.println("\n>>> Eliminar Equipo");
                System.out.println("\nEquipo eliminado exitosamente.\nPresiona una tecla para volver al menú.");
                sc.next();
                TeamMenu();
                break;


            default:
                myMenu.GeneralMenu();
                break;
        }


    }
    

}
