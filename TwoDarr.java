import java.util.Scanner;

public class TwoDarr {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[5][5];

        System.out.println("Enter Elements...");
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr.length;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Displaying Elements...");
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
