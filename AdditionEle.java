public class AdditionEle {
    public static void main(String[] args) {
        
        int arr[] = {10,20,90,27,15};
        int sum = 0;

        for(int i = 0;i<arr.length;i++){
            sum += arr[i];
        }
        System.out.println("Total sum : "+sum);
    }
}
