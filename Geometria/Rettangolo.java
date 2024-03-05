package javaoop.Geometria;

public class Rettangolo extends Figura {
    public Rettangolo(Double base, Double altezza) {
        super(base, altezza);
        nome = "Rettangolo";
    }
    public Double getPerimetro(){
        return(base+base+altezza+altezza);
    }
    public Double getArea(){
        return(base*altezza);
    }
}
