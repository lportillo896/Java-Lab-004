/**
 *
 * @author Trevor Hartman
 * @author Logan Portillo
 *
 * @since Version 1.0
 *
 */

import java.util.Scanner;

public class Radians {

    public static double toRadians(double degrees) {
        // Pur your code here
        return degrees * Math.PI/180.0;
    }

    public static double toDegrees(double radians) {
        // Put your code here
        return radians * 180.0/Math.PI;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type degrees you'd like converted to radians: ");
        double degrees = Double.parseDouble(scanner.nextLine());

        // Add System.out, your method call, and Math.toRadians call here
        double rads = toRadians(degrees);
        System.out.println("Degrees to radians equals: "+rads);

        System.out.print("Type radians you'd like converted to degrees: ");
        double radians = Double.parseDouble(scanner.nextLine());

        // Add System.out, your method call, and Math.toDegrees call here
        double degs = toDegrees(radians);
        System.out.println("Radians to degrees equals: "+degs);
    }
}
