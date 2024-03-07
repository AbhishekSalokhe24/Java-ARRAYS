import java.util.Scanner;

public class LinearSearch {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arr[] = {2,16,17,39,66,78};
        boolean flag = false;

        System.out.println("Enter Key");
        int Key = sc.nextInt();

        for(int i = 0;i<arr.length;i++){
            if(Key == arr[i]){
                flag = true;
            }
        }
        if(flag){
            System.out.println("Key Present");
        }
        else{
            System.out.println("Key not found");
        }
        sc.close();
    }
}
