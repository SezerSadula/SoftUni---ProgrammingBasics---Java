package Exams.ProgrammingBasicsExamJuly17;

import java.util.Scanner;

/**
 * https://judge.softuni.bg/Contests/Practice/Index/233#5
 */
public class Ex06StopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numSmall = Integer.parseInt(scanner.nextLine());
        int numBig = Integer.parseInt(scanner.nextLine());
        int stopNum = Integer.parseInt(scanner.nextLine());

        for (int i = numBig; i >= numSmall; i--) {
            if ((i % 2 == 0) && (i % 3 == 0)) {
                if (i == stopNum) {
                    break;
                } else {
                    System.out.printf("%d ", i);
                }
            }
        }
    }
}
