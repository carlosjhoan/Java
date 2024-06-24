package com.betplay.Views;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.betplay.model.entity.Team;

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
                String name;
                int Id;
                String city;
                String key;
                Team myTeam = new Team();

                System.out.println("Código del eqquipo: ");
                key = sc.nextLine();

                System.out.println("Id del equipo: ");
                Id = sc.nextInt();
               
                System.out.println("Nombre del equipo: ");
                name = sc.nextLine();
                
                System.out.println("Ciudad del equipo: ");
                city = sc.nextLine();
               
                myTeam.set

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
