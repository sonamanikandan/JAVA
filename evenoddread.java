import java.io.*;
import java.util.*;
public class evenoddread
{
public static void main(String args[]) throws IOException
{int l;
FileInputStream in = null;
FileOutputStream out1=null;
FileOutputStream out2=null;
InputStream input = System.in;
    BufferedWriter bw = new BufferedWriter(new FileWriter("input.txt"));
try
{
in= new FileInputStream("input.txt");
out1= new FileOutputStream("even.txt");
out2= new FileOutputStream("odd.txt");
System.out.println("ENTER THE NUMBERS :");
while ((l = input.read()) != -1)
{
bw.write((char) l);
      bw.flush();
if( l%2==0 )
{
out1.write(l);
}
else
{
out2.write(l);
}
}

}
finally
{
if (in != null)
{
in.close();
}
if(out1 !=null)
{
out1.close();
}
if(out2 !=null)
{
out2.close();
}
if(input !=null)
{
input.close();
}
}
}
}
