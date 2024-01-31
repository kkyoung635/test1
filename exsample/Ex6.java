package exsample;

import java.util.Scanner;

/*
1. 정수를 키보드로 받기
     nextInt : 공백전까지 정수를 찾기
2. 정수를 입력한만큼 반복 for문
3. 짝수의 합구하기 if문
3. 결과 : 총 짝수의 합은 : xx
 */
public class Ex6 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int max = 0, sum =0;
    System.out.print("정수입력 : ");
    max = scanner.nextInt();
    for (int i = 0; i <= max; i++) {
      if (i%2==0) {
        sum += i;
      }
      System.out.println("총 짝수의 합은 : " + sum);
    } //end for
  }
}

/*
import java.util.Scanner;

public class Ex6 {
  public static void main(String[] args) {
    int num1, num2, sum = 0;
    Scanner scanner = new Scanner(System.in);
    while (true) {
      System.out.println("정수입력");
      System.out.print("값 1 : ");
      num1 = scanner.nextInt();
      if (num1 % 2 == 1) {
        System.out.println("종료");
        break;
      }
      sum += num1;
      System.out.println("총 짝수의 합은 : " + sum);
    }
  }
}
 */