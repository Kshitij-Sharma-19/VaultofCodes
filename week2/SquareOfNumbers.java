import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SquareOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        System.out.print("Enter the number of elements: ");
        int count = scanner.nextInt();
        System.out.println("Enter the elements:");

        for (int i = 0; i < count; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            int num = scanner.nextInt();
            numbers.add(num);
        }

        scanner.close();
        System.out.println("Original Numbers: " + numbers);

        System.out.println("Squares:");

        for (int num : numbers) {
            int square = num * num;
            System.out.println(square);
        }
    }
}
