package javaoop.Geometria;

public class Cerchio extends Figura {
    public Cerchio(Double raggio) {
        super(raggio);
        nome = "Cerchio";
    }
    @Override
    public void Perimetro(){
        System.out.println((raggio+raggio)*Math.PI);
    }
    @Override
    public void Area(){
        System.out.println(raggio*raggio*Math.PI);
    }
}
