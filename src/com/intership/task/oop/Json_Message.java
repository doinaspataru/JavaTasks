package com.intership.task.oop;

public class Json_Message implements Message {
    private String name = "Json";
    private String body;

    public Json_Message() {
    }

    public Json_Message(String body) {
        this.body = body;
    }

    public String getName() {
        return this.name;
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
