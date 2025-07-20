import java.util.*;
public class spiral2D{
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
        int rS=0,cS=0,rE=r-1,cE=c-1;
        System.out.println("The matrix elements in spiral order is:");
        while(rS<=rE && cS <=cE){
            for(int col=cS;col<=cE;col++){
                System.out.print(numb[rS][col]+"  ");
            }
            rS++;
            for(int row=rS;row<=rE;row++){
                System.out.print(numb[row][cE]+"  ");
            }
            cE--;
            for(int col=cE;col>=cS;col--){
                System.out.print(numb[rE][col]+"  ");
            }
            rE--;
            for(int row=rE;row>=rS;row--){
                System.out.print(numb[row][cS]+"  ");
            }
            cS++;
        }
    }
}
