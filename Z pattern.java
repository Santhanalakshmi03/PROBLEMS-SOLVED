import java.util.*;
class HelloWorld
{
    public static void main(String[] args)
    {
        int n,i,j;
       
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
       
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                if(i==1 || i+j==n+1 || i==n){
               
               
                System.out.print(" * ");
                }
                else{
                     System.out.print("   ");
                }
            }System.out.println();
        }
    }
}