package operator;

public class Oper8 {
  public static void main(String[] args) {
    String name = "홍길동";
    int kor = 100, eng = 80, mat = 30;
    int sum = 0;
    double avg = 0.0;

    // 재할당
    sum = kor + eng + mat;
    avg = (double) sum/3.0;

    System.out.println("이름 : " + name);
    System.out.println("국어점수 : " + kor);
    System.out.println("영어점수 : " + eng);
    System.out.println("수학점수 : " + mat);
    System.out.println("세과목 점수 : " + sum);
    System.out.println("세과목 평균 : " + avg);
  }
}
