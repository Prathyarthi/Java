import java.util.*;
public class Income_Tax{
    public static void main(String args[]){
        int salary,income_tax;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the salary : ");
        salary = sc.nextInt();

        if(salary<500000){
            income_tax = 0;
        }
        else if(salary>=500000 && salary<1000000){
            income_tax = (int) (salary * 0.2);
        }
        else{
            income_tax = (int) (salary * 0.3);
        }
        System.out.println("Your tax is : " + income_tax);
    }
}

