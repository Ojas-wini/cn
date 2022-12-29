import java.util.*;
public class sw {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter window size: ");
        int ws=sc.nextInt();
        System.out.print("Enter number of frames to transmit: ");
        int fs=sc.nextInt();
        System.out.print("Enter "+fs+" frames: ");
        int f[]=new int[fs];
        for(int i=0 ; i<fs; i++){
         f[i]=sc.nextInt();
        }
        List<Integer> l=new ArrayList<>();
        for(int i=0; i<fs; i++){
         if(l.size()==ws){
         System.out.println("After sending "+ws+" at each stage sender waits for acknowledgement sent by the receiver");
         System.out.println(l);
         System.out.println("Acknowledgement of above frames sent is received by sender");
         l.clear();
         }
         l.add(f[i]);
         if(i==fs-1){
         System.out.println(l);
         System.out.println("Acknowledgement of above frames sent is received by sender");
         }
        }
        sc.close();
        }
    
}
/*Enter window size: 5
Enter number of frames to transmit: 10
Enter 10 frames: 1 2 3 4 5 6 7 8 9 10
After sending 5 at each stage sender waits for acknowledgement sent by the receiver
[1, 2, 3, 4, 5]
Acknowledgement of above frames sent is received by sender
[6, 7, 8, 9, 10]
Acknowledgement of above frames sent is received by sender */
