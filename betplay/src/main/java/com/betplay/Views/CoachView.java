package com.betplay.Views;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.betplay.Controller;
import com.betplay.model.entity.Coach;
import com.betplay.model.entity.Doctor;
import com.betplay.model.entity.Player;

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
                Coach myCoach = new Coach();
                int Id;
                String firstName;
                String lastName;
                int age;
                int idFederation;
                String keyTeamAdd;
                String keyTeamEliminate;
                
                
                System.out.println("\n> Código del equipo al cual va a pertenecer: ");
                keyTeamAdd = sc.nextLine();
                if (Controller.getController().controller.containsKey(keyTeamAdd) == true) {
                    System.out.println("\n> Id del coach: ");
                    Id = sc.nextInt();
                    sc.nextLine();
                
                    System.out.println("\n> Nombres del coach: ");
                    firstName = sc.nextLine();

                    System.out.println("\n> Apellidos del coach: ");
                    lastName = sc.nextLine();

                    System.out.println("\n> coach ");
                    age = sc.nextInt();

                    System.out.println("\n> Id de la federación que lo avala: ");
                    idFederation = sc.nextInt();
                    sc.nextLine();                    

                    myCoach.setId(Id);
                    myCoach.setFirstName(firstName);
                    myCoach.setLastName(lastName);
                    myCoach.setAge(age);
                    myCoach.setIdFederation(idFederation);
                    Controller.getController().controller.get(keyTeamAdd).listCoaches.add(myCoach);
                    System.out.println("\n* * * * * * * * * * * * * * * * *");
                    System.out.println("Coach agregado exitosamente.\n* * * * * * * * * * * * * * * * *\n\n>>> Presiona una tecla para volver al menú.");
                }

                else {
                    System.out.println("\n:: :: :: :: :: :: :: :: :: :: :: :: :: :: :: :: :: ::");
                    System.out.println("::  No se ha creado ningún equipo con ese código.  ::\n:: :: :: :: :: :: :: :: :: :: :: :: :: :: :: :: :: ::");
                    System.out.println("\n>>> Presiona una tecla para volver al menú.");
                }
                sc.next();
                CoachMenu();
                break;
        
            case 2:
                boolean confirmation = false;
                int indexEliminated = 0;
                System.out.println("\n> Código del equipo del coach: ");
                keyTeamEliminate = sc.nextLine();
                
                if (Controller.getController().controller.containsKey(keyTeamEliminate) == true) {
                    System.out.println("\n> Id del coach: ");
                    Id = sc.nextInt();
                    sc.nextLine();
                    for (Coach coach : Controller.getController().controller.get(keyTeamEliminate).listCoaches) {
                        if (coach.getId() == Id) {
                            indexEliminated = Controller.getController().controller.get(keyTeamEliminate).listCoaches.indexOf(coach);
                            confirmation = true;
                        }
                    }

                    if (confirmation == false) {
                        System.out.println("\n:: :: :: :: :: :: :: :: :: :: :: :: :: :: :: :: :: ::");
                        System.out.println("::  No se ha encontrado ningún coach con ese Id.  ::\n:: :: :: :: :: :: :: :: :: :: :: :: :: :: :: :: :: ::");
                        System.out.println("\n>>> Presiona una tecla para volver al menú.");
                    }

                    else{
                        Controller.getController().controller.get(keyTeamEliminate).listCoaches.remove(indexEliminated);
                        System.out.println("\n* * * * * * * * * * * * * * * * *");
                        System.out.println("Coach eliminado exitosamente.\n* * * * * * * * * * * * * * * * *\n\n>>> Presiona una tecla para volver al menú.");
                    }
                }
                else {
                    System.out.println("\n:: :: :: :: :: :: :: :: :: :: :: :: :: :: :: :: :: ::");
                    System.out.println("::  No se ha creado ningún equipo con ese código.  ::\n:: :: :: :: :: :: :: :: :: :: :: :: :: :: :: :: :: ::");
                    System.out.println("\n>>> Presiona una tecla para volver al menú.");
                }
                
                sc.next();
                CoachMenu();
                break;


            default:
                myMenu.GeneralMenu();
                break;
        }


    }
}
