package model;

public class Enfermera extends User {
    private String especialidad;

    public Enfermera(String name, String email){
        super(name, email);
    }

    @Override
    public void showDataUser(){
        System.out.println("Empleado del Hospital: Cruz verde");
        System.out.println("Departamentos: Nutriologia, Pediatria");
    }

    public String getEspecialidad(){
        return especialidad;
    }

    public void setEspecialidad(String especialidad){
        this.especialidad = especialidad;
    }

}
