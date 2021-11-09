package session1;

/**
 * This program demonstrates the overflow of Double
 * i.e. a double variable can only contain a certain size
 */
public class Program5 {
    public static void main(String[] args) {
        double radius = 6371.0E250;
        double area = radius * radius * 3.14;
        System.out.println("Area is " + area);
    }

}
