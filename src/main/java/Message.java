import java.util.Scanner;

public class Message {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Write a message: ");
        String message = sc.nextLine();
        System.out.println("Message Sent!");
        System.out.println(".");
        System.out.println("..");
        System.out.println("...");
        System.out.println("Opening message");
        System.out.println(".");
        System.out.println("..");
        System.out.println("...");
        System.out.println("Message Received!");
        System.out.println(message);
    }
}