package javaoop.Geometria;

public class Cerchio extends Figura {
    public Cerchio(Double raggio) {
        super(raggio);
        nome = "Cerchio";
    }
    public Double getPerimetro(){
        return((raggio+raggio)*Math.PI);
    }
    public Double getArea(){
        return(raggio*raggio*Math.PI);
    }
}
