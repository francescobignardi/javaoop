package javaoop.Geometria;

public class Triangolo extends Figura {

    public Triangolo(Double cateto1, Double cateto2, Double cateto3){
        super(cateto1, cateto2, cateto3);
        nome = "Triangolo";
    }
    @Override
    public void Perimetro(){
        System.out.println(cateto1+cateto2+cateto3);
    }
    @Override
    public void Area(){
        Double perimetroFrattoDue = (cateto1+cateto2+cateto3)/2;
        Double area = Math.sqrt(perimetroFrattoDue * (perimetroFrattoDue - cateto1)
        * (perimetroFrattoDue - cateto2) * (perimetroFrattoDue - cateto3));
        System.out.println(area);
    }
}
