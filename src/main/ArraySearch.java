import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        
        System.out.print("Enter the number you want to search: ");
        int target = scanner.nextInt();
        
        boolean found = false;
        
        for (int number : numbers) {
            if (number == target) {
                found = true;
                break;
            }
        }
        
        if (found) {
            System.out.println(target + " is found in the array.");
        } else {
            System.out.println(target + " is not found in the array.");
        }

        scanner.close();
    }
}
