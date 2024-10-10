public class positiveElement {
    public static void main(String[] args) {
        int [] Array = {67, -4, 3, -5, 44};
        int sum = 0;
        for(int i = 0; i < Array.length; i ++){
            if( Array[i] > 0){
                sum += Array[i];

            }
        }
        System.out.println(sum);
    }
}
