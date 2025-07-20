import java.util.*;
public class search2D{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter rows and columns:");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] numb= new int[r][c];
        System.out.println("Enter the elements:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++)
                numb[i][j]= sc.nextInt();
            }
        System.out.println("Which number to search:");
        int n=sc.nextInt();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(n==numb[i][j]) System.out.print("Indices = ("+i+","+j+")");
            }
        }
    }
}