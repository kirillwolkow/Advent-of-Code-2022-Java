import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\kenny\\programming\\java_aoc\\inputs\\day1.txt");
        Scanner scanner = new Scanner(file);
        int maxNumber = 0;
        int currentMax = 0;
        List<Integer> calorieList = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String number = scanner.nextLine();
            if (!number.isEmpty()) {
                int currentNumber = Integer.parseInt(number);
                currentMax += currentNumber;
                calorieList.add(currentMax);
            } else {
                if (currentMax > maxNumber) {
                    maxNumber = currentMax;
                }
                currentMax = 0;
            }
        }
        System.out.println("MAX NUMBER: " + maxNumber);
        calorieList.sort(Collections.reverseOrder());
        System.out.println("SUM TOP 3 ELVES: " + (calorieList.get(0) + calorieList.get(1) + calorieList.get(2)));
    }
}