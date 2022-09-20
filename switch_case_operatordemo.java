
//Accept choice from user and according display the output 1.unry oprater 2,ternary operator 3. birany operator.
import java.util.*;

public class switch_case_operatordemo {
    public static void main(String args[]) {
        int ch, op, num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter opretor :1.Unry oprater 2.Ternary operator 3.Athmatic operator.");
        ch = sc.nextInt();

        switch (ch) {
            case 1:
                System.out.println(
                        "Enter opration : 1.Unary Plus 2.Unary Minus 3.Increment Operator 4.Decrement Operator ");
                op = sc.nextInt();
                switch (op) {
                    case 1:
                        System.out.println("Enter number");
                        num1 = sc.nextInt();
                        System.out.println("Your number" + num1);
                        break;
                    case 2:
                        System.out.println("Enter number");
                        num1 = sc.nextInt();
                        num1 = -num1;
                        System.out.println("Your number" + num1);
                        break;
                    case 3:
                        System.out.println("Enter number");
                        num1 = sc.nextInt();
                        num1++;
                        System.out.println("Your number" + num1);
                        break;
                    case 4:
                        System.out.println("Enter number");
                        num1 = sc.nextInt();
                        num1--;
                        System.out.println("Your number" + num1);
                        break;
                    default: {
                        System.out.println("Wrong choice");
                    }
                }
                break;
            case 2:
                System.out.println("Enter Number1 And Number2");
                num1 = sc.nextInt();
                num2 = sc.nextInt();
                int max = (num1 > num2) ? num1 : num2;
                System.out.println("The result is" + max + "is greater number");
                break;

            case 3:
                System.out.println("Enter opration : 1.Addition 2.Subtraction 3.Multiplication 4.Division ");
                op = sc.nextInt();
                switch (op) {
                    case 1:
                        System.out.println("Enter Number1 And Number2");
                        num1 = sc.nextInt();
                        num2 = sc.nextInt();
                        int res = num1 + num2;
                        System.out.println("The result is:" + res);
                        break;
                    case 2:
                        System.out.println("Enter Number1 And Number2");
                        num1 = sc.nextInt();
                        num2 = sc.nextInt();
                        res = num1 - num2;
                        System.out.println("The result is:" + res);
                        break;
                    case 3:
                        System.out.println("Enter Number1 And Number2");
                        num1 = sc.nextInt();
                        num2 = sc.nextInt();
                        res = num1 * num2;
                        System.out.println("The result is:" + res);
                        break;
                    case 4:
                        System.out.println("Enter Number1 And Number2");
                        num1 = sc.nextInt();
                        num2 = sc.nextInt();
                        int result = num1 / num2;
                        System.out.println("The result is:" + result);
                    default: {
                        System.out.println("Wrong choice");
                    }

                }

        }
    }
}