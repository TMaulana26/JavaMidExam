package Message;

import java.util.Scanner;

public class Sender {
    static String connect;
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var server = new MailMessenger();
        var status = new StdMessenger();

        System.out.print("Connect To Server ? (y/n) : ");
        connect = input.nextLine();
        System.out.print("Send Message to : ");
        String receiver = input.nextLine();
        System.out.print("Message Subject : ");
        String subject = input.nextLine();
        System.out.print("Message         : ");
        String message = input.nextLine();
        input.close();

        if (connect.equals("y")) {
            server.connect();
        } else if (connect.equals("n")) {
            server.disconnect();
        } else {
            System.out.println("Invalid!");
        }
        status.sendMessage(receiver, subject, message);
    }
}
