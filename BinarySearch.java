import java.util.Scanner;

public class BinarySearch {
    

    public static boolean BS(int arr[],int k ){

        int s = 0;
        int e = arr.length - 1;
        int mid = s + (e-s)/2;

        while(s <= e){

            if(k == arr[mid]){
                return true;
            }
            else if(arr[mid] < k){
                s = mid + 1;
            }
            else{
                e = mid - 1;
            }
            mid = s + (e-s)/2;
    
        }
        return false;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int arr[] = {2,16,17,39,66,78};

        System.out.println("Enter Key");
        int Key = sc.nextInt();
    
        boolean ans = BS(arr, Key);

        if(ans){
            System.out.println("Key Present");
        }
        else{
            System.out.println("Key not found");
        }
        sc.close();

    }
}
