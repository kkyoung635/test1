package exsample;
/*
문제1 )
증감연산자로 처리하기
문자열로 처리하기 : strNum
증속(speed증가) | 2. 감속(speed감소) | 3. 중지(무한루프 종료) :

---
선택 : 1
결과 : 1
---
1. 증속(speed증가) | 2. 감속(speed감소) | 3. 중지(무한루프 종료) :
---
선택 : 1
결과 : 2
*/

import java.util.Scanner;

public class Ex15 {
  public static void main(String[] args) {
    String strNum = "";
    int speed = 0;
    String result = "";
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("-----------------------------------------------------------------");
      System.out.println("1. 증속(speed증가) | 2. 감속(speed감소) | 3. 중지(무한루프 종료) : ");
      System.out.println("-----------------------------------------------------------------");
      System.out.print("선택 : ");
      strNum = scanner.nextLine();
      //scanner.nextLine();

      if (strNum.equals("1")) {
        speed++;
        System.out.println("결과 : " + speed);
      } else if (strNum.equals("2")) {
        speed--;
        System.out.println("결과 : " + speed);
      } else if (strNum.equals("3")) {
        System.out.println("중지");
        //break;
      } else {
        System.out.println();
      }
    }
  }
}
