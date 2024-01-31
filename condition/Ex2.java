package condition;

/*
문제2 문제1 내용을 이용하여
둘중에 하나만 할인 : if ~ else
- 가격이 10000원 이상일 때, 1000원 할인

그렇지 않으면
- 나이가 10살 이하일 때 1000원 할인
*/
public class Ex2 {
  public static void main(String[] args) {
    int price = 9000;
    int age = 9;
    int dis = 1000;

    if (price >= 10000) {
      System.out.println("10000원 이상 구매, " + dis + "원 할인");
    } else if (age <= 10) {
      System.out.println("어린이 " + dis +" 원 할인");
    }
  }
}
