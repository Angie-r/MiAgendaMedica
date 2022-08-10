import javax.print.Doc;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        //showMenu();

        Doctor myDoctor = new Doctor("Gabriela Romero", "Cirugia");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.especialidad);

        Paciente paciente = new Paciente("Angela Silva", "anjera27@gmail.com");
        paciente.setWeight(54.6);
        System.out.println(paciente.getWeight());

        paciente.setPhoneNumber("12345688");

    }


}
