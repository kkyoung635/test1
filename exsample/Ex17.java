package exsample;

import java.util.Scanner;

/*
문제3)
위내용을  수정
op에 문자열 연산자를 입력받기
연산자 선택 : 종료 : end , +, -, *, /, %
* */
public class Ex17 {
  public static void main(String[] args) {
    int num1, num2, result = 0;
    String op = "";
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.print("정수 1 : ");
      num1 = scanner.nextInt();
      System.out.print("정수 2 : ");
      num2 = scanner.nextInt();
      System.out.println("연산자 선택 : 종료:0 , 1:+, 2:-, 3:*, 4:/, 5:%");
      System.out.print("선택 : ");

      scanner.nextLine(); // 정수 -> 문자열로 갈때 엔터와 sout 넣어줘야함
      op = scanner.nextLine();

      if (op.equals("end")) {
        System.out.println("계산기 프로그램 종료");
        break;
      } // end if
      switch (op) {
        case "+":
          result = num1 + num2;
          break;
        case "-":
          result = num1 - num2;
          break;
        case "*":
          result = num1 * num2;
          break;
        case "/":
          result = num1 / num2;
          break;
        case "%":
          result = num1 % num2;
          break;
        default:
          System.out.println("잘못된 연산자 입니다.");
          break;
      }
      if (op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/") || op.equals("%"));
      System.out.println(num1 + op + num2 + "=" + result);
    }
  }
}
