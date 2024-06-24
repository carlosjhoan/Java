package com.betplay.Views;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DoctorView {

    public DoctorView() {

    }

    public void DoctorMenu () {
        IntroView myMenu = new IntroView();
        Scanner sc = new Scanner(System.in);
        boolean validator = true;
        int option = 0;
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
                    validator = false;
                }

                catch (InputMismatchException e) {
                    System.out.println("\n* * * * * * * * * * * * *\nDebe ser un número entero\n>>> Intente de nuevo <<<\n* * * * * * * * * * * * *");
                    sc.next();
            }

           
        }

        switch (option) {
            case 1:
                System.out.println("\n>>> Agregar Médico");
                System.out.println("\nMédico agregado exitosamente.\nPresiona una tecla para volver al menú.");
                sc.next();
                DoctorMenu();
                break;
        
            case 2:
                System.out.println("\n>>> Eliminar médico");
                System.out.println("\nMédico eliminado exitosamente.\nPresiona una tecla para volver al menú.");
                sc.next();
                DoctorMenu();
                break;


            default:
                myMenu.GeneralMenu();
                break;
        }


    }

}
