public class Paciente {
    public static int id = 0;

    String name;
    String email;
    String address;
    String phoneNumber;
    String birthday;
    double weight; //peso
    double heigth; //altura
    String blood;


    Paciente(String name, String email){
        System.out.println("\n");
        System.out.println("El nombre del paciente es: "+ name);
        this.name = name;
        this.email = email;

    }


}
