package model;
import java.util.Date;

public class CitasDoctor implements Calendario  {
        private int id;
        private Paciente paciente;
        private Doctor doctor;
        private Date date;
        private String time;

        public int getId(){
            return id;
        }

        public void setId(int id){
            this.id = id;
        }

        public Paciente getPaciente(){
            return paciente;
        }

        public void setPaciente(Paciente paciente){
            this.paciente = paciente;
        }

        public Doctor getDoctor(){
            return doctor;
        }

        public void setDoctor(Doctor doctor){
            this.doctor = doctor;
        }

        public Date getDate(){
            return date;
        }

        public void setDate(Date date){
            this.date = date;
        }

        public String getTime(){
            return time;
        }

        public void setTime(String time){
            this.time = time;
        }

        @Override
        public void calendario(Date date, String time){

        }



}

