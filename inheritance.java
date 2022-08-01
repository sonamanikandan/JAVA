import java.util.*;
class Person
{
String Name,Gender,Address;
int Age;
Person(String name,String gender,String address,int age)
{
Name=name;
Gender=gender;
Address=address;
Age=age;
}}
class Employee extends Person
{
int Empid;
String Comp_name,Quali;
double Salary;
Employee(String name,String gender,String address,int age,int empid,String 
comp_name,String quali,double salary)
{
super(name,gender,address,age);
Empid=empid;
Comp_name=comp_name;
Quali=quali;
Salary=salary;
}}
class Teacher extends Employee
{
int Tid;
String Subject,Dept;
Teacher(String name,String gender,String address,int age,int empid,String 
comp_name,String quali,double salary,int tid,String subject,String dept)
{
super(name,gender,address,age,empid,comp_name,quali,salary);
Tid=tid;
Subject=subject;
Dept=dept;
}
void display()
{
System.out.println("Details of Teacher");
System.out.println("..................");
System.out.println("Name: "+Name);
System.out.println("Gender: "+Gender);
System.out.println("Address: "+Address);
System.out.println("Age: "+Age);
System.out.println("Employee id: "+Empid);
System.out.println("Company Name: "+Comp_name);
System.out.println("Qualification: "+Quali);
System.out.println("Salary: "+Salary);
System.out.println("Teacher id: "+Tid);
System.out.println("Subject: "+Subject);
System.out.println("Department: "+Dept);
System.out.println("\n");
} }
class Pmain{
public static void main(String[] args)
{
String name,gender,address,comp_name,quali,subject,dept;
int salary,age,empid,tid,n,i,c;
Scanner s=new Scanner(System.in);
System.out.println("Enter the limit:");
n=s.nextInt();
Teacher obj[]=new Teacher[n];
for(i=0;i<n;i++)
{
c=i+1;
System.out.println("Enter the details of teacher "+c);
System.out.println("Enter name:");
name=s.next();
System.out.println("Enter gender:");
gender=s.next();
System.out.println("Enter address:");
address=s.next();
System.out.println("Enter age:");
age=s.nextInt();
System.out.println("Enter employee id:");
empid=s.nextInt();
System.out.println("Enter company Name:");
comp_name=s.next();
System.out.println("Enter qualification:");
quali=s.next();
System.out.println("Enter salary:");
salary=s.nextInt();
System.out.println("Enter Teacherid:");
tid=s.nextInt();
System.out.println("Enter subject:");
subject=s.next();
System.out.println("Enter department: ");
dept=s.next();
obj[i]=new 
Teacher(name,gender,address,age,empid,comp_name,quali,salary,tid,subject,dept);
}
for(i=0;i<n;i++)
{
obj[i].display();
}}}
