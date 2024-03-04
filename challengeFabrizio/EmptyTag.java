package javaoop.challengeFabrizio;

import java.util.Map;

public class EmptyTag extends Tag{
    public EmptyTag(String tag) {
        super(tag);
    }

    @Override
    public void print(){
        System.out.print("<" + tag);
        for(Map.Entry<String, String> entry : attributes.entrySet()){
            System.out.print(" " + entry.getKey() + "=\"" + entry.getValue() + "\"");
        }
        System.out.print(">");
    }
    // commento
}
