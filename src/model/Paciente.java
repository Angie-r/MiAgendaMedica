package model;

import java.util.ArrayList;
import java.util.Date;

public class Paciente extends User{

    //Atributos
    private String birthday;
    private double weight; //peso
    private double heigth; //altura
    private String blood;

    private ArrayList<CitasDoctor> citasDoctors = new ArrayList<>();
    private ArrayList<CitasEnfermeras> citasEnfermeras = new ArrayList<>();



    public  String getBirthday(){
        return birthday;
    }

    public void setBirthday(String birthday){
        this.birthday = birthday;
    }
    public double getWeight(){
        return weight;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }

    public double getHeigth(){
        return heigth;
    }

    public void setHeigth(double heigth){
        this.heigth = heigth;
    }


    public Paciente(String name, String email){
        super(name,email);
        //System.out.println("\n");
        //System.out.println("El nombre del paciente es: "+ name);


    }

    @Override
    public String toString() {
        return super.toString()+ "\nAge: "+ birthday + "\n Weight"+ getWeight()+
                "\n Height: "+ getHeigth()+ "\n Blood: "+blood;
    }

    @Override
    public void showDataUser(){
        System.out.println("Paciente");
        System.out.println("Historial completo desde nacimiento");
    }

    public ArrayList<CitasDoctor> getCitasDoctors() {
        return citasDoctors;
    }

    public void addCitasDoctors(Doctor doctor, Date date, String time) {
        CitasDoctor citasDoctor = new CitasDoctor(this,doctor);
        citasDoctor.calendario(date, time);
        citasDoctors.add(citasDoctor);
    }

    public ArrayList<CitasEnfermeras> getCitasEnfermeras() {
        return citasEnfermeras;
    }

    public void setCitasEnfermeras(ArrayList<CitasEnfermeras> citasEnfermeras) {
        this.citasEnfermeras = citasEnfermeras;
    }
}


