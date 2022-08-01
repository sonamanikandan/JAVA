import java.util.*;
class Shape
{
int l,b,s;
double r,ba,h;
double area;
void area(int length,int breadth)
{
l=length;
b=breadth;
System.out.println("Area of Rectangle: "+l*b);
}
void area(int side)
{
s=side;
System.out.println("Area of Square: "+s*s);
}
void area(double radius)
{
r=radius;
area=3.14*r*r;
System.out.println("Area of Circle: "+area);
}
void area(double base,double height)
{
ba=base;
h=height;
area=0.5*ba*h;
System.out.println("Area of Triangle: "+area);
}}
class Overload
{
public static void main(String args[])
{
int ch,l,b,s;
double r,ba,h;
Shape obj=new Shape();
System.out.println("Area of different shapes!!!");
System.out.println("1.Rectangle\n2.Square\n3.Circle\n4.Triangle\n5.Exit");
while(true)
{
System.out.println("Enter your choice:");
Scanner sc=new Scanner(System.in);
ch=sc.nextInt();
switch(ch)
{
case 1:System.out.println("Enter length of Rectangle:");
l=sc.nextInt();
System.out.println("Enter breadth of Rectangle:");
b=sc.nextInt();
obj.area(l,b);
break;
case 2:System.out.println("Enter side of Square:");
s=sc.nextInt();
obj.area(s);
break;
case 3:System.out.println("Enter radius of Circle:");
r=sc.nextDouble();
obj.area(r);
break;
case 4:System.out.println("Enter base of Triangle:");
ba=sc.nextDouble();
System.out.println("Enter height of Triangle:");
h=sc.nextDouble();
obj.area(ba,h);
break;
case 5:System.exit(0);
break;
default:System.out.println("Invalid choice");
}}}}
