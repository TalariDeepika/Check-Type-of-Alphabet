import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s=in.nextLine(); 
         for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(ch>='a' && ch<='z'){
            System.out.println("Lowercase Alphabet");
        }
        else if(ch>='A' && ch<='Z'){ 
            System.out.println("Uppercase Alphabet");
        }
        else if(ch>='0' && ch<='9'){
            System.out.println("Number");
        }
        else{
            System.out.println("Special Character");
        }
        
    } 
    }
}