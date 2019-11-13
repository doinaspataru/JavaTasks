package com.intership.task.oop;

public class Message_Processor {
    public void printXml(Xml_Message a){
        System.out.println(a.getName()+"body: "+ a.getBody());
    }
    public void printJson(Json_Message a){
        System.out.println(a.getName()+"body: "+ a.getBody());
    }
}
