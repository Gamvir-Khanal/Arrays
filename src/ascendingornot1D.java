import java.util.*;
public class ascendingornot1D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c=1;
        System.out.println("How many numbers? :");
        int n = sc.nextInt();
        int numb[]=new int[n];
        System.out.println("Enter the numbers :");
        for(int i=0;i<n;i++){
            numb[i]=sc.nextInt();
        }
        for(int i=1;i<n;i++){
            if(numb[i]<numb[i-1]) {
                c=0;
                break;
            }
        }
        if(c==1)System.out.println("It is in ascending order.");
        else System.out.println("It is not in ascending order.");
    }
}