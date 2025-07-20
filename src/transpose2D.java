import java.util.*;
public class transpose2D{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter rows and columns:");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] numb= new int[r][c];
        int[][] trans= new int[c][r];
        System.out.println("Enter the elements:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++)
                numb[i][j]= sc.nextInt();
            }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                trans[j][i]=numb[i][j];
            }
        }
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
               System.out.print(trans[i][j]+"  ");
            }
            System.out.println("");
        }
    }
}