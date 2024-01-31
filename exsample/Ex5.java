package exsample;

import java.util.Scanner;

/*
1. 정수를 키보드로 받기
nextInt : 공백 전까지 정수를 찾음
2. 입력받은 값이 짝수, 홀수?
3. 결과 : 입력한 정수 30은 짝수 입니다.
 */
public class Ex5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = 0;
    System.out.print(" 정수를 입력하세요 : ");
    num = scanner.nextInt();

    if (num%2 == 0) {
      System.out.println("입력한 정수는" + num + "은(는) 짝수입니다.");
    } else {
      System.out.println("입력한 정수는" + num + "은(는) 홀수입니다.");
    } // end if
  }
}

/*
import java.util.Scanner;

public class Ex5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num1 = 0;
    System.out.print("숫자를 입력하세요 : ");
    num1 = scanner.nextInt();

    if (num1 % 2 == 0) {
      System.out.println("입력한 정수 " + num1 + "은(는) 짝수입니다.");
    } else {
      System.out.println("입력한 정수 " + num1 + "은(는) 홀수입니다.");
    }
  }
}

 */