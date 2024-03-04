package javaoop.challengeFabrizio;

public class Paragrafo {

    private String paragrafo;

    public Paragrafo(String paragrafo) {
        this.paragrafo = paragrafo;
    }
    public Paragrafo(){}

    public String getParagrafo() {
        return paragrafo;
    }

    public void setParagrafo(String paragrafo) {
        this.paragrafo = paragrafo;
    }

    @Override
    public String toString() {
        Immagine immagine = new Immagine();
        Link link = new Link();
        StringBuilder sb = new StringBuilder();
        sb.append("<p>");
        if(paragrafo != null){
            sb.append(paragrafo);
        }
        if(immagine != null){
            sb.append(immagine);
        }
        if(link != null){
            sb.append(link);
        }
        sb.append("</p>");
        return sb.toString();
    }
}
