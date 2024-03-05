public class ThirdLargest {

    public static int getThirdLargest(int arr[],int len){


        // sorting in ascending order first 
        for(int i = 0;i<len;i++){

            for(int j = i+1;j<len;j++){

                if(arr[i] > arr[j]){
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
        return arr[len-3];   // third largets from sorted arr
    }
    public static void main(String[] args) {
        
        int arr[] = {44,66,99,77,33,22,55};  
        int n = arr.length;

        int ans = getThirdLargest(arr, n);
        System.out.println("Third Largest in an Array --> "+ans);

        
    }
}
