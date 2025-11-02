import java.util.Scanner;

class AreaCalculator {

    // Method to calculate area of circle
    double calculateArea(double radius) {
        return 3.14159 * radius * radius;
    }

    // Method to calculate area of square
    double calculateArea(int side) {
        return side * side;
    }

    // Method to calculate area of rectangle
    double calculateArea(int length, int width) {
        return length * width;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AreaCalculator obj = new AreaCalculator();

        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();
        System.out.println("Area of Circle = " + obj.calculateArea(radius));

        System.out.print("Enter side of square: ");
        int side = sc.nextInt();
        System.out.println("Area of Square = " + obj.calculateArea(side));

        System.out.print("Enter length of rectangle: ");
        int length = sc.nextInt();
        System.out.print("Enter width of rectangle: ");
        int width = sc.nextInt();
        System.out.println("Area of Rectangle = " + obj.calculateArea(length, width));

        sc.close();
    }
}


