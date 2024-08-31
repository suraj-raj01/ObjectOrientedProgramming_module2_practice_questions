package Exception.First;
import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int first = scanner.nextInt();
        System.out.println("Enter the second number : ");
        int second = scanner.nextInt();
        int ans = first+second;
        try {
            if(ans<150){
                throw new Exception();
            }else{
                System.out.println("Sum : "+ans);
            }
        }catch (Exception e){
            System.out.println("UserDefinedException");
            System.out.println(e.getMessage());
        }
    }
}
