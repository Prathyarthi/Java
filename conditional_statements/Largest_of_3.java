import java.util.*;
public class Largest_of_3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter a value : ");
        a = sc.nextInt();
        System.out.println("Enter b value : ");
        b = sc.nextInt();
        System.out.println("Enter c value : ");
        c = sc.nextInt();

        if(a>=b && a>=c){
            System.out.println("A is larger");
        }
        else if(b>=c){
            System.out.println("B is larger");
        }
        else{
            System.out.println("C is larger");
        }
    }
}