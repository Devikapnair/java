import java.io.*;
import java.util.Scanner;
class fact
{
public static void main(String args[])
{

Scanner sc=new Scanner(System.in);
System.out.println("enter no");
int n=sc.nextInt();
int fact=2;

for(int k=1;k<=n;k++)
{

fact=fact*k;
k=k+1;
}

System.out.println("factorial is"+fact);
}
}

