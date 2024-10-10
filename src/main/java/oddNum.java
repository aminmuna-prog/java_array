public class oddNum {
    public static void main(String[] args) {
        int [] arr = {2, 3, 5, 6, 77, 9, 11};
        for(int i = 0; i < arr.length; i ++){
            if(arr[i] % 2 != 0){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
