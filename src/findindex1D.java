import java.util.*;
public class findindex1D{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("How many numbers?");
        int n=sc.nextInt();
        float[] marks = new float[n];
        System.out.println("Enter "+n+" numbers:");
        for(int i=0;i<n;i++){
            marks[i] = sc.nextFloat();
        }
        System.out.println("Which number to find?");
        int p=sc.nextInt();
        for(int i=0;i<n;i++){
            if(p==marks[i])
             System.out.println("Index is "+i);
        }
    }}