package exsample;

import java.util.Scanner;

/*
문제3)
키보드로 받기


foodName : 음식명
foodPrice : 음식가격
foodQuantity:음식수량


주문음식: xx
주문수량: xx  개
주문 총 금액: xx
 */
public class Ex7 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String foodName = "";
    int foodPrice, foodQuantity = 0;
    System.out.print("음식을 입력하세요 : ");
    foodName = scanner.nextLine();

    System.out.print("가격을 입력하세요 : ");
    foodPrice = scanner.nextInt();

    System.out.print("수량을 입력하세요 : ");
    foodQuantity = scanner.nextInt();

    System.out.println("음식은 " + foodName + "이고 " + "가격은 " + foodPrice+"원 입니다. " + "수량은 " + foodQuantity + "개 입니다.");
  }
}
