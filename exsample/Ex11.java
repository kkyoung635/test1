package exsample;

import java.util.Scanner;

/*
문제6)
: 달러 환전하기
dollar : 달러입력값
result : 결과 금액
1달러 1300원

달러를 입력하세요 : xx
조건 :
음수 -> 잘못된 금액입니다.
0 -> 환전할 금액이 없습니다.
그외 -> 환전 금액은은 xx원 입니다.
*/
public class Ex11 {
  public static void main(String[] args) {
    int dollar, result = 0;
    Scanner scanner = new Scanner(System.in);

    System.out.print("달러 입력 : ");
    dollar = scanner.nextInt();

    if (dollar < 0) {
      System.out.println("잘못된 금액");
    } else if ( dollar == 0) {
      System.out.println("환전할 금액이 없음");
    } else {
      result = dollar * 1300;
      System.out.println("환전 금액은 " + result + "원 입니다.");
    }
  }
}
/* 내풀이
package exsample;

import java.util.Scanner;

public class Ex11 {
  public static void main(String[] args) {
    int dollar, result = 0;
    Scanner scanner = new Scanner(System.in);

    System.out.print("달러 입력 : ");
    dollar = scanner.nextInt();

    if (dollar > 0) {
      result = dollar * 1300;
      System.out.println("환전 금액은 " + result+"원 입니다.");
    } else if (dollar == 0) {
      System.out.println(" 환절할 금액이 없습니다.");
    } else {
      System.out.println("잘못된 금액입니다.");
    }
  }
}
*/