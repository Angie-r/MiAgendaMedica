package ui;

import java.util.Scanner;

public class UIMenu {

    public static String[] MESES = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre" };
    public static void showMenu(){
        System.out.println("Bienvenido a la agenda de citas");
        System.out.println("Selecciona la opcion deseada");

        int response = 0;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Paciente");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("Doctor");
                    break;
                case 2:
                    response = 0;
                    showPatientMenu();
                    break;
                case 0:
                    System.out.println("Gracias por tu visita");
                    break;
                default:
                    System.out.println("Selecciona una respuesta correcta");


            }
        }while (response !=0);
    }

    public static void showPatientMenu(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Paciente");
            System.out.println("1. Libro de citas");
            System.out.println("2. Mis Citas");
            System.out.println("0. Regresar");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("::Libro de citas");
                    for (int i = 1; i < 3; i++) {
                        System.out.println(i + ". "+ MESES[i] );
                    }
                    break;
                case 2:
                    System.out.println("::Mis Citas");
                    break;
                case 0:
                    showMenu();
                    break;
            }
        } while (response !=0);
    }
}
