package exsample;

import java.util.Scanner;

/*
문제 8)

name , kor , eng, mat, avg , sum , hak
이름 :
국어 :
영어 :
수학 :
입력받기

총점 구하기
평균 구하기

평균점수가

90점 이상이면 학점은 A
80점 이상이면 학점은 B
70점 이상이면 학점은 C
60점 이상이면 학점은 D

그외
학점은 F

출력
홍길동의 총점은 xx이고 평균은 xx이면 학점은 xx입니다.
*/
public class Ex13 {
  public static void main(String[] args) {
    String name, hak = "";
    int kor, eng, mat, sum = 0;
    double avg = 0;

    Scanner scanner = new Scanner(System.in);
    System.out.print("이름 : ");
    name = scanner.nextLine();
    System.out.print("국어점수 : ");
    kor = scanner.nextInt();
    System.out.print("영어점수 : ");
    eng = scanner.nextInt();
    System.out.print("수학점수 : ");
    mat = scanner.nextInt();

    sum = kor + eng + mat;
    avg = sum / 3.0;

    if (avg >= 90) {
      hak = "A";
    } else if (avg >= 80) {
      hak = "B";
    } else if (avg >= 70) {
      hak = "C";
    } else if (avg >= 60){
      hak = "D";
    } else {
      hak = "F";
    }
    System.out.println(name+"의 총점은 " + sum + "이고 평균은 " + avg + "이며 " + "학점은 "+hak+"입니다.");
  }
}
