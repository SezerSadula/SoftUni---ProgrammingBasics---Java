package L06DrawingFiguresWithLoops;

import java.util.Scanner;

/**
 * Created by Martin on 2/25/2017.
 */
public class Pr06RhombusOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int spaces = n;

        for (int i = 0; i < n * 2 - 1; i++) {
            if (i < n) {
                spaces--;
            } else {
                spaces++;
            }

            System.out.println(repeatStr(" ", spaces) + repeatStr("* ", n - spaces));
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
