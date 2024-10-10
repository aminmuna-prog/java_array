public class desendingOrder {
    public static void main(String[] args) {
        int[] arr = {23, 5, 67, 20, 3, 30, 79, 3, 70, 2};
        for(int i = 0; i < arr.length; i ++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("array after desending order: ");
        for (int i = 0; i < arr.length; i++){
            System.out.print( arr[i] + " ");
        }

    }
}
