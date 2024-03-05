package javaoop.Geometria;

public class Triangolo extends Figura {

    public Triangolo(Double cateto1, Double cateto2, Double cateto3){
        super(cateto1, cateto2, cateto3);
        nome = "Triangolo";
    }
    public Double getPerimetro(){
        return(cateto1+cateto2+cateto3);
    }
    public Double getArea(){
        Double perimetroFrattoDue = (cateto1+cateto2+cateto3)/2;
        Double area = Math.sqrt(perimetroFrattoDue * (perimetroFrattoDue - cateto1)
        * (perimetroFrattoDue - cateto2) * (perimetroFrattoDue - cateto3));
        return area;
    }
}
