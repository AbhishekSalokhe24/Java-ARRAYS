public class SortAscending {
    
    public static void main(String[] args) {
        
        int arr[] = {7,4,1,8,5,2};

        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i] > arr[j]){    // ---> here just change ' > ' to ' < ' == for descending,,,
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }

        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
