import java.util.*;
public class matmultiply2D{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter rows and columns of first matrix:");
        int sum=0;
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int[][] mat1= new int[r1][c1];
        System.out.println("Enter the elements for first matrix:");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                mat1[i][j]= sc.nextInt();
            }
        }
        System.out.println("Enter rows and columns of second matrix:");
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        int[][] mat2= new int[r2][c2];
        System.out.println("Enter the elements for second matrix:");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                mat2[i][j]= sc.nextInt();
            }
        }
        int[][] ans= new int[r1][c2];
        if(c1!=r2) System.out.println("Multiplication can't be done!");
        else{
            for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                sum=0;
            for(int k=0;k<c1;k++){
                sum = sum+mat1[i][k]*mat2[k][j];
            }
            ans[i][j]=sum;
        }}
        System.out.println("Answer of the multiplication is :");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                System.out.print(ans[i][j]+"  ");
            }
            System.out.println("");
        }
        }
    }
}