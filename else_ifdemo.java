
//WAP to accept age fro user and check eligble for voting or not
import java.util.*;

public class else_ifdemo {

    public static void main(String args[]) {
        int num1, num2, num3, num4, num5;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num1:");
        num1 = sc.nextInt();
        System.out.println("Enter a num2:");
        num2 = sc.nextInt();
        System.out.println("Enter a num3:");
        num3 = sc.nextInt();
        System.out.println("Enter a num4:");
        num4 = sc.nextInt();
        System.out.println("Enter a num5:");
        num5 = sc.nextInt();
        if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5) {
            System.out.println("Num1 is greater");
        } else if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5) {
            System.out.println("Num2 is greater");
        } else if (num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5) {
            System.out.println("Num3 is greater");
        } else if (num4 > num1 && num4 > num3 && num4 > num3 && num4 > num5) {
            System.out.println("Num4 is greater");
        } else {
            System.out.println("Num5 is greater");
        }
    }
}
