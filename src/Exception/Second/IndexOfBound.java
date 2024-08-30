package Exception.Second;

public class IndexOfBound {
    public void indexOutOfBound(int[] arr){
        for (int j=0; j<arr.length; j++) {
            System.out.print(arr[j+1] + " ");
        }
    }
}
