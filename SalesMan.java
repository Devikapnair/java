import java.util.Scanner;
class SalesMan
{ 
  String sname;
  String scode;
  int samount;
  double commission;
  void readData()
  { 
    Scanner dp=new Scanner(System.in);
    System.out.println("name:");
    sname=dp.nextLine();
    System.out.println("scode:");
    scode=dp.nextLine();
    System.out.println("Amount:");
    samount=dp.nextInt();
  }
  void calculateCommission()
  {
    if (samount < 2000)
     commission=0.08* samount;
    else if (samount<=5000)
      commission=0.10 * samount;
    else if(samount> 5000)
      commission=.12* samount;
  }
 void display()
 {
System.out.println("Salesman code:"+ scode);
   System.out.println("Salesman Name:"+ sname);
   System.out.println("Sales Amount:"+samount);
   System.out.println("Commission:"+commission);
 }
}
class EmployeeClassDemo
{
public static void main(String args[]) 
{
SalesMan s[]=new SalesMan[2];

Scanner dp=new Scanner(System.in);
for(int i=0;i<2;i++)
{
s[i]=new SalesMan();
s[i].readData();
}

for(int i=0;i<2;i++)
{
s[i].calculateCommission();
}
System.out.println("Enter  a salesmancode to search:" );
String code=dp.nextLine();

for(int i=0;i<2;i++)
{
  if (code.equals(s[i].scode))
      s[i].display();
}
}
}