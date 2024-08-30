package Exception.Second;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[6];
        for(int i=0; i<arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        IndexOfBound index = new IndexOfBound();
        index.indexOutOfBound(arr);
    }
}
