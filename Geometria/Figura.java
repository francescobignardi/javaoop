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

    public abstract Double getPerimetro();
    public abstract Double getArea();

}
