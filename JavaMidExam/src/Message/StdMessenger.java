package Message;

public class StdMessenger implements Messenger {
    boolean isSuccess;

    public void sendMessage(String receiver, String subject, String message) {

        if (MailMessenger.isConnectedToServer == true) {
            isSuccess = true;
            System.out.println("Message Successfully Send : "+ isSuccess);
        } else if (MailMessenger.isConnectedToServer == false) {
            isSuccess = false;
            System.out.println("Message Successfully Send : "+ isSuccess);
        } else {
            System.out.println("Invalid!");
        }
    }
    
}
