package condition;

import java.util.Scanner;
/*
문제2 문제1 내용을 이용하여
둘중에 하나만 할인 : if ~ else
- 가격이 10000원 이상일 때, 1000원 할인

그렇지 않으면
- 나이가 10살 이하일 때 1000원 할인
*/

public class Sol2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int price, age, dis = 0;

    System.out.print("구매가격 : ");
    price = scanner.nextInt();

    System.out.print("할인나이 : ");
    age =  scanner.nextInt();

    if (price>=10000) {
      dis += 1000;
      System.out.println("10000원 이상 구매, 1000원 할인");
    } else if (age <=10) {
      dis += 1000;
      System.out.println("어린이는 1000원 할인");
    } else {
      dis = 0;
      System.out.println("1000원 할인 불가");
    }
    System.out.println("총 할인 금액 : " + dis + "원");
  }
}
