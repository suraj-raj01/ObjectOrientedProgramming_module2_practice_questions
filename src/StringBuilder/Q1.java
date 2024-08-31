package StringBuilder;
//Write a program to concatenate StringBuilder & StringBuffer objects.
public class Q1 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("HELLO");
        StringBuilder sb2 = new StringBuilder("WORLD");
        System.out.println("Before concatenation");
        System.out.println(sb1);
        System.out.println(sb2);
        System.out.println("After concatenation");
        System.out.println(sb1.toString().concat(sb2.toString()));
    }
}
/*
Before concatenation
HELLO
WORLD
After concatenation
HELLOWORLD
*/