public class Main {

    interface Message {
        void PrepareMessage ();
        void MessageConverter();
    }

    public class MessageProcessor {
        public void printXml(XmlMessage a){
            System.out.println(a.getName()+"body: "+ a.getBody());
        }
        public void printJson(JsonMessage a){
            System.out.println(a.getName()+"body: "+ a.getBody());
        }
    }

    public class xmlMessage implements Message{
       public void PrepareMessage ()
        {
            name = "xmlMessage";
            body = "xmlpopup";
        }

        @Override
        public void returnMessage() {

        }
    }

    public class JsonMessage implements Message {
    private String name = "Json";
    private String body;

    public JsonMessage() {
    }

    public JsonMessage(String body) {
        this.body = body;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void prepareMessage() {
        System.out.println("NO message");
    }

    public void prepareMessage(String a) {
        System.out.println(a);
    }

    public void prepareMessage(String a, String b) {
        System.out.println(a + " " + b);

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

    public static void main(String[] args) {


    }
}



//        Define a class structure using the OOP principles for the following:
//        1. a MessageProcessor class that can 'process' different kinds of messages, outputting in console their contents
//        2. a structure for different Message classes (e.g. XmlMessage, JsonMessage, etc) that will implement a
//        Message interface
//        3. they should all have a 'name' field with their actual name, and the 'body' field which will have message contents
//        4. they should all have a constructor method with a String parameter that will be assigned to 'body'
//        5. each Message should have different 'prepareMessage' methods implemented that will receive different parameter list (empty/String/String, String) that should output in console their parameter values (if any) and the actual message type ('name')
//        6. a MessageConverter that can 'convert' messages from one type to another ('body' should be the same)