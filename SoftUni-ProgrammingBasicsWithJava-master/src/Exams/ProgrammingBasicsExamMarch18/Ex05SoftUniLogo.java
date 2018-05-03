package Exams.ProgrammingBasicsExamMarch18;

import java.util.Scanner;

/**
 * https://judge.softuni.bg/Contests/Practice/Index/480#4
 */
public class Ex05SoftUniLogo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int width = 12 * n - 5;
        int height = 4 * n - 2;
        int dashes = 1;
        for (int i = 0; i < 2 * n; i++) {
            int SideDotsCount = (width - dashes) / 2;
            String SideDots = repeatStr(".", SideDotsCount);
            String centerDashes = repeatStr("#", dashes);
            System.out.println(SideDots + centerDashes + SideDots);
            dashes += 6;
        }

        dashes -= 6;
        for (int i = 0; i < height - 2 * n; i++) {
            if (i < height - 2 * n - 1) {
                System.out.print("|");
            } else {
                System.out.print("@");
            }
            if (i <= n - 2) {
                dashes -= 6;
            }
            int leftSideDotsCount = (width - dashes) / 2 - 1;
            int rightSideDotsCount = (width - dashes) / 2;

            String leftSideDots = repeatStr(".", leftSideDotsCount);
            String rightSideDots = repeatStr(".", rightSideDotsCount);
            String centerDashes = repeatStr("#", dashes);
            System.out.println(leftSideDots + centerDashes + rightSideDots);
        }
    }

    private static String repeatStr(String strToRepeat, int count) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append(strToRepeat);
        }

        return sb.toString();
    }
}
