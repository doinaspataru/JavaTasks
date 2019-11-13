package com.intership.task.oop;

public class Main {
        public static void main(String[] args) {
            Xml_Message xml = new Xml_Message("XML Body" );
            Json_Message json = new Json_Message( "JSon Body");
            System.out.println(xml.getName());
            xml.prepareMessage("nume","xml is here");
            System.out.println("body= "+xml.getBody());
            Message_Processor a = new Message_Processor();
            a.printXml(xml);
            Convert_Message conv = new Convert_Message();
            conv.ConvertMessage(xml.getBody(), json.getName());

        }
    }



//        Define a class structure using the OOP principles for the following:
//        1. a MessageProcessor class that can 'process' different kinds of messages, outputting in console their contents
//        2. a structure for different com.intership.task.oop.Message classes (e.g. XmlMessage, JsonMessage, etc) that will implement a
//        com.intership.task.oop.Message interface
//        3. they should all have a 'name' field with their actual name, and the 'body' field which will have message contents
//        4. they should all have a constructor method with a String parameter that will be assigned to 'body'
//        5. each com.intership.task.oop.Message should have different 'prepareMessage' methods implemented that will receive different parameter list (empty/String/String, String) that should output in console their parameter values (if any) and the actual message type ('name')
//        6. a MessageConverter that can 'convert' messages from one type to another ('body' should be the same)