package javaoop.challengeFabrizio;

import java.util.HashMap;
import java.util.Map;

public class Tag {

    private String tag;
    private Map<String, String> attributes;

    public Tag(String tag) {
        this.tag = tag;
        this.attributes = new HashMap<>();
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Map<String, String> getAttributes() {
        return attributes;
    }

    public void setAttribute(String attributeName, String attributeValue) {
        attributes.put(attributeName, attributeValue);
    }


    public void print(){
        System.out.print("<" + tag);
        for(Map.Entry<String, String> entry : attributes.entrySet()){
            System.out.print(" " + entry.getKey() + "=\"" + entry.getValue() + "\"");
        }
        System.out.print(">");
        System.out.print("</" + tag + ">");
    }
}
