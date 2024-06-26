package com.betplay.Views;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.betplay.Controller;
import com.betplay.model.entity.Doctor;
import com.betplay.model.entity.Player;

public class DoctorView {

    public DoctorView() {

    }

    public void DoctorMenu () {
        IntroView myMenu = new IntroView();
        Scanner sc = new Scanner(System.in);
        boolean validator = true;
        int option = 0;
        System.out.println("\n\n_____________________");
        System.out.println("\n   M É D I C O S");
        System.out.println("\n= = = = = = = = = = =\n\tMenú\n= = = = = = = = = = =");
        System.out.println("\n1. Agregar médico");
        System.out.println("\n2. Eliminar médico");
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
                Doctor myDoctor = new Doctor();
                int Id;
                String firstName;
                String lastName;
                int age;
                String degree;
                int expYear;
                String keyTeamAdd;
                String keyTeamEliminate;
                
                
                System.out.println("\n> Código del equipo al cual va a pertenecer: ");
                keyTeamAdd = sc.nextLine();
                if (Controller.getController().controller.containsKey(keyTeamAdd) == true) {
                    System.out.println("\n> Id del doctor: ");
                    Id = sc.nextInt();
                    sc.nextLine();
                
                    System.out.println("\n> Nombres del doctor: ");
                    firstName = sc.nextLine();

                    System.out.println("\n> Apellidos del doctor: ");
                    lastName = sc.nextLine();

                    System.out.println("\n> Edad del doctor: ");
                    age = sc.nextInt();
                    sc.nextLine();

                    System.out.println("\n> Título del doctor: ");
                    degree = sc.nextLine();
                    
                    
                    System.out.println("\n> Años de experiencia del doctor: ");
                    expYear = sc.nextInt();

                    myDoctor.setId(Id);
                    myDoctor.setFirstName(firstName);
                    myDoctor.setLastName(lastName);
                    myDoctor.setAge(age);
                    myDoctor.setDegree(degree);
                    myDoctor.setExpYear(expYear);
                    Controller.getController().controller.get(keyTeamAdd).listDoctors.add(myDoctor);
                    System.out.println("\n* * * * * * * * * * * * * * * * *");
                    System.out.println("Doctor agregado exitosamente.\n* * * * * * * * * * * * * * * * *\n\n>>> Presiona una tecla para volver al menú.");
                }

                else {
                    System.out.println("\n:: :: :: :: :: :: :: :: :: :: :: :: :: :: :: :: :: ::");
                    System.out.println("::  No se ha creado ningún equipo con ese código.  ::\n:: :: :: :: :: :: :: :: :: :: :: :: :: :: :: :: :: ::");
                    System.out.println("\n>>> Presiona una tecla para volver al menú.");
                }    

                sc.next();
                DoctorMenu();
                break;
        
            case 2:
                boolean confirmation = false;
                int indexEliminated = 0;
                System.out.println("\n> Código del equipo del doctor: ");
                keyTeamEliminate = sc.nextLine();
               
                if (Controller.getController().controller.containsKey(keyTeamEliminate) == true) {
                    System.out.println("\n> Id del doctor: ");
                    Id = sc.nextInt();
                    sc.nextLine();
                    for (Doctor doctor : Controller.getController().controller.get(keyTeamEliminate).listDoctors) {
                        if (doctor.getId() == Id) {
                            indexEliminated = Controller.getController().controller.get(keyTeamEliminate).listDoctors.indexOf(doctor);
                            confirmation = true;
                        }
                    }

                    if (confirmation == false) {
                        System.out.println("\n:: :: :: :: :: :: :: :: :: :: :: :: :: :: :: :: :: ::");
                        System.out.println("::  No se ha encontrado ningún doctor con ese Id.  ::\n:: :: :: :: :: :: :: :: :: :: :: :: :: :: :: :: :: ::");
                        System.out.println("\n>>> Presiona una tecla para volver al menú.");
                    }

                    else{
                        Controller.getController().controller.get(keyTeamEliminate).listDoctors.remove(indexEliminated);
                        System.out.println("\n* * * * * * * * * * * * * * * * *");
                        System.out.println("Doctor eliminado exitosamente.\n* * * * * * * * * * * * * * * * *\n\n>>> Presiona una tecla para volver al menú.");
                        
                    }
                }
                else {
                    System.out.println("\n:: :: :: :: :: :: :: :: :: :: :: :: :: :: :: :: :: ::");
                    System.out.println("::  No se ha creado ningún equipo con ese código.  ::\n:: :: :: :: :: :: :: :: :: :: :: :: :: :: :: :: :: ::");
                    System.out.println("\n>>> Presiona una tecla para volver al menú.");
                    
                }

                sc.next();
                DoctorMenu();
                break;


            default:
                myMenu.GeneralMenu();
                break;
        }


    }

}
