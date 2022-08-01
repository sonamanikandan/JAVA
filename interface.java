import java.util.*;
interface Shapes
{
void area();
void perimeter();
}
class Circle implements Shapes
{
public void area()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the radius of circle");
double r=s.nextInt();
double c_area=3.14*r*r;
System.out.println("Area of circle:"+c_area);
}
public void perimeter()
{ Scanner s=new Scanner(System.in);
System.out.println("Enter the radius of circle");
double r=s.nextInt();
double c_perimeter=2*3.14*r;
System.out.println("perimeter of circle:"+c_perimeter);
} }
class Rectangle implements Shapes
{
public void area()
{ Scanner s=new Scanner(System.in);
System.out.println("Enter the length and breadth of rectangle");
int l=s.nextInt();
int b=s.nextInt();
int r_area=l*b;
System.out.println("Area of rectangle is:"+r_area);
}
public void perimeter()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the length and breadth of rectangle");
int l2=s.nextInt();
int b2=s.nextInt();
int r_perimeter=2*(l2+b2);
System.out.println("Perimeter of rectangle is:"+r_perimeter);
} } 
class Mainshapes
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
Circle obj1=new Circle();
Rectangle obj2=new Rectangle();
int j=1;
System.out.println("1. Area of circle\n2. Perimeter of circle\n3. Area of rectangle\n4. 
Perimeter of rectangle\n5. Exit"+"\n");
while(j!=0)
{
int ch;
System.out.println("Enter your choice:");
ch=s.nextInt();
switch(ch)
{
case 1: obj1.area();
break;
case 2: obj1.perimeter();
break;
case 3: obj2.area();
break;
case 4: obj2.perimeter();
break;
case 5: System.exit(0);
default: System.out.println("Invalid choice!!!");
}
} } }
