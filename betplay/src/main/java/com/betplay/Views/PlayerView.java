package com.betplay.Views;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.betplay.Controller;
import com.betplay.model.entity.Player;

public class PlayerView {
    public PlayerView() {

    }

    public void PlayerMenu () {
        IntroView myMenu = new IntroView();
        Scanner sc = new Scanner(System.in);
        boolean validator = true;
        int option = 0;
        System.out.println("\n\n_____________________");
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
                Player myPlayer = new Player();
                int Id;
                String firstName;
                String lastName;
                int age;
                int dorsal;
                String position;
                String keyTeamAdd;
                String keyTeamEliminate;
                
                
                System.out.println("\n> Código del equipo al cual va a pertenecer: ");
                keyTeamAdd = sc.nextLine();
                if (Controller.getController().controller.containsKey(keyTeamAdd) == true) {
                    System.out.println("\n> Id del jugador: ");
                    Id = sc.nextInt();
                    sc.nextLine();
                
                    System.out.println("\n> Nombres del jugador: ");
                    firstName = sc.nextLine();

                    System.out.println("\n> Apellidos del jugador: ");
                    lastName = sc.nextLine();

                    System.out.println("\n> Edad del jugador: ");
                    age = sc.nextInt();
                    
                    System.out.println("\n> Dorsal del jugador: ");
                    dorsal = sc.nextInt();
                    sc.nextLine();
                    
                    System.out.println("\n> Posición del jugador: ");
                    position = sc.nextLine();

                    myPlayer.setId(Id);
                    myPlayer.setFirstName(firstName);
                    myPlayer.setLastName(lastName);
                    myPlayer.setAge(age);
                    myPlayer.setDorsal(dorsal);
                    myPlayer.setPosition(position);
                    Controller.getController().controller.get(keyTeamAdd).listPlayers.add(myPlayer);
                    System.out.println("\n* * * * * * * * * * * * * * * * *");
                    System.out.println("Jugador agregado exitosamente.\n* * * * * * * * * * * * * * * * *\n\n>>> Presiona una tecla para volver al menú.");
                }

                else {
                    System.out.println("\n:: :: :: :: :: :: :: :: :: :: :: :: :: :: :: :: :: ::");
                    System.out.println("::  No se ha creado ningún equipo con ese código.  ::\n:: :: :: :: :: :: :: :: :: :: :: :: :: :: :: :: :: ::");
                    System.out.println("\n>>> Presiona una tecla para volver al menú.");
                }

                
                sc.next();
                PlayerMenu();
                break;
        
            case 2:
                boolean confirmation = false;
                int indexEliminated = 0;
                System.out.println("\n> Código del equipo del jugador: ");
                keyTeamEliminate = sc.nextLine();
                System.out.println("\n> Id del jugador: ");
                Id = sc.nextInt();
                sc.nextLine();
                if (Controller.getController().controller.containsKey(keyTeamEliminate) == true) {
                    for (Player player : Controller.getController().controller.get(keyTeamEliminate).listPlayers) {
                        if (player.getId() == Id) {
                            indexEliminated = Controller.getController().controller.get(keyTeamEliminate).listPlayers.indexOf(player);
                            confirmation = true;
                        }
                    }

                    if (confirmation == false) {
                        System.out.println("\n:: :: :: :: :: :: :: :: :: :: :: :: :: :: :: :: :: ::");
                        System.out.println("::  No se ha encontrado ningún jugador con ese Id.  ::\n:: :: :: :: :: :: :: :: :: :: :: :: :: :: :: :: :: ::");
                        System.out.println("\n>>> Presiona una tecla para volver al menú.");
                    }

                    else{
                        Controller.getController().controller.get(keyTeamEliminate).listPlayers.remove(indexEliminated);
                        System.out.println("\n* * * * * * * * * * * * * * * * *");
                        System.out.println("Jugador eliminado exitosamente.\n* * * * * * * * * * * * * * * * *\n\n>>> Presiona una tecla para volver al menú.");
                    }
                }
                else {
                    System.out.println("\n:: :: :: :: :: :: :: :: :: :: :: :: :: :: :: :: :: ::");
                    System.out.println("::  No se ha creado ningún equipo con ese código.  ::\n:: :: :: :: :: :: :: :: :: :: :: :: :: :: :: :: :: ::");
                    System.out.println("\n>>> Presiona una tecla para volver al menú.");
                }


                PlayerMenu();
                break;


            default:
                myMenu.GeneralMenu();
                break;
        }


    }
}
