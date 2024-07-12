import java.util.Scanner;

public class ProcessQuestion {
    public static void processQuestion(String question, String answer) {
        Scanner scanner = new Scanner(System.in);

        // 문제 출력
        System.out.println(question);
        System.out.println("정답을 입력하세요: ");

        // 사용자 입력 받기
        String userAnswer = scanner.nextLine().trim();

        // 정답 비교
        if (userAnswer.equalsIgnoreCase(answer)) {
            System.out.println("정답입니다!");
        } else {
            System.out.println("오답입니다. 정답은 " + answer + "입니다.");
        }
    }
}
