package javaoop.Geometria;

public class Rettangolo extends Figura {
    public Rettangolo(Double base, Double altezza) {
        super(base, altezza);
        nome = "Rettangolo";
    }
    @Override
    public void Perimetro(){
        System.out.println(base+base+altezza+altezza);
    }
    @Override
    public void Area(){
        System.out.println(base*altezza);
    }
}
