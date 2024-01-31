package exsample;

import java.util.Scanner;

/*
문제4)

score : 점수

90점 이상 학점은 A입니다.
80점 이상 학점은 B입니다.
70점 이상 학점은 C입니다.
60점 이상 학점은 D입니다.

그외
학점은 F입니다.
*/

//sout 여러번 쓰지 않고 간단하게 코드 정리하기
public class Ex9 {
  public static void main(String[] args) {
    int score = 0;
    String hak = "";
    Scanner scanner = new Scanner(System.in);

    System.out.print("학점을 입력하세요 : ");
    score = scanner.nextInt();

    if (score >= 90) {
      hak = "A";
    } else if (score >= 80) {
      hak = "B";
    } else if (score >= 70) {
      hak = "C";
    } else if (score >= 60) {
      hak = "D";
    } else {
      hak = "F";
    }
    System.out.println(score + "점 학점은 " + hak+"입니다.");
  }
}


/* sout 각각 쓰는 경우
public class Ex9 {
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
*/