import java.util.Scanner;

public class storeElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[7];
        System.out.println("enter the array element: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = input.nextInt();
        }
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
