public class Doctor {
    //Atributos
    static int id = 0; //Auto incrementado
    String name;
    String especialidad;

    Doctor(){
        System.out.println("Construyendo el objeto Doctor");
    }

    Doctor(String name, String especialidad){
        System.out.println("El nombre del doctor asignado es: "+ name);
        id++;
    }

    //Comportamientos

    public void showName(){
        System.out.println(name);
    }

    public void showId(){
        System.out.println("ID Doctor: "+ id);
    }
}

