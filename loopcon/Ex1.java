package loopcon;

import java.util.Scanner;

public class Ex1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int money = 0, inMoney, outMoney = 0;
    int num = 0;

    while (true) {
      System.out.println("1. 예금 2. 출금 3. 잔고 4. 종료");
      System.out.print("선택 : ");
      num = scanner.nextInt();

      if (num == 1) {
        System.out.print("예금액 : ");
        inMoney = scanner.nextInt();
        money += inMoney;
      }

      if (num == 2) {
        System.out.print("출금액 : ");
        outMoney = scanner.nextInt();
        money -= outMoney;
      }

      if (num == 3) {
        System.out.println("잔고 : " + money + "원");
      }

      if (num == 4) {
        System.out.println("은행 프로그램 종료");
        break;
      }

      if (num > 4) {
        System.out.println("다시 입력 하세요");
      }
    } // end while
  }
}


