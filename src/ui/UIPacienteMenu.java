package ui;

import model.Doctor;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UIPacienteMenu {

    public static void showPacienteMenu(){
        int response = 0;
        do {
            System.out.println("");
            System.out.println("Paciente");
            System.out.println("Bievenido"+ UIMenu.pacienteLogged.getName());
            System.out.println("1. Libro de citas");
            System.out.println("2. Mis citas");
            System.out.println("0. Logout");

            Scanner sc = new Scanner(System.in);
            response = Integer.parseInt(sc.nextLine());

            switch (response){
                case 1:
                    showLibroCitasMenu();
                    break;
                case 2:
                    showPacienteMisCitas();
                    break;
                case 0:
                    UIMenu.showMenu();
                    break;
            }

        }while (response!=0);
    }

    @SuppressWarnings("ForLoopReplaceableByForEach")
    private static void showLibroCitasMenu(){
        int  response = 0;
        do {
            System.out.println("Libro de citas");
            System.out.println("Seleccionar fecha");
            Map<Integer, Map<Integer, Doctor>> doctores = new TreeMap<>();
            int k = 0;
            for (int i = 0; i < UIDoctorMenu.doctoresCitasDisponibles.size(); i++) {
                ArrayList<Doctor.CitaDisponible> citaDisponibles
                        = UIDoctorMenu.doctoresCitasDisponibles.get(i).getCitaDisponible();

                Map<Integer, Doctor> citasDoctor = new TreeMap<>();
                for (int j = 0; j < citaDisponibles.size(); j++) {
                    k++;
                    System.out.println(k + ". "+ citaDisponibles.get(j).getDate());
                    citasDoctor.put(Integer.valueOf(j), UIDoctorMenu.doctoresCitasDisponibles.get(i) );
                    doctores.put(Integer.valueOf(k), citasDoctor);

                }

            }
            Scanner sc = new Scanner(System.in);
            int responseFechaSeleccionada = Integer.valueOf(sc.nextLine());
            Map<Integer, Doctor> doctorFechaSeleccionada = doctores.get(responseFechaSeleccionada);
            Integer indexDate = 0;
            Doctor doctorSeleccionado = new Doctor("", "");

            for (Map.Entry<Integer, Doctor> doc:doctorFechaSeleccionada.entrySet()) {
                indexDate = doc.getKey();
                doctorSeleccionado =doc.getValue();
            }

            System.out.println(doctorSeleccionado.getName()+ ". Fecha " +
                    doctorSeleccionado.getCitaDisponible().get(indexDate).getDate() + ". Hora: "+
                    doctorSeleccionado.getCitaDisponible().get(indexDate).getTime());

            System.out.println("Confirma tu cita: \n1. Si \n2. Cambiar informacion");
            response = Integer.valueOf(sc.nextLine());

            if (response == 1){
                UIMenu.pacienteLogged.addCitasDoctors(
                        doctorSeleccionado,
                        doctorSeleccionado.getCitaDisponible().get(indexDate).getDate(null),
                        doctorSeleccionado.getCitaDisponible().get(indexDate).getTime()
                );

                showPacienteMenu();
            }




        }while (response!=0);
    }

    private static void showPacienteMisCitas(){
        int response = 0;
        do {
            System.out.println("Mis citas");
            if (UIMenu.pacienteLogged.getCitasDoctors().size()==0){
                System.out.println("No hay citas disponibles");
                break;
            }

            for (int i = 0; i < UIMenu.pacienteLogged.getCitasDoctors().size(); i++) {
                int  j = i + 1;
                System.out.println(j + ". "+
                        "Fecha: "+ UIMenu.pacienteLogged.getCitasDoctors().get(i).getDate()+
                        "Hora: "+ UIMenu.pacienteLogged.getCitasDoctors().get(i).getTime()+
                        "\nDoctor: "+ UIMenu.pacienteLogged.getCitasDoctors().get(i).getDoctor().getName()
                );


            }
            System.out.println("0. Return");

        }while (response!=0);

    }
}
