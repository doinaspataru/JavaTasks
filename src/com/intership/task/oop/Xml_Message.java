package com.intership.task.oop;

public class Xml_Message implements Message {
    private String name = "XML";
    private String body;

    public Xml_Message() {
    }

    public Xml_Message(String body) {
        this.body = body;
    }

    @Override
    public void prepareMessage() {
        System.out.println(getName()+" "+getBody());
    }

    public void prepareMessage(String a) {
        System.out.println(getName()+" "+getBody() + " "+a);
    }

    public void prepareMessage(String a, String b) {
        System.out.println(getName()+" "+ getBody() + " "+ a + " " +b);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
