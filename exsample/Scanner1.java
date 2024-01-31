package exsample;

import java.util.Scanner;

public class Scanner1 {
  public static void main(String[] args) {
    int num1, num2, sum = 0;
    Scanner scanner = new Scanner(System.in);
    while (true) {
      System.out.println("===두 수의 합===");
      System.out.print(" 값 1 : ");
      num1 = scanner.nextInt();
      System.out.print(" 값 2 : ");
      num2 = scanner.nextInt();
      if ( num1 == 0 && num2 == 0) {
        System.out.println("종료");
        break;
      }
      sum = num1+num2;
      System.out.println("두 수의 합 : " + sum);
    }
  }
}
