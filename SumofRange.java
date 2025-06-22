import java.io.*;
import java.util.*;
public class SumofRange{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int L = in.nextInt();
        int R = in.nextInt();
        
        long sum = (long)(R - L + 1) * (L + R) / 2;
   
        System.out.println(sum);
    }
}