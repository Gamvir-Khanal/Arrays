import java.util.*;
public class maxandmin1D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers? :");
        int n = sc.nextInt();
        int numb[]=new int[n];
        System.out.println("Enter the numbers :");
        for(int i=0;i<n;i++){
            numb[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE, min=Integer.MAX_VALUE;
        System.out.println("Maximum number = "+max);
        System.out.println("Minimum number = "+min);
        for(int i=0;i<n;i++){
           if(numb[i]>max) max=numb[i];
           if(numb[i]<min) min=numb[i];
        }
        System.out.println("Maximum given number = "+max);
        System.out.println("Minimum given number = "+min);
    }
}