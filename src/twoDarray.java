import java.util.*;
public class twoDarray {
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
        System.out.println("Entered elements are:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(numb[i][j]+"  ");
            }
            System.out.println("");
        }
    }
}