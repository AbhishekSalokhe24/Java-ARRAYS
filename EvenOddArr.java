public class EvenOddArr {
    public static void main(String[] args) {
        
        int arr[] = {2,4,1,5,9,10,12,16,15};
        
        for(int i = 0;i<arr.length;i++){
            if(arr[i] % 2 == 0){
                System.out.print("Even: "+arr[i]+"\n");
            }
            else{
                System.out.print("Odd: "+arr[i]+"\n");
            }
        }

    }
}
