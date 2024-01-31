package operator;

// 이름, 국어점수, 영어점수, 수학점수 의 합계와 평균 구하기
// name, kor, eng, mat, sum, avg
// name : 문자열, kor : 정수, eng : 정수, mat : 정수, sum : 정수, avg : 실수
/*
* 이름 : xxx
* 국어점수
* 영어점수
* 수학점수
* 세과목 총점
* 세과목 평균
* */

public class Oper7 {
  public static void main(String[] args) {
    String name;
    int kor, eng, mat, sum;
    double avg;

    name = "홍길동";
    kor = 95;
    eng = 89;
    mat = 30;

    sum = kor + eng + mat;
    avg = sum/3.0;
    avg = (double) sum/3; // 한쪽이 항이 실수형이면 실수 값이 나옴.

    System.out.println("이름 : " +  name);
    System.out.println("국어점수 : " +  kor);
    System.out.println("영어점수 : " +  eng);
    System.out.println("수학점수 : " +  mat);
    System.out.println("세과목 총점 : " + sum);
    System.out.println("세과목 평균 : " + avg);
  }
}
