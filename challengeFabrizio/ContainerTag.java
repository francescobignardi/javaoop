package javaoop.challengeFabrizio;

import java.util.Map;

public class ContainerTag extends Tag{

    public ContainerTag(String tag) {
        super(tag);
    }
    @Override
    public void print(){
        System.out.println("<" + tag + ">");
        for(Map.Entry<String, String> entry : attributes.entrySet()){
            System.out.println(" <" + entry.getKey() + "> " + entry.getValue() + " </" + entry.getKey() + ">" + "\"");
        }
        System.out.println("</" + tag + ">");
    }
}
