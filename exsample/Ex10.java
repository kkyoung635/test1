package exsample;

import java.util.Scanner;

/*
문제5)

문제4의 학점 변수를 선언하고
출력은 마지막에 한번만
*/
public class Ex10 {
  public static void main(String[] args) {
    int score = 0;
    Scanner scanner = new Scanner(System.in);

    System.out.print("학점을 입력하세요 : ");
    score = scanner.nextInt();

    if (score >= 90) {
      System.out.print(score + "점 이상 학점은 A입니다.");
    } else if (score >= 80) {
      System.out.print(score + "점 이상 학점은 B입니다.");
    } else if (score >= 70) {
      System.out.print(score + "점 이상 학점은 C입니다.");
    } else if (score >= 60) {
      System.out.print(score + "점 이상 학점은 D입니다.");
    } else {
      System.out.print("그외 학점은 F입니다.");
    }
  }
}
