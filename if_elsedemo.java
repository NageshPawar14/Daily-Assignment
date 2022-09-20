
//WAP to accept age fro user and check eligble for voting or not
import java.util.*;

public class if_elsedemo {
    public static void main(String args[]) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age :");
        age = sc.nextInt();
        if (age >= 18) {
            System.out.println("Your are Eligble for voting");
        } else {
            System.out.println("Your are not Eligble for voting");
        }

    }

}
