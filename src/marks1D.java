import java.util.*;
public class marks1D{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("How many subjects?");
        int n=sc.nextInt();
        float[] marks = new float[n];
        System.out.println("Enter marks of "+n+" subjects:");
        for(int i=0;i<n;i++){
             marks[i] = sc.nextFloat();
        }
        for(int i=0;i<n;i++){
             System.out.println(marks[i]);
        }
    }}