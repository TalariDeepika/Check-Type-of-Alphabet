import java.io.*;
import java.util.*;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int u=in.nextInt();
        int total=0;
        if(u<=100){
            total=u*6;
        }
        if(u>100 && u<=200){
          total=100*6+(u-100)*8;
        }
        if(u>200 && u<=300){
            total=100*6+100*8+(u-200)*10;
    }
        if(u>300 && u<=400){
            total=100*6+100*8+100*10+(u-300)*12;
}
        if(u>400){
            total=100*6+100*8+100*10+100*12+(u-400)*14;
}
        System.out.println(total);
    }
}