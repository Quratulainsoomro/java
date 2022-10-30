import java.util.*;
class fibonacci{
    public static void main(String arg[]) {
        int num = 100;
        int num1 = 0;
        int num2 = 1;
        System.out.println("Fibonacci Series upto"+num+":");
        while (num1 <= num){
            System.out.println(num1+",");
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;

        }
    }
}