package javaoop.Geometria;

public abstract class Figura {
    protected String nome;
    protected Double base;
    protected Double altezza;
    protected Double raggio;
    protected Double cateto1;
    protected Double cateto2;
    protected Double cateto3;
    public Figura(Double base, Double altezza){
        this.base = base;
        this.altezza = altezza;
    }
    public Figura(Double raggio){
        this.raggio = raggio;
    }
    public Figura(Double cateto1, Double cateto2, Double cateto3){
        this.cateto1 = cateto1;
        this.cateto2 = cateto2;
        this.cateto3 = cateto3;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getCateto1() {
        return cateto1;
    }

    public void setCateto1(Double cateto1) {
        this.cateto1 = cateto1;
    }

    public Double getCateto2() {
        return cateto2;
    }

    public void setCateto2(Double cateto2) {
        this.cateto2 = cateto2;
    }

    public Double getCateto3() {
        return cateto3;
    }

    public void setCateto3(Double cateto3) {
        this.cateto3 = cateto3;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltezza() {
        return altezza;
    }

    public void setAltezza(Double altezza) {
        this.altezza = altezza;
    }

    public Double getRaggio() {
        return raggio;
    }

    public void setRaggio(Double raggio) {
        this.raggio = raggio;
    }
    public void Perimetro(){}
    public void Area(){}

}
