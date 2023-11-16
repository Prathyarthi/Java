import java.util.*;
public class Calculator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a,b;
        char operator;

        System.out.println("Enter a value : ");
        a = sc.nextInt();
        System.out.println("Enter b value : ");
        b = sc.nextInt();
        System.out.println("Enter operator : ");
        operator = sc.next().charAt(0);

        switch(operator){
            case '+' : System.out.println(a+b);
                break;
            case '-' : System.out.println(a-b);
                break;
            case '*' : System.out.println(a*b);
                break;
            case '/' : System.out.println(a/b);
                break;
            case '%' : System.out.println(a%b);
                break;
            default:System.out.println("Enter valid operator");
        }
    }
}