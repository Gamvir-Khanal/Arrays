import java.util.*;
public class names1D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many names? :");
        int n = sc.nextInt();
        sc.nextLine(); //This is to counsume the \n of nextInt().
        //If not done n-1 names will be input instead of n names.
        String name[] = new String[n];
        System.out.println("Enter the names :");
        for(int i=0;i<n;i++){
            name[i]=sc.nextLine();
        }
        System.out.println("The entered names are :");
        for(int i=0;i<n;i++){
           System.out.println(name[i]);
        }
    }
}