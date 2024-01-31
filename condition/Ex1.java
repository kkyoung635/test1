package condition;
/*
- 가격이 10000원 이상일 때, 1000원 할인
- 나이가 10살 이하일 때 1000원 할인
이 할인 시스템의 핵심은 **한 사용자가 동시에 여러 할인을 받을 수 있다는 점**이다.
예를 들어, 10000원짜리 아이템을 구매할 때 1000원 할인을 받고,동시에 나이가 10살 이하이면 추가로 1000원 더 할인을 받는다.
그래서 총 2000원 까지 할인을 받을 수 있다.
가격 : price
나이 : age
할인 : discount

결과
10000원 이상 구매, 1000원 할인
어린이 1000원 할인
총 할인 금액 2000원

힌트 )  단일 if문
////////////////////////////////////

* */
public class Ex1 {
  public static void main(String[] args) {
    int price = 15000;
    int age = 12;
    int dis = 1000;

    if (price >= 10000) {
      System.out.println("10000원 이상 구매, " + dis +"원 할인");
    } if ( age <= 10 ) {
      System.out.println("어린이 " + dis + "원 할인");
    }
    int sum = dis + dis;
    System.out.println("총 할인 금액 " + sum + "원");
  }
}
