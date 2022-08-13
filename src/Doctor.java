import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.Date;
import java.util.Set;

public class Doctor extends User {
    //Atributo
    private String especialidad;

    public String getEspecialidad(){
        return especialidad;
    }
    public void setEspecialidad(String especialidad){
        this.especialidad = especialidad;
    }

    Doctor(String name, String email){
        super(name, email);
        System.out.println("El nombre del doctor asignado es: "+ name);
        this.especialidad = especialidad;
    }

    //Comportamientos

    ArrayList<CitaDisponible> citaDisponible = new ArrayList<>();
    public void agregarCita(Date date, String time){
        citaDisponible.add(new Doctor.CitaDisponible(date,time));
    }

    public ArrayList<CitaDisponible> getCitaDisponible(){
        return citaDisponible;
    }

    @Override
    public String toString() {
        return super.toString() + "\nEspecialidad: "+ especialidad + "\n Cita disponible: " + citaDisponible.toString();
    }

    public static class CitaDisponible{
        // Disponibilidad de cita.
        private int id;
        private Date date;
        private String time;

        public CitaDisponible(Date date, String time){
            this.date = date;
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
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

