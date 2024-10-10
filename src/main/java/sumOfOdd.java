public class sumOfOdd {
    public static void main(String[] args) {
        int [] arr = {2, 3, 4, 6, 8, 10, 11, 5, 1};
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            if( arr[i] % 2 != 0){
                System.out.println(arr[i] + " ");
                sum += arr[i];
            }
        }
        System.out.println("Sum of odd number of array: " + sum);
    }
}
