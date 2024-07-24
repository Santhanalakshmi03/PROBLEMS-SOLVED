import java.util.*;
public class main{
    public static void main(String args[])
    {
        int R,C;
        int[][] A=new int[100][100];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Row:");
        R=sc.nextInt();
        System.out.println("Enter cols:");
        C=sc.nextInt();
        for(int i=0;i<R;i++)
        {
            System.out.println("Enter Row"+(i+1)+":");
            for(int j=0;j<C;j++)
            {
                A[i][j]=sc.nextInt();
                if(j==C-1)
                break;
            }
        }
        for(int i=0;i<R;i++){
        for(int j=0;j<R;j++){
            System.out.print(" "+A[j][i]);
        } System.out.println();
        }
        
        int index=0;
        for(int j=0;j<(R*C);j++)
        
        {
            int m=0;
            for(int i=0;i<R;i++){
                if(A[i][C-1]>=m){
                    m=A[i][C-1];
                    index=i;
                }
            }
            for(int k=C-1;k>0;k--){
                A[index][k]=A[index][k-1];
            }
            A[index][0]=-1;
            System.out.print(" "+m);
        }
        }
    
}