package javaoop.challengeFabrizio;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ContainerTag extends Tag{

    protected List<Tag> lista;

    public void addTag(Tag tag){
        lista.add(tag);
    }

    public ContainerTag(String tag) {
        super(tag);
        lista = new ArrayList<>();
    }
    @Override
    public void print(){
        System.out.print("<" + tag);
        for(Map.Entry<String, String> entry : attributes.entrySet()){
            System.out.print(" " + entry.getKey() + "=\"" + entry.getValue() + "\"");
        }
        System.out.print(">");
        for(Tag i : lista){
            i.print();
        }
        System.out.print("</" + tag + ">");
    }
}
