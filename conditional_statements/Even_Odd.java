import java.util.*;
public class Even_Odd{
    public static void main(String args[]){
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        num = sc.nextInt();

        if(num%2 == 0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }
    }
}