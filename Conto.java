package javaoop;

public class Conto {

    private String iban;

    private double saldo;

    public Conto(String iban, double saldo) {
        this.iban = iban;
        this.saldo = saldo;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Double preleva(Double prelievo){

        if(prelievo > saldo){
            System.out.println("Cifra richiesta troppo alta");
        } else {
            saldo = saldo - prelievo;
        }
        return saldo;

    }

    public Double deposita(Double deposito){

        saldo = saldo + deposito;
        return saldo;

    }
}
