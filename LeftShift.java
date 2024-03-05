public class LeftShift {
    public static void main(String[] args) {
        
        int arr[] = {1, 2, 3, 4, 5};

        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        int j,first = 0;
        first = arr[0];
        for(j = 0;j<arr.length-1;j++){
            
            arr[j] =  arr[j+1];         
        }

        arr[j] = first;
        System.out.println("After Rotation..");
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
