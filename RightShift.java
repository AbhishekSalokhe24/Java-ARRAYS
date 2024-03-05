import java.util.Scanner;

public class RightShift {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Here how many times to shift Right : ");
        int n  = sc.nextInt();        
        
        
        int j,last = 0;

        int arr[] = {1,2,3,4,5};

        System.out.println("Before Shift..");
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        for(int i = 0;i<n;i++){
            last = arr[arr.length-1];
            
            for(j = arr.length-1 ; j>0 ;j--){
                arr[j] = arr[j-1];
            }

            arr[j] = last;
        }
        System.out.println("\n After Shift..");
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        sc.close();
    }
}
