package com.betplay.Views;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.betplay.Controller;

public class IntroView {

    public IntroView() {

    }

    public void GeneralMenu() {
        Scanner sc = new Scanner(System.in);
        TeamView teamMenu = new TeamView();
        PlayerView playerMenu = new PlayerView();
        CoachView coachMenu = new CoachView();
        DoctorView doctorMenu = new DoctorView();
        boolean permise = true;
        int option = 0;
        System.out.println("\n\n_____________________");
        System.out.println("\n    B E T P L A Y");
        System.out.println("\n= = = = = = = = = = =\n\tMenú\n= = = = = = = = = = =");
        System.out.println("\n1. Equipos");
        System.out.println("\n2. Jugadores");
        System.out.println("\n3. Entrenadores");
        System.out.println("\n4. Cuerpo Médico");
        System.out.println("\n0. Salir");
        System.out.println("\n- - - - - - - - - - -");

        
            while (permise == true) {
                try {
                    System.out.println("\n¿Qué desea explorar?");
                    option = sc.nextInt();
                    permise = false;
                }

                catch (InputMismatchException e) {
                    System.out.println("\n* * * * * * * * * * * * *\nDebe ser un número entero\n>>> Intente de nuevo <<<\n* * * * * * * * * * * * *");
                    sc.next();
            }

           
        }

        switch (option) {
            case 1:
                teamMenu.TeamMenu();
                break;
        
            case 2:
                playerMenu.PlayerMenu();
                break;

            case 3:
                coachMenu.CoachMenu();;
                break;    
            
            case 4:
                doctorMenu.DoctorMenu();;
                break;

            default:
                System.out.println("\nCHAO!");
                //Controller.getController().controller.remove("001");
                /*System.out.println(Controller.getController().controller.get("001").getName());
                System.out.println(Controller.getController().controller.get("001").getCity());
                System.out.println(Controller.getController().controller.get("001").getListPlayers());*/
                //System.out.println(Controller.getController().controller.containsKey("001"));
                break;
        }


    }

}
