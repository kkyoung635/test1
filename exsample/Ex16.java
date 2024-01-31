package exsample;
/*
문제2)

while , switch

정수 : num1 , num2 , num3 , result
문자열 : op

1. num1 : 정수
2. num2 : 정수
3. result = 계산기 결과
4. num3 = 숫자 0 : 종료 , 1: + , 2:-
5. 1일때 op = "+" , result = num1 + num2

결과
정수1 : 10
정수2 : 20
연산자 선택  : 종료 : 0 , 1:+, 2:-, 3:*, 4:/, 5:%
연산자 번호 :

결과 : 10 - 20 = -10
*/

import java.util.Scanner;

public class Ex16 {
  public static void main(String[] args) {
    int num1, num2, num3, result = 0;
    String op = "";
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.print("정수 1 : ");
      num1 = scanner.nextInt();
      System.out.print("정수 2 : ");
      num2 = scanner.nextInt();
      System.out.println("연산자 선택 : 종료:0 , 1:+, 2:-, 3:*, 4:/, 5:%");
      System.out.print("선택 : ");
      num3 = scanner.nextInt();

      if (num3==0) {
        System.out.println("계산기 프로그램 종료");
        break;
      }// end if
      switch (num3) {
        case 1:
          result = num1 + num2;
          op = "+";
          break;
        case 2:
          result = num1 - num2;
          op = "-";
          break;
        case 3:
          result = num1 * num2;
          op = "*";
          break;
        case 4:
          result = num1 / num2;
          op = "/";
          break;
        case 5:
          result = num1 % num2;
          op = "%";
          break;
        default:
          System.out.println("잘못된 연산자 입니다");
          break;
      }
      if (num3 >= 1 && num3 <= 5) {
        System.out.println(num1 + op + num2 + "=" + result);
      } //end if
    }
  }
}





/*
public class Ex16 {
  public static void main(String[] args) {
    int num1, num2, num3, result = 0;
    String op = "";
    Scanner scanner = new Scanner(System.in);

    System.out.print("정수 1 : ");
    num1 = scanner.nextInt();
    System.out.print("정수 2 : ");
    num2 = scanner.nextInt();
    System.out.print("연산자 - 0 : 종료, 1 : +, 2 : -");
    num3 = scanner.nextInt();

    while (true) {
      if (num3 == 0) {
        System.out.println("종료");
        break;
      } else if (num3 == 1 ) {
        result = num1 + num2;
        System.out.println(result);
        break;
      } else if (num3 == 2) {
        result = num1 - num2;
        System.out.println(result);
        break;
      }
      System.out.println(result);
    }
  }
}
* */