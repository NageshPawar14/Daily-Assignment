
//Accept chacter from user and find out the greatest.
import java.util.*;

public class switch_casedemo {
    public static void main(String args[]) {
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Character :");
        ch = sc.next().charAt(0);
        char z = Character.toLowerCase(ch);
        switch (z) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("It is a vowel ");
                break;
            default:
                System.out.println("It is Not a vowel");
        }
    }
}
