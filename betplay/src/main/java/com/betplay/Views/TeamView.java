package com.betplay.Views;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.betplay.Controller;
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
                    sc.nextLine();
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
                
                System.out.println("\n> Código del equipo: ");
                key = sc.nextLine();

                System.out.println("\n> Id del equipo: ");
                Id = sc.nextInt();
                sc.nextLine();
               
                System.out.println("\n> Nombre del equipo: ");
                name = sc.nextLine();
                
                System.out.println("\n> Ciudad del equipo: ");
                city = sc.nextLine();
               
                myTeam.setId(Id);
                myTeam.setName(name);
                myTeam.setCity(city);
                
                Controller.getController().controller.put(key, myTeam);
                //System.out.println(Controller.getController().controller.get("001"));
                System.out.println("\n* * * * * * * * * * * * * * * * ");
                System.out.println("Equipo agregado exitosamente.\n* * * * * * * * * * * * * * * * \n\n>>> Presiona una tecla para volver al menú.");
                sc.next();
                TeamMenu();
                break;
        
            case 2:
                String keyToEliminate;
                System.out.println("\n-------------------------------------");
                System.out.println("Código del equipo que desea eliminar:\n-------------------------------------\n>>> ");
                keyToEliminate = sc.nextLine();
                if (Controller.getController().controller.containsKey(keyToEliminate) == true) {
                    Controller.getController().controller.remove(keyToEliminate);
                    System.out.println("\n* * * * * * * * * * * * * * * * ");
                System.out.println("Equipo eliminado exitosamente.\n* * * * * * * * * * * * * * * * \n\n>>> Presiona una tecla para volver al menú.");
                }
                else {
                    System.out.println("\n:: :: :: :: :: :: :: :: :: :: :: :: :: :: :: :: :: ::");
                    System.out.println("::  No se ha creado ningún equipo con ese código.  ::\n:: :: :: :: :: :: :: :: :: :: :: :: :: :: :: :: :: ::");
                }
                
                System.out.println("\n>>> Presiona una tecla para volver al menú.");
                sc.next();
                TeamMenu();
                break;


            default:
                myMenu.GeneralMenu();
                break;
        }


    }
    

}
