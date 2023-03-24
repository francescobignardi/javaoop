package javaoop.exercises._3;

public class Student {
    private String nome;

    private String cognome;

    private int eta;

    private String corso;

    private double altezzaInMetri;

    public int nameCounter;

    Student(String nome, String cognome, int eta, String corso, double altezzaInMetri){
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.corso = corso;
        this.altezzaInMetri = altezzaInMetri;
    }

    public Student(){}

    public String getNome(){
        nameCounter++;
        return nome;
    }
    public String getCognome(){
        return cognome;
    }
    public int getEta(){
        return eta;
    }
    public String getCorso(){
        return corso;
    }
    public double getAltezzaInMetri(){
        return altezzaInMetri;
    }



    public void setNome (String nome){
        this.nome = nome;
    }
    public void setCognome (String cognome){
        this.cognome = cognome;
    }
    public void setEta (int eta){
        if (eta < 18) {
            System.out.println("Non ammesso");
        } else {this.eta = eta;}
    }
    public void setCorso (String corso){
        this.corso = corso;
    }
    public void setAltezzaInMetri (double altezzaInMetri){
        this.altezzaInMetri = altezzaInMetri;
    }

}