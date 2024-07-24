import java.util.*;
public class Prg6 {

public static void main(String[] args) {

Scanner sc=new Scanner(System.in);

System.out.println("Enter secret No: ");

String secret=sc.next();

System.out.println("Enter guess No: ");

String guess=sc.next();

int bulls=0,cows=0;

int[] secnt=new int[10];

int[] gucnt=new int[10];

for(int i=0;i<secret.length();i++)

{

if(secret.charAt(i)==guess.charAt(i))

{ bulls++;
}
else

{

secnt[secret.charAt(i)-'0']++;

gucnt[guess.charAt(i)-'0']++;

}

}

for(int i=0;i<10;i++)

{

cows+=Math.min(secnt[i],gucnt[i]);

}

System.out.println(bulls +"A" + cows + "B");
}
}