import java.util.*;
public class StudentMarks{

    public static void totalMarks(int p[],int c[],int m[],String Name[]){
        System.out.println("Toatal Marks: ");
        int sum = 0;
        for(int i = 0;i<p.length;i++){
            sum = p[i] + c[i] + m[i];
        }
        System.out.println(sum);
    }
    
    public static void showData(int p[],int c[],int m[],String Name[]){
        System.out.println("DISPLAYING DATA..");
        for(int i = 0;i<p.length;i++){
            System.out.println("Name: "+Name[i]);
            System.out.println("Physics: ");
            System.out.println(p[i]);
            System.out.println("Chem");
            System.out.println(c[i]);
            System.out.println("Math: ");
            System.out.println(m[i]);
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int phy[] = new int[5];
        int  chem[] = new int[5];
        int maths[] = new int[5];
        String Name[] = new String[5];


        System.out.println("Enter Your Names Here:");
        for(int i = 0;i<Name.length;i++){
            Name[i] = sc.nextLine();
        }
        System.out.println("Enter Your PHY marks Here:");
        for(int i = 0;i<phy.length;i++){
            phy[i] = sc.nextInt();
        }
        System.out.println("Enter Your CHEM marks Here:");
        for(int i = 0;i<chem.length;i++){
            chem[i] = sc.nextInt();
        }
        System.out.println("Enter Your MATH marks Here:");
        for(int i = 0;i<maths.length;i++){
            maths[i] = sc.nextInt();
        }

        showData(phy, chem, maths, Name);
        totalMarks(phy, chem, maths, Name);
        sc.close();
    }
}