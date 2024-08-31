package Exception.Fourth;
import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String string = scanner.nextLine();
        //StringOutOfBoundException.stringOutOfBoundException(string);
        Character.StringOutOfBound(string);
    }
}
