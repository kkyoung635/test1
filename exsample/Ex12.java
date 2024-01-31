package exsample;

import java.util.Scanner;

/*
switch

7-1 )
grade : A, B, C, D, F 중에 입력

A : 최고 점수
B : 시험에 통과
C : 노력이 필요
D: 재시험
F: 불합격 재시험 불가

그외는
잘못된 학점

7-2 )
switch 화살표로 수정
result 에 담아서 출력하기
*/
public class Ex12 {
  public static void main(String[] args) {
    String grade = "", result = "";
    Scanner scanner = new Scanner(System.in);
    System.out.print("학점 입력 : ");
    grade = scanner.nextLine();

    result = switch (grade) {
      case "A"->"최고점수";
      case "B"->"시험에 통과";
      case "C"->"노력이 필요";
      case "D"->"재시험";
      case "F"->"불합격 재시험 불가";
      default ->"잘못된 학점";
    };
    System.out.println(result);
  }
}


/*
public class Ex12 {
  public static void main(String[] args) {
    String grade, result = "";
    Scanner scanner = new Scanner(System.in);

    System.out.print("등급 입력 : ");
    grade = scanner.nextLine();

    switch (grade) {
      case "A":
        result = "최고 점수";
        break;
      case "B":
        result = "시험에 통과";
        break;
      case "C":
        result = "노력이 필요";
        break;
      case "D":
        result = "재시험";
        break;
      case "F":
        result = "불합격 재시험 불가";
        break;
      default:
        result = "잘못된 학점";
    }
    System.out.println(result);
  }
}
 */