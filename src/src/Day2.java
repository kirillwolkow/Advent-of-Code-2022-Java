import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Day2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\kenny\\programming\\java_aoc\\inputs\\day2.txt");
        Scanner scanner = new Scanner(file);
        int totalScore = 0;
        int calculatedResultScore = 0;

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            char opponent = line.charAt(0);
            char choice = line.charAt(2);
            totalScore += calculateScore(opponent, choice);
            calculatedResultScore += calculateResultScore(opponent, choice);
        }
        System.out.println("Total Score: " + totalScore);
        System.out.println("Calculated Score: " + calculatedResultScore);
    }

    private static int calculateScore(char opponent, char choice) {
        int score = 0;

        if (opponent == 'A' && choice == 'X' || opponent == 'B' && choice == 'Y' || opponent == 'C' && choice == 'Z') {
            score += 3;
        } else if (opponent == 'A' && choice == 'Y' || opponent == 'B' && choice == 'Z' || opponent == 'C' && choice == 'X') {
            score += 6;
        }

        if (choice == 'X') {
            score += 1;
        } else if (choice == 'Y') {
            score += 2;
        } else if (choice == 'Z') {
            score += 3;
        }

        return score;
    }

    private static int calculateResultScore(char opponent, char choice) {
        int score = 0;

        if (opponent == 'A' && choice == 'Y' || opponent == 'B' && choice == 'Y' || opponent == 'C' && choice == 'Y') {
            score += 3;
        } else if (opponent == 'A' && choice == 'Z' || opponent == 'B' && choice == 'Z' || opponent == 'C' && choice == 'Z') {
            score += 6;
        }

        if (opponent == 'A' && choice == 'Y' || opponent == 'B' && choice == 'X' || opponent == 'C' && choice == 'Z') {
            score += 1;
        } else if (opponent == 'A' && choice == 'Z' || opponent == 'B' && choice == 'Y' || opponent == 'C' && choice == 'X') {
            score += 2;
        } else {
            score += 3;
        }

        return score;
    }
}
