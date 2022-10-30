import java.util.*;
class simplecalculation{
    public static void main(String arg[]){
        Scanner ob = new Scanner(System.in);
        int num1,num2 = 0;
        char operator;
        double answer = 0.0;
        System.out.println("Please enter first number:");
        num1 = ob.nextInt();
        System.out.println("Please enter second number:");
        num2 = ob.nextInt();
        System.out.println("which operator you want to use ?");
        operator = ob.next().charAt(0);
        switch (operator) {
            case '+': answer = num1 + num2;
                break;
            case '-': answer = num1 - num2;
                break;
            case '*': answer = num1 * num2;
                break;
            case '/': answer = num1 / num2;
                break;    
            default:
                break;
        } 
        System.out.println(num1+" "+operator+" "+num2+" = "+answer);
    }
}