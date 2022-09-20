
//WAP to accept a no. from user and display a square if no is divisible by 5.
import java.util.*;

class ifdemo {
    public static void main(String args[]) {
        int num1, res;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        num1 = sc.nextInt();
        if (num1 % 5 == 0) {
            res = num1 * num1;
            System.out.println("The result is =" + res);
        }
    }
}