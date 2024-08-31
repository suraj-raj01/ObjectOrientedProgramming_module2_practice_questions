package Exception.Third;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c;
        try {
            System.out.print("Enter the first input : ");
            int input1 = scanner.nextInt();
            System.out.print("Enter the first input : ");
            int input2 = scanner.nextInt();
            c = input1/input2;
            System.out.println(c);
        }catch (ArithmeticException e){
            System.out.println("Denominator should not be zero");
            System.out.println(e.getLocalizedMessage());
        }
        catch (InputMismatchException e){
            System.out.println("InputMismatchException");
        }
        catch (TypeNotPresentException e){
            System.out.println("TypeNotPresentException");
        }
    }
}
