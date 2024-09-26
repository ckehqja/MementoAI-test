import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    int x, n;

    Scanner scanner = new Scanner(System.in);
    System.out.println("증가할 숫자 입력");
    x = scanner.nextInt();
    System.out.println("증가할 횟수");
    n = scanner.nextInt();

    int[] answer = new int[n];

    for (int i = 1; 0 < n--; i++) {
      answer[i - 1] = x * i;
    }

    System.out.println(Arrays.toString(answer));
  }
}
