package condition;

import java.util.Scanner;

public class Sol1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int price, age, dis = 0;

    System.out.print("구매가격 : ");
    price = scanner.nextInt();

    System.out.print("할인나이 : ");
    age =  scanner.nextInt();

    if (price >= 10000) {
      dis += 1000;
      System.out.println("10000원 이상 구매, 1000원 할인");
    } // 나이
    if (age <= 10 ) {
      dis += 1000;
      System.out.println("어린이는 1000원 할인");
    }
      System.out.println("총 할인 금액 : " + dis + "원");
  }
}

/*
package condition;

public class Sol1 {
  public static void main(String[] args) {
    int price, age, dis = 0;
    price = 20000;
    age = 10;

    if (price >= 10000) {
      dis += 1000;
      System.out.println("10000원 이상 구매, 1000원 할인");
    } // 나이
    if (age <= 10 ) {
      dis += 1000;
      System.out.println("어린이는 1000원 할인");
    }
      System.out.println("총 할인 금액 : " + dis + "원");
  }
}
*/