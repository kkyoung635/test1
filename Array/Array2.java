package Array;

import java.util.Scanner;

public class Array2 {
  public static void main(String[] args) {
    int[] korScore;
    korScore = new int [5];
    Scanner scanner = new Scanner(System.in);
    int sum = 0;
    double avg = 0;

    // 입력
    for ( int i = 0; i < 5; i++) {
      System.out.print("학생 " + (i+1) + "번의 국어점수 : ");
      korScore[i] = scanner.nextInt();
      sum += korScore[i];  // sum = sum + korScore[0] .... 4까지 반복
    }
    // 출력
    for (int i = 0; i < 5; i++) {
      System.out.println("korScore["+i+"] : " + korScore[i]);
    }
    avg = (double) sum/korScore.length;
    // 학생 x명의 국어 접수 합은 xx 이고 반 국어 점수 평균은 xx 입니다.
    // 평균 점수로 => 마지막에 출력
    System.out.println("학생 " + korScore.length + "명의 국어점수 합은 " + sum +"이고 반 국어 점수 평균은 " + avg + "입니다.");
  }
}

