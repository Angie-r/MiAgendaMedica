package ui;

import model.Doctor;
import model.Paciente;

import java.util.ArrayList;
import java.util.Scanner;

public class UIMenu {

    public static final String[] MESES = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre" };
    public static Doctor doctorLogged;
    public static Paciente pacienteLogged;

    public static void showMenu(){
        System.out.println("Bienvenido a la agenda de citas");
        System.out.println("Selecciona la opcion deseada");

        int response = 0;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Paciente");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.parseInt(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("Doctor");
                    response = 0;
                    authUser(1);
                    break;
                case 2:
                    response = 0;
                    authUser(2);
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
            System.out.println("model.Paciente");
            System.out.println("1. Libro de citas");
            System.out.println("2. Mis Citas");
            System.out.println("0. Regresar");

            Scanner sc = new Scanner(System.in);
            response = Integer.parseInt(sc.nextLine());

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

    private static void authUser(int userType){
        ArrayList<Doctor> doctores = new ArrayList<>();
        doctores.add(new Doctor("Alejandro Martinez", "alejandro@mail.com"));
        doctores.add(new Doctor("Karen Sosa", "kare@mail.com"));
        doctores.add(new Doctor("Rocio Gomez", "rocio@mail.com"));

        ArrayList<Paciente> pacientes =  new ArrayList<>();
        pacientes.add(new Paciente("Angela Romero", "angela@mail.com"));
        pacientes.add(new Paciente("Roberto Rodriguez", "roberto@mail.com"));
        pacientes.add(new Paciente("Carlos Sanchez", "carlos@mail.com"));

        boolean emailCorrect = false;
        do{
            System.out.println("Ingresa tu correo: [a@a.com]");
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();
            if (userType == 1){

                for (Doctor d: doctores){
                    if (d.getEmail().equals(email)){
                        emailCorrect = true;
                        //Obtener usuario logueado
                        doctorLogged = d;
                        //Mostrar menu del doctor
                        UIDoctorMenu.showDoctorMenu();
                    }
                }
            }

            if (userType == 2){
                for (Paciente p: pacientes){
                    if (p.getEmail().equals(email)){
                        emailCorrect = true;
                        pacienteLogged = p;
                        // Mostrar menu de pacientes
                        UIPacienteMenu.showPacienteMenu();

                    }
                }
            }
        }while (!emailCorrect);

    }

    static void showPacienteMenu(){}
}
