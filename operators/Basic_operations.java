public class Basic_operations{
    public static void main(String args[]){
        int a = 10;
        int b = 5;
        // Binary operators : 
        System.out.println("Sum of a and b is : " + (a+b));
        System.out.println("Difference of a and b is : " + (a-b));
        System.out.println("Product of a and b is : " + (a*b));
        System.out.println("Division of a and b is : " + (a/b));
        System.out.println("Modulo of a and b is : " + (a%b));

        // Unary operators : 
        int c = 5;
        int d = ++5;           // Change and use
        System.out.println(c)
        System.out.println(d)

        int e = 5;
        int f = 5++;        // Use and change
        System.out.println(e)
        System.out.println(f)
    }
}