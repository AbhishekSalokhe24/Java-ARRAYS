public class Array_copy {

    public static void main(String[] args) {
        
        int arr1[] = {1,2,3,4,5};
        int len = arr1.length;
        int arr2[] = new int[len];

        for(int i = 0;i<arr1.length;i++){
            arr2[i] = arr1[i];
        }

        for(int i = 0;i<arr1.length;i++){
            System.out.print(arr2[i]);
        }



    }
}