import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int choice = 0;
        System.out.println("Enter ur choice: ");
        choice = sc.nextInt();

        switch(choice){
            case 1:
                System.out.println("MON");
            break;
            case 2:
                System.out.println("TUE");
            break;
            case 3:
                System.out.println("WED");
            break;
            default:
                System.out.println("Invalid Input");
        }

        sc.close();
        
    }
}
