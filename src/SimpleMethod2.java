/**
 *
 * @author Trevor Hartman
 * @author Logan Portillo
 *
 * @since Version 1.0
 *
 */

import java.util.Scanner;

public class SimpleMethod2 {
    public static int square (int s) {
        return s * s;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the integer you want squared: ");
        int in = scanner.nextInt();

        int squared = square(in);
        System.out.print("Result: ");
        System.out.println(squared);
    }
}
