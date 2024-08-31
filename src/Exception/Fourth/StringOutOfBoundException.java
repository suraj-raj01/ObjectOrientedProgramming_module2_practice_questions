package Exception.Fourth;

public class StringOutOfBoundException {
    public static void stringOutOfBoundException(String string){
        try {
            String substring = string.substring(0,9);
            System.out.println(substring);
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("StringOutOfBoundException");
            System.out.println(e.getMessage());
        }
    }
}
