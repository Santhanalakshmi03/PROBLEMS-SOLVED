import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
     int n,c=1,i,j;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter no:");
     n=sc.nextInt();
     for(i=0;i<n;i++)
     {
         for(int s=i;s<=n;s++)
            {
                System.out.print(" ");
            }
         for(j=0;j<=i;j++){
             if(j==0 || i==0)
             
                 c=1;
             
             else
                 c=c*(i-j+1)/j;
                 System.out.print(c+" ");
             
         }System.out.println();
     }
     
    }
}
