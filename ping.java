import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class ping {
    static void commands(ArrayList<String> commandList)
 throws Exception
 {
 // creating the sub process, execute system command
 ProcessBuilder build = new ProcessBuilder(commandList);
 Process process = build.start();
 
 // to read the output
 BufferedReader input = new BufferedReader(new InputStreamReader
 (process.getInputStream()));
 BufferedReader Error = new BufferedReader(new InputStreamReader
 (process.getErrorStream()));
 String s = null;
 
 System.out.println("Standard output: ");
 while((s = input.readLine()) != null)
 {
 System.out.println(s);
 }
 System.out.println("error (if any): ");
 while((s = Error.readLine()) != null)
 {
 System.out.println(s);
 }
 }
 public static void main(String args[]) throws Exception
 {
 // creating list for commands
 ArrayList<String> commandList = new ArrayList<String>();
 
 commandList.add("ping");
 // can be replaced by IP
 commandList.add("www.google.com");
 
 ping.commands(commandList);
 }

    
}
/*OUTPUT:
PING www.google.com (216.58.220.164): 56 data bytes
64 bytes from 216.58.220.164: icmp_seq=0 ttl=53 time=98.803 ms
64 bytes from 216.58.220.164: icmp_seq=1 ttl=53 time=87.856 ms
64 bytes from 216.58.220.164: icmp_seq=2 ttl=53 time=110.600 ms
64 bytes from 216.58.220.164: icmp_seq=3 ttl=53 time=92.897 ms
64 bytes from 216.58.220.164: icmp_seq=4 ttl=53 time=90.142 ms
--- www.google.com ping statistics ---
5 packets transmitted, 5 packets received, 0.0% packet loss
round-trip min/avg/max/stddev = 87.856/96.060/110.600/8.140 m */
