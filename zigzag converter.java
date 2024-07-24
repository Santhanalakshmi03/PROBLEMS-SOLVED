import java.util.Scanner;
public class Prg5 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String : ");
		String s="PAYPALISHIRING";
		int numrows=3;
		int len=s.length();
		char output[]=new char[len];
		int cyclelen=2*numrows-2;
		int index=0;
 
		for(int i=0;i<numrows;i++)
		{
			for(int j=0;j+i<len;j+=cyclelen)
			{
				output[index++]=s.charAt(j+i);
				if(i!=0 && i!= numrows-1 && j+cyclelen-i<len)
				{
					output[index++]=s.charAt(j+cyclelen-i);
				}
			}
		}
		System.out.println(new String(output));
	}
}
 