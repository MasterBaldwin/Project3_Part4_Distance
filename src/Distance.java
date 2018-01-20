import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner inputStream = new Scanner(System.in);
        double x1, x2, y1, y2;

        System.out.print("Enter x1 and y1: ");
        x1 = inputStream.nextDouble();
        y1 = inputStream.nextDouble();
        System.out.print("Enter x2 and y2: ");
        x2 = inputStream.nextDouble();
        y2 = inputStream.nextDouble();

        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println(distance);
    }
}
