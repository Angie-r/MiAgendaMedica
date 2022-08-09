import javax.print.Doc;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        //showMenu();

        Doctor myDoctor = new Doctor("Gabriela Romero", "Cirugia");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.especialidad);

        Paciente myPaciente = new Paciente("Angela Silva", "anjera27@gmail.com");
        System.out.println(myPaciente.name);
        System.out.println(myPaciente.email);
    }


}
