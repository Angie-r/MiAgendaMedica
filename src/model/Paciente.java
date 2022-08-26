package model;

public class Paciente extends User{

    //Atributos
    private String birthday;
    private double weight; //peso
    private double heigth; //altura
    private String blood;

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
}


