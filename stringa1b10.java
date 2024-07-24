import java.util.*;
public class main 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char c[]=s.toCharArray();
        char temp;
        for(int i=0;i<s.length();i++)
        {
            int num=0;
            //System.out.println(" "+c[i]);
            if(!Character.isAlphabetic(c[i])){
                temp=c[i-1];
                for(int k=i;k<s.length();k++){
                    if(!Character.isAlphabetic(c[k]))
                    {
                        //48-asci value is 0
                        //System.out.println((num*10)+" "+c[k]+" "+(c[k]-48)));
                        num=(num*10)+(c[k]-48);
                    }
                    else{
                        i=k;
                        break;
                    }for(int j=1;j<=num;j++){
                        System.out.print(temp);
                    }
                }
         }   }
    }
        
}