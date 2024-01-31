package condition;

import java.util.Scanner;
/*
문제3) 문제1 내용을 이용 다중 if문

- 가격이 10000원 이상일 때, 나이가 10살 이하일 때
1000원 이상구매시 1000원 할인
어린이는 1000원 할인
총금액은 2000원 할인

- 가격이 10000원 이상일 때
1000원 이상구매시 1000원 할인
총금액은 1000원 할인

- 나이가 10살 이하일때
어린이는 1000원 할인
총금액은 1000원 할인
*/

public class Sol3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int price, age, dis = 0;

    System.out.print("구매가격 : ");
    price = scanner.nextInt();

    System.out.print("할인나이 : ");
    age =  scanner.nextInt();

    // 금액, 나이 모두 만족할 경우
    if (price>=10000 && age <=10) {
      dis += 2000;
      System.out.println("10000원 이상 구매, 1000원 할인");
      System.out.println("어린이는 1000원 할인");

    } else if (price >=10000 || age <=10) {
      dis += 1000;
      System.out.println("10000원 구매 또는 어린이는 1000원 할인");

    } else {
      dis = 0;
      System.out.println("1000원 할인 불가");
    }
    System.out.println("총 할인 금액 : " + dis + "원");
  }
}
