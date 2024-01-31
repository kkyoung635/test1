package exsample;

import java.util.Scanner;

public class Ex14 {
  public static void main(String[] args) {
    // while + true + if + break 참일 경우 무한반복 하돼 ~ 이면 그만
    Scanner scanner = new Scanner(System.in);
    // 이름 입력, 나이
    // 이름 x 이면 종료
    String name = "";
    int age = 0;
    // 무한루프
    while (true) {
      System.out.print("나이 : ");
      age = scanner.nextInt();
      System.out.print("이름 입력 : 종료(x) ");
      scanner.nextLine(); // 버퍼의 엔터 처리
      name = scanner.nextLine();
      // 엔터키가 입력되면 지금가지 입력한 모든 내용을 읽는다.
      // 버퍼에 남아있는 엔터키가 들어간다
      if (name.equals("x")) {
        System.out.println("프로그램 종료");
        break;
      }
      System.out.println("이름 : " +name+" 나이 : " + age);

    }
  }
}
/*
package exsample;

import java.util.Scanner;

public class Ex14 {
  public static void main(String[] args) {
    // while + true + if + break 참일 경우 무한반복 하돼 ~ 이면 그만
    Scanner scanner = new Scanner(System.in);
    // 이름 입력, 나이
    // 이름 x 이면 종료
    int num1 = 0, num2 = 0, sum = 0;
    while (true) {
      System.out.print("정수1 : ");
      num1 = scanner.nextInt();
      System.out.print("정수2 : ");
      num2 = scanner.nextInt();

      if (num1 == 0 || num2 == 0) {
        System.out.println("종료");
        break;
      }
      sum = num1 + num2;
      System.out.println("두수의합 : " + sum);
      System.out.println("------------------");
    } // end while
  }
}
*/