package com.betplay.Views;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PlayerView {
    public PlayerView() {

    }

    public void PlayerMenu () {
        IntroView myMenu = new IntroView();
        Scanner sc = new Scanner(System.in);
        boolean validator = true;
        int option = 0;
        System.out.println("\n  J U G A D O R E S");
        System.out.println("\n= = = = = = = = = = =\n\tMenú\n= = = = = = = = = = =");
        System.out.println("\n1. Agregar jugador");
        System.out.println("\n2. Eliminar jugador");
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
                System.out.println("\n>>> Agregar Jugador");
                System.out.println("\nJugador agregado exitosamente.\nPresiona una tecla para volver al menú.");
                sc.next();
                PlayerMenu();
                break;
        
            case 2:
                System.out.println("\n>>> Eliminar Jugador");
                System.out.println("\nJugador eliminado exitosamente.\nPresiona una tecla para volver al menú.");
                sc.next();
                PlayerMenu();
                break;


            default:
                myMenu.GeneralMenu();
                break;
        }


    }
}
