package javaoop.challengeFabrizio;

public class Immagine {

    private String urlImmagine = "https://www.fastweb.it/var/storage_feeds/CMS/articoli/fc0/fc0ae789bb35c92de8b36f24c93a2595/640x360.jpg";

    public Immagine(String urlImmagine) {
        this.urlImmagine = urlImmagine;
    }
    public Immagine(){}

    public String getUrlImmagine() {
        return urlImmagine;
    }

    public void setUrlImmagine(String urlImmagine) {
        this.urlImmagine = urlImmagine;
    }
    @Override
    public String toString() {
        return "<img src='" + urlImmagine + "'>";
    }
}
