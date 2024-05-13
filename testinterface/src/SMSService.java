public class SMSService implements MessageService{
    public void sendMessage(String message){
        System.out.println("SMS sent to "+message);
    }
}