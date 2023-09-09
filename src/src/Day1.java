import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\kenny\\programming\\java_aoc\\inputs\\day1.txt");
        Scanner scanner = new Scanner(file);
        int maxNumber = 0;
        int currentMax = 0;

        while (scanner.hasNextLine()) {
            String number = scanner.nextLine();
            if (!number.isEmpty()) {
                int currentNumber = Integer.parseInt(number);
                currentMax += currentNumber;
            } else {
                if (currentMax > maxNumber) {
                    maxNumber = currentMax;
                }
                currentMax = 0;
            }
        }
        System.out.println("MAX NUMBER: " + maxNumber);
    }
}