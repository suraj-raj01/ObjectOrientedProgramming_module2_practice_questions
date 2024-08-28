package StringBuilder;
//Write a program to get a substring of a StringBuffer.
public class Q2 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("HelloWorld");
        System.out.println("Sub-string : "+sb.substring(0, 5));
    }
}
//Sub-string : Hello