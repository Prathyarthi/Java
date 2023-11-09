import java.util.*;
class Area_of_Circle{
    public static void main(String args[]){
        float radius;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius : ");
        radius = sc.nextFloat();
        float area = 3.14f*radius*radius;
        System.out.println("Area of circle is : " + area);
    }
}