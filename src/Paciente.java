public class Paciente {
    public static int id = 0;
    //Atributos
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private String birthday;
    private double weight; //peso
    private double heigth; //altura
    String blood;

    Paciente(String name, String email){
        //System.out.println("\n");
        //System.out.println("El nombre del paciente es: "+ name);
        this.name = name;
        this.email = email;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }
    // 54.5 Kg. String
    public String getWeight(){
        return this.weight + " Kg. ";
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Paciente.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() > 8){
            System.out.println("El numero de telefono debe ser de 8 digitos");
        } else if (phoneNumber.length()==8) {
            this.phoneNumber = phoneNumber;
            System.out.println(phoneNumber);
        }

    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getHeigth() {
        return heigth + " Mts.";
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }
}
