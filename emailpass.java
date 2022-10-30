import java .util.*;
class emailpass{
    public static void main(String[]args) {
        String[][] twodarray = new String[5][2];
        System.out.println("Please enter the Emails and Passwords:");
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<5; i++) {
            for (int j=0; j<2; j++) {
                if (j==0){
                System.out.println("Enter an Email:");
                String str = sc.nextLine();
                twodarray[i][j] = str;    
                }
                else{
                    System.out.println("Enter the Password:");
                    String str = sc.nextLine();
                    twodarray[i][j] = str;
                }
            }
            System.out.println();
        }
            System.out.println("You Entered the emails and passwords are:");
            for (int i=0; i<5; i++) {
                for (int j=0; j<2; j++) {
                 if (j==0) {
                 System.out.println("Email:"+ twodarray[i][j]);
                 }
                 else {
                    System.out.println("Password "+ twodarray[i][j]);
                 }
                }
            }
            System.out.println();
        }
    }