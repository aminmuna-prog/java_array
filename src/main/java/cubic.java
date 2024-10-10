import java.util.Scanner;

public class cubic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] arr = new int[5];
        int cubic = 0;
        int sum = 0;
        System.out.println("enter array element:");
        for(int i = 0; i < arr.length; i++){
            arr[i] = input.nextInt();
        }
        System.out.println("Cubic number of each element");
        for(int i = 0; i < arr.length; i++){
            cubic = arr[i]*arr[i]*arr[i];
            sum += cubic;

            System.out.print(cubic  + " ");

        }
        System.out.println(" ");
        System.out.println("Sum of cubic number" + sum);

    }
}
