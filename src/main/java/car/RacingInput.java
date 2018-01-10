package car;

import java.util.Scanner;

import static car.RacingUtils.REGEX;

public class RacingInput {
    private static Scanner scanner = new Scanner(System.in);

    public static String[] getNames() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        return scanner.nextLine().split(REGEX);
    }

    public static int getTryCount() {
        System.out.println("시도할 회수는 몇 회 인가요?");
        return scanner.nextInt();
    }
}
