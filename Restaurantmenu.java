import java.util.*;
class Restaurantmenu {
    public static void main(String[]args) {
        while (true){
        Scanner sc = new Scanner(System.in);
        int menuitem;
        String order;
        System.out.println("\t\t\t\t Q&S Restaurant");
        System.out.println("-------Menu-------");
        System.out.println("\n");
        System.out.println("\t 1.Biryani");
        System.out.println("\t 2.Korma");
        System.out.println("\t 3.Fries");
        System.out.println("\t 4.Broast");
        System.out.println("\t 5.Zinger");
        System.out.println("\t 6.Colddrink");
        System.out.println("\t 7.Coffee");
        System.out.println("Select menu from (1-7) for price of menu");
        menuitem = sc.nextInt();
        switch (menuitem){
            case 1: {
                order = "\t 1.Biryani";
                System.out.println("Biryani = 120 Rs");
            }
            break;
            case 2: {
                order = "\t 2.Korma";
                System.out.println("Korma = 300 Rs");
            }
            break;
            case 3: {
                order = "\t 3.Fries";
                System.out.println("Fries = 80 Rs");
            }
            break;
            case 4: {
                order = "\t 4.Broast";
                System.out.println("Broast = 370 Rs");
            }
            break;
            case 5: {
                order = "\t 5.Zinger";
                System.out.println("Zinger = 250 Rs");
            }
            break;
            case 6: {
                order = "\t 6.Colddrink";
                System.out.println("Colddrink = 70 Rs");
            }
            break;
            case 7: {
                order = "\t 7.Coffee";
                System.out.println("Coffee = 100 Rs");
            }
            break;
            case 0:
            {
                System.out.println("exit");
            }
            break;
            default:{
            order = "\tnot in menu";
            System.out.println("\t you selected the item which is not in our menu:");
            
        }
        }
            System.out.println("thanks for coming:");
    }
    }
}