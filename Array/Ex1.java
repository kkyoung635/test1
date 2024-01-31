package Array;

import java.util.Scanner;

/*
음식주문, 키보드로 4개받고 입출력 for문으로
*/
public class Ex1 {
  public static void main(String[] args) {
    String[] foods;
    foods = new String[4];
    Scanner scanner = new Scanner(System.in);

    // 입력
    for (int i = 0; i < foods.length; i++) {
      System.out.print((i+1) + "번째 주문 : ");
      foods[i] = scanner.nextLine();
    } // foods[0] ~ foods[length] 까지 반복한다.

    // 출력
    /*for (int i = 0; i < foods.length; i++) {
      System.out.print((i+1) + "번째 주문은 " + foods[i] + "입니다. ");*/

      // 확장 for문 : for ~ each문 : 개발에서만 사용
      /*
      for (타입 변수 : 배열) {
          배열의 개수만큼 반복
          반복하면 변수 각각의 값을 대입
      */

      for (String item : foods) {
        System.out.println("확장 for : " + item );
      }
    }
  }


/*
public class Ex1 {
  public static void main(String[] args) {
    String[] foods;
    foods = new String[4];
    Scanner scanner = new Scanner(System.in);

    // 입력
    for (int i = 0; i < foods.length; i++) {
      System.out.print((i+1) + "번째 주문 : ");
      foods[i] = scanner.nextLine();
    } // foods[0] ~ foods[length] 까지 반복한다.

    // 출력
    for (int i = 0; i < foods.length; i++) {
      System.out.print((i+1) + "번째 주문은 " + foods[i] + "입니다. ");
    }
  }
}
*/