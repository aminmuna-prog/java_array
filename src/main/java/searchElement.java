import java.util.Scanner;

public class searchElement {
    public static void main(String[] args) {
        int [] arr = {2, 3, 5, 6, 20};
        Scanner input = new Scanner(System.in);
        System.out.println("enter your searching element: ");
        int a = input.nextInt();
        for(int i = 0; i < arr.length; i ++){
            if( arr[i] == a){
                System.out.println( a + " element found");
                System.out.println("index number of " + i);
            }
        }
    }
}
