import java.util.Scanner;

public class Left_Rotate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Here how many times to shift left: ");
        int n  = sc.nextInt();


        int arr[] = {1,2,3,4,5};

        for(int i = 0;i<n;i++){

            int first = arr[0];
            int j = 0;

            for(j = 0;j<arr.length-1;j++){
                arr[j] = arr[j+1];
            }

            arr[j]  = first;
        }
        

        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();

    }
}
