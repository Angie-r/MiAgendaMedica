package model;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {
    //Atributo
    private String especialidad;

    public String getEspecialidad(){
        return especialidad;
    }
    public void setEspecialidad(String especialidad){
        this.especialidad = especialidad;
    }

    public Doctor(String name, String email){
        super(name, email);

    }

    //Comportamientos

    ArrayList<CitaDisponible> citaDisponible = new ArrayList<>();
    public void agregarCita(String date, String time){
        citaDisponible.add(new Doctor.CitaDisponible(date,time));
    }

    public ArrayList<CitaDisponible> getCitaDisponible(){
        return citaDisponible;
    }

    @Override
    public String toString() {
        return super.toString() + "\nEspecialidad: "+ especialidad + "\n Cita disponible: " + citaDisponible.toString();
    }

    @Override
    public void showDataUser(){
        System.out.println("Empleado del  Hospital: Cruz roja");
        System.out.println("Departamento: Cancerologia");
    }

    public static class CitaDisponible{
        // Disponibilidad de cita.
        private int id;
        private Date date;
        private String time;
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        public CitaDisponible(String date, String time){
            try {
                this.date = formato.parse(date);
            } catch (ParseException e){
                e.printStackTrace();
            }
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate(String DATE) {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getDate(){
            return formato.format(date);
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        @Override
        public String toString() {
            return "Citas disponibles \n Date: "+ date + "\n Time: "+ time ;
        }
    }


}

