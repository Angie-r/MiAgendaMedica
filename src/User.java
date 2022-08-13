import java.util.Set;

public class User {
    private int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;

    public User(String name, String email){
        this.name = name;
        this.email = email;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String Address){
        this.address = address;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber){
        if (phoneNumber.length()>8){
            System.out.println("El  numero de telefono debe tener 8 digitos");
        } else if (phoneNumber.length()==8) {
            this.phoneNumber = phoneNumber;
        }

    }

    @Override
    public String toString() {
        return "User: " + name + ", Email: "+ email +
                "\n Address: "+ address+ ". Phone: "+ phoneNumber;
    }
}