package Exception.Fourth;

public class Character {
    public static void StringOutOfBound(String s){
        for(int i=0; i<=s.length(); i++){
            try{
            System.out.print(s.charAt(i)+" ");
            }catch (StringIndexOutOfBoundsException e){
                System.out.println();
                System.out.println(e.getMessage());
                break;
            }
        }
    }
}
