public class LargetsEle {
    public static void main(String[] args) {
        
        int arr[] = {150,155,90,99,102,52};
        
        int max = arr[0];
        for(int i = 0; i<arr.length;i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }

        System.out.println(max);
    }
}
