package condition;
/*
2)
방식1 : 범위 : 비교 + 논리 연산자
점수 :
점수가 60미만 :재시험
60 ~ 70미만 : 경고
70 ~ 80미만 : 통과
80 ~ 100 : 1학기프리패스

방식2 : 범위 : 비교
점수 :
점수가 60미만 :재시험
60 ~ 70미만 : 경고
70 ~ 80미만 : 통과
80 ~ 100 : 1학기프리패스
*/

public class If4 {
  public static void main(String[] args) {
    int score1, score2;
    score1 = 84;
    score2 = 55;

    if (score1 < 60) {
      System.out.println("재시험");
    } if (score1 >= 60 && score1 < 70) {
      System.out.println("경고");
    } if (score1 >= 70 && score1 < 80) {
      System.out.println("통과");
    } if (score1 >= 80) {
      System.out.println("1학기 프리패스");
    }

    if (score2 < 60) {
      System.out.println("재시험");
    } if (score2 < 70) {
      System.out.println("경고");
    } if (score2 < 80) {
      System.out.println("통과");
    } if (score2 >=80) {
      System.out.println("1학기 프리패스");
    }
  }
}
