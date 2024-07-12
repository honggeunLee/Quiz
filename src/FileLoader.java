import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileLoader {
    static void fileLoad() {
        Scanner scanner = new Scanner(System.in);

        // 사용자에게 퀴즈 파일을 선택하도록 안내
        System.out.println("풀고자 하는 퀴즈 파일을 선택하세요 (1 또는 2 입력):");
        int quizChoice = scanner.nextInt();

        // 선택된 퀴즈 파일 경로 설정
        String fileName;
        if (quizChoice == 1) {
            fileName = "C:\\Users\\USER\\IdeaProjects\\QuizFileLoad\\src\\quiz1.txt";  // 첫 번째 퀴즈 파일 경로
        } else if (quizChoice == 2) {
            fileName = "C:\\Users\\USER\\IdeaProjects\\QuizFileLoad\\src\\quiz2.txt";  // 두 번째 퀴즈 파일 경로
        } else {
            System.out.println("잘못된 입력입니다. 프로그램을 종료합니다.");
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                // 각 줄에서 질문과 정답 추출
                String[] parts = line.split(",");
                String question = parts[0].trim();
                String answer = parts[1].trim();

                // 사용자에게 질문을 출력하고 답변을 처리
                ProcessQuestion.processQuestion(question, answer);
            }
        } catch (IOException e) {
            System.err.println("파일을 읽는 도중 오류가 발생했습니다: " + e.getMessage());
        }
    }
}
