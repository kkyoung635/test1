package loopcon;

import java.util.Scanner;

/*
2단 :
2x1 = 2,
2x2 = 4

.. 1~9 연속되므로 for문
*/
public class For7 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // dan, result
    // 단 키보드 입력 받기
    int dan = 0, result = 0;

    System.out.print("원하는 구구단 숫자 입력 : ");
    dan = scanner.nextInt();

    for (int i = 1; i <=9; i++) {
      result = dan * i;
      System.out.println(dan + " x " + i + " = " + result);
    }
  }
}
