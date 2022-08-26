import model.Calendario;
import model.Doctor;
import model.Paciente;
import model.User;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        //showMenu();

        Doctor myDoctor = new Doctor("Gabriela Romero", "Cirugia");
        myDoctor.agregarCita(new Date(), "4pm");
        myDoctor.agregarCita(new Date(), "10am");
        myDoctor.agregarCita(new Date(), "1 pm");

        System.out.println(myDoctor);

        User user = new Doctor("Angela", "anjera27@gmail.com");
        user.showDataUser();
        User userPa = new Paciente("Gabriela", "angy_chini@hotmail.com");
        userPa.showDataUser();
        User user1 = new User("Angela", "anjera27@gmail.com") {
            @Override
            public void showDataUser() {
                System.out.println("Doctor\n");
                System.out.println("Hospital: Cruz verde");
                System.out.println("Departamento: Geriatria");

            }
        };

        user1.showDataUser();

        Calendario calendario = new Calendario() {
            @Override
            public void calendario(Date date, String time) {

            }
        };

        }




       /* for (model.Doctor.CitaDisponible cD: myDoctor.getCitaDisponible()) {
            System.out.println(cD.getDate()+ " " + cD.getTime());
        }*/

        /*
        Paciente paciente = new Paciente("Angela Silva", "anjera27@gmail.com");
        paciente.setWeight(54.6);
        System.out.println(paciente);


        paciente.setPhoneNumber("12345688");*/



    }



