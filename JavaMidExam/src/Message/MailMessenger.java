package Message;

public class MailMessenger implements Messenger {
    boolean isSuccess;
    static boolean isConnectedToServer;

    public void connect() {
        isConnectedToServer = true;
        System.out.println("Connection To Server : "+ isConnectedToServer);
    }

    public void disconnect() {
        isConnectedToServer = false;
        System.out.println("Connection To Server : "+ isConnectedToServer);
    }

    
    public void sendMessage(String receiver, String subject, String message) {
        if (isConnectedToServer == true) {
            isSuccess = true;
            System.out.println("Message Successfully Send : "+ isSuccess);
        } else if (isConnectedToServer == false) {
            isSuccess = false;
            System.out.println("Message Successfully Send : "+ isSuccess);
        } else {
            System.out.println("Invalid!");
        }
        
    }

}
