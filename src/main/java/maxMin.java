public class maxMin {
    public static void main(String[] args) {
        int [] arr = {55, 1, 65, 7, 100, 8};
        int max = arr[0];
        int min = arr[0];
        for(int i = 0; i < arr.length; i ++){
           if(arr[i] > max){
               max = arr[i];
           }
            if(arr[i] < min){
                min = arr[i];
            }

        }
        System.out.println("maximum Value: " + max);
        System.out.println("minimum Value: " + min);
    }
}
