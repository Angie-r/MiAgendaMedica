package ui;

import com.sun.xml.internal.ws.resources.UtilMessages;
import com.sun.xml.internal.ws.spi.db.BindingContextFactory;
import model.Doctor;

import java.util.ArrayList;
import java.util.Scanner;

public class UIDoctorMenu {

    public static ArrayList<Doctor> doctoresCitasDisponibles = new ArrayList<>();
    public static void showDoctorMenu(){



        int response = 0;
        do{
            System.out.println("\n\n");
            System.out.println("Doctor");
            System.out.println("Welcome "+ UIMenu.doctorLogged.getName());
            System.out.println("1. Agregar fecha disponible");
            System.out.println("2. Mi Calendario de citas");
            System.out.println("0. Logout");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    showAddAvailableAppointmentsMenu();
                    break;
                case 2:
                    break;
                case 0:
                    UIMenu.showMenu();
                    break;
            }

        }while (response != 0);
    }

    private static void showAddAvailableAppointmentsMenu(){
        int response = 0;

        do{
            System.out.println("");
            System.out.println("::Agregar cita disponible ");
            System.out.println("Seleccionar el mes");

                for (int i = 0; i <3; i++){
                    int j = i + 1;
                    System.out.println(j + ". " + UIMenu.MESES[i] );

            }
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            if (response > 0 && response <4){
                //1,2,3
                int seleccionarMes = response;
                System.out.println(seleccionarMes + " . "+ UIMenu.MESES[seleccionarMes-1]);
                System.out.println("Inserta la fecha disponible: [dd/mm/yyyy]");
                String date = sc.nextLine();

                System.out.println("Tu fecha es: "+ date + "\n1. Correcto \n2. Cambiar fecha" );
                int responderFecha = Integer.valueOf(sc.nextLine());
                if (responderFecha == 2) continue;

                int responderTiempo = 0;
                String hora = "";
                do {
                    System.out.println("Ingrese la hora disponible para esta fecha "+ date+ "[16:00]");
                    hora = sc.nextLine();
                    System.out.println("Su hora es: "+ hora + "\n 1. Correcto \n2. Cambiar hora");
                    responderTiempo = Integer.parseInt(sc.nextLine());


                }while (responderTiempo ==2);

                UIMenu.doctorLogged.agregarCita(date, hora);
                checkDoctorCitaDisponible(UIMenu.doctorLogged);


            }else if (response == 0){
                showDoctorMenu();
            }
        }while (response !=0);

    }

    private static void checkDoctorCitaDisponible(Doctor doctor){
        if (doctor.getCitaDisponible().size()>0 &&
                !doctoresCitasDisponibles.contains(doctor)){
            doctoresCitasDisponibles.add(doctor);
        }
    }


}
