import java.io.*;
import java.util.Scanner;
class Symmetry
{
 public static void main(String args[])throws IOException
 { 
  int x,y;
  int flag =0;  
  Scanner ad = new Scanner(System.in);
  System.out.print("\n Enter the number of Rows: "); 
  x=ad.nextInt();
  System.out.print("\n Enter the number of Columns: "); 
  y=ad.nextInt();
  int a[][] = new int[x][y];
  if(x==y)
   {
    System.out.println("\n Enter the matrix element");
    for(int i = 0;i<x;i++)
      {
        for(int j =0; j<y; j++)
        {
         System.out.print("\n Enter element "+(i+1)+""+(j+1)+" : "  );
         a[i][j]=ad.nextInt();
         
        }  
      }
      for(int i = 0;i<x;i++)
      {
        for(int j =0; j<y; j++)
        {
         if(a[i][j]!=a[j][i])
         { System.out.print("\n\n NOT SYMMETRY");
           flag =1;
           System.exit(0);
          }
         
        }  
      }
   if(flag==0)
    System.out.print("\n THE GIVEN MATRIX IS SYMMETRIC");
     
   }
  else
  {
   System.out.print("\n NOT A SQUARE MATRIX");
  } 
  
 }
}