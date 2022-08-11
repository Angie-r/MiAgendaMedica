import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.Date;

public class Doctor {
    //Atributos
    static int id = 0; //Auto incrementado
    private String name;
    private String especialidad;
    private String email;

    Doctor(){
        System.out.println("Construyendo el objeto Doctor");

    }

    Doctor(String name, String especialidad){
        System.out.println("El nombre del doctor asignado es: "+ name);
        this.name = name;
        this.especialidad = especialidad;
        id++;
    }

    //Comportamientos

    public void showName(){
        System.out.println(name);
    }

    public void showId(){
        System.out.println("ID Doctor: "+ id);
    }

    ArrayList<CitaDisponible> citaDisponible = new ArrayList<>();
    public void agregarCita(Date date, String time){
        citaDisponible.add(new Doctor.CitaDisponible(date,time));
    }

    public ArrayList<CitaDisponible> getCitaDisponible(){
        return citaDisponible;
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
    }
}

