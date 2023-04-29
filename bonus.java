import java.util.*;
class bonus
{
public static void main(String[] args)
{
Scanner input=new Scanner(System.in);
int s,fp;
double b=0;
System.out.println("enter the grade of the employee:");
char g=input.next().charAt(0);
System.out.println("enter the salary of the employee:");
s=input.nextInt();
if(g=='A')
{
b=s*0.05;
if(s<10000)
{
b=b+(s*0.02);
System.out.println("bonus="+b);
System.out.println("final payment="+(s+b));
}
else
{
System.out.println("bonus="+b);
System.out.println("final payment="+(s+b));
}
}
else if(g=='B')
{
b=s*0.10;
if(s<10000)
{
b=b+(b*0.02);
System.out.println("bonus="+b);
System.out.println("final payment="+(s+b));
}
}
else
{
System.out.println("invalid grade:");
}
}
}


