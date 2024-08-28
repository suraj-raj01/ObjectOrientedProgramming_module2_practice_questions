package StringBuilder;
//Write a program to display the length and capacity of String, StringBuilder and StringBuffer.
public class Q3 {
    public static void main(String[] args) {
        String string = "String";
        StringBuilder stringBuilder = new StringBuilder("StringBuilder");
        StringBuffer stringBuffer = new StringBuffer("StringBuffer");

        System.out.println("string.length() = " + string.length());
        System.out.println("stringBuilder.length() = " + stringBuilder.length());
        System.out.println("stringBuilder.capacity() = " + stringBuilder.capacity());
        System.out.println("stringBuffer.length() = " + stringBuffer.length());
        System.out.println("stringBuffer.capacity() = " + stringBuffer.capacity());
    }
}
/*
string.length() = 6
stringBuilder.length() = 13
stringBuilder.capacity() = 29
stringBuffer.length() = 12
stringBuffer.capacity() = 28
*/