import java.util.Scanner;

public class reverseOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] arr = new int[5];
        System.out.println("Enter array number: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = input.nextInt();
        }
        System.out.println("reverse array: ");
        for(int i = arr.length-1; i >=0; i--){
            System.out.print(arr[i] + " ");
        }


    }
}
