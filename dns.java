import java.net.*;
import java.io.*;
import java.util.*;
public class dns {
    
    public static void main(String[] args) 
        {
        int n;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        do
        {
        System.out.println("\n Menu: \n 1. DNS 2. Reverse DNS 3. Exit \n");
        System.out.println("\n Enter your choice");
        n = Integer.parseInt(System.console().readLine()); 
        if(n==1)
        {
        try 
        {
        System.out.println("\n Enter Host Name ");
        String hname=in.readLine();
        InetAddress address;
        address = InetAddress.getByName(hname);
        System.out.println("Host Name: " + address.getHostName());
        System.out.println("IP: " + address.getHostAddress());
        } 
        catch(IOException ioe) 
        {
        ioe.printStackTrace();
        }
        }
        if(n==2)
        {
        try 
        {
        System.out.println("\n Enter IP address");
        String ipstr = in.readLine();
        InetAddress ia = InetAddress.getByName(ipstr);
        System.out.println("IP: "+ipstr);
        System.out.println("Host Name: " +ia.getHostName());
        } 
        catch(IOException ioe) 
        {
        ioe.printStackTrace();
        }
        }

        }while(!(n==3));
        }
}
/*OUTPUT:
Menu: 
1. DNS 2. Reverse DNS 3. Exit 
Enter your choice
1
Enter Host Name 
www.google.com
Host Name: www.google.com
IP: 209.85.145.106
Menu: 
1. DNS 2. Reverse DNS 3. Exit 
Enter your choice
2
Enter IP address
209.85.145.106
IP: 209.85.145.106
Host Name: jd-in-f106.1e100.net
Menu: 
1. DNS 2. Reverse DNS 3. Exit
*/

