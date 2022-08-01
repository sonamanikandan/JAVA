import java.awt.*;
import java.net.*;
import java.awt.event.*;
public class LearnAWT extends Frame
{
TextField tf1,tf2,tf3;
Label l2,l3,l4;
Button b,b1,b2,b3,b4;
LearnAWT()
{
setTitle("Adder");
l2 = new Label("first number");
l2.setBounds(10,50, 125, 40);
tf1 = new TextField();
tf1.setBounds(100, 50, 85, 20);
l3 = new Label("second number");
l3.setBounds(00,100, 125, 40);
tf2 = new TextField();
tf2.setBounds(100, 100, 85, 20);
l4 = new Label("Result");
l4.setBounds(10,150, 125, 40);
tf3 = new TextField();
tf3.setBounds(100, 150, 85, 20);
b=new Button("ADD");
b.setBounds(50,200,50,50);
b1=new Button("SUB");
b1.setBounds(120,200,50,50);
b2=new Button("PRO");
b2.setBounds(190,200,50,50);
b3=new Button("DIV");
b3.setBounds(250,200,50,50);
b4=new Button("EXIT");
b4.setBounds(120,270,50,50);
add(b);

add(tf1);
add(tf2);
add(tf3);
add(l2);
add(l3);
add(l4);
add(b1);
add(b2);
add(b3);
add(b4);
setSize(300,300);
setVisible(true);
b.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e) {
int a = Integer.parseInt(tf1.getText());
int b = Integer.parseInt(tf2.getText());
int c = a + b;
tf3.setText(" " + c);
}
});
b1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e) {
int a = Integer.parseInt(tf1.getText());
int b = Integer.parseInt(tf2.getText());
int d = a-b;
tf3.setText(" " + d);
}
});
b2.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e) {
int a = Integer.parseInt(tf1.getText());
int b = Integer.parseInt(tf2.getText());
int p = a*b;
tf3.setText(" " + p);
}
});
b3.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e) {
int a = Integer.parseInt(tf1.getText());
int b = Integer.parseInt(tf2.getText());

int q = a/b;
tf3.setText(" " + q);
}
});
b4.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e) {
System.exit(0);
}});
}
public static void main(String []args) {
new LearnAWT();
}
}
