package chakraviyukha;

import java.util.Scanner;

public class chakra {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[][] a=new int[100][100];
		int N,R,C,p=1;
		System.out.print("Enter the number:");
		N=sc.nextInt();
		R=C=N;
		for(int i=0;i<N/2;i++) 
		{
			for(int j=i;j<C;j++) {
				a[i][j]=p;
				p++;
			}
			for(int j=i+1;j<R;j++) {
				a[j][C-1]=p;
				p++;
			}
			for(int j=C-2;j>=i;j--) {
				a[R-1][j]=p;
				p++;
			}
			for(int j=R-2;j>i;j--) {
				a[j][i]=p;
				p++;
			}
			
			
			C-=1;
			R-=1;
		}
		if(N%2==1)
		{
			a[N/2][N/2]=N*N;
		}
		for(int L=0;L<N;L++) {
			for(int K=0;K<N;K++) {
				System.out.print("\t"+a[L][K]);
			}
			System.out.println();
		}
		
	}
	
	
	

}
