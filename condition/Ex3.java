package condition;

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
public class Ex3 {
  public static void main(String[] args) {
    int price = 1000;
    int age = 12;
    int dis = 1000;
    String result;
    int sum;

    if (price >= 10000 && age <= 10) {
      System.out.println("10000원 이상 구매 시 " + dis + "원 할인");
      System.out.println("어린이 " + dis + "원 할인");
      sum = dis + dis;
      result = "총 할인 금액 " + sum + "원 할인";
    } else if (price >= 10000) {
      //System.out.println("10000원 이상 구매 시 " + dis + "원 할인");
      System.out.println("10000원 이상 구매 시 " + dis + "원 할인");
      result = "총 할인 금액 " + dis + "원 할인";
    } else if (age <= 10) {
      //System.out.println("어린이 " + dis + "원 할인");
      System.out.println("어린이 " + dis + "원 할인");
      result = "총 할인 금액 " + dis + "원 할인";
    } else {
      result = "할인 대상 아님";
    }
    System.out.println(result);
  }
}
