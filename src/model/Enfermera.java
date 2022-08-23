package model;

public class Enfermera extends User {
    private String especialidad;

    public Enfermera(String name, String email){
        super(name, email);
    }

    public String getEspecialidad(){
        return especialidad;
    }

    public void setEspecialidad(String especialidad){
        this.especialidad = especialidad;
    }

}
