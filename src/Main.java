import model.Doctor;
import model.Paciente;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        //showMenu();

        Doctor myDoctor = new Doctor("Gabriela Romero", "Cirugia");
        myDoctor.agregarCita(new Date(), "4pm");
        myDoctor.agregarCita(new Date(), "10am");
        myDoctor.agregarCita(new Date(), "1 pm");

        System.out.println(myDoctor);

       /* for (model.Doctor.CitaDisponible cD: myDoctor.getCitaDisponible()) {
            System.out.println(cD.getDate()+ " " + cD.getTime());
        }*/


        Paciente paciente = new Paciente("Angela Silva", "anjera27@gmail.com");
        paciente.setWeight(54.6);
        System.out.println(paciente);


        paciente.setPhoneNumber("12345688");



    }


}
