import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double first, second, third, u, area;
        Scanner input = new Scanner(System.in);
        System.out.print("First side length: ");
        first = input.nextDouble();
        if (first<=0) {
            System.out.println("Side length should be more than zero");
            System.out.print("First side length: ");
            first = input.nextDouble();
        }
        System.out.print("Second side length: ");
        second = input.nextDouble();
        if (second<=0) {
            System.out.println("Side length should be more than zero");
            System.out.print("Second side length: ");
            second = input.nextDouble();
        }
        System.out.print("Third side length: ");
        third = input.nextDouble();
        if (third<=0) {
            System.out.println("Side length should be more than zero");
            System.out.print("Third side length: ");
            third = input.nextDouble();
        }

        u = (first + second + third) / 2;
        area = Math.sqrt(u*(u-first)*(u-second)*(u-third));
        System.out.println("Area = " + area);

    }
}
