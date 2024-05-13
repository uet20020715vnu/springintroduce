public class Example {
    public static void main(String[] args) {
        MessageService messageService = new SMSService();
        UserController userController = new UserController(messageService);
        userController.send();
    }
}
