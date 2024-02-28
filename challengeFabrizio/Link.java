package javaoop.challengeFabrizio;

public class Link {

    private String link = "https://github.com/francescobignardi";

    public Link(String link) {
        this.link = link;
    }
    public Link(){}

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return "<a href='" + link + "'>link</a>";
    }
}
