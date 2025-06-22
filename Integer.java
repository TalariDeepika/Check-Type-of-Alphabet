import java.util.Scanner;

public class Integer{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long A = sc.nextLong();
        long B = sc.nextLong();
        
        long product = A * B;
        
        // int range: -2^31 to 2^31 - 1
        if (product >= Integer.MIN_VALUE && product <= Integer.MAX_VALUE) {
            System.out.println((int)product);
        } else {
            System.out.println(-1);
        }
    }
}