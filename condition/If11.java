package condition;

// 다중 if문 동일한 형식의 결과 2개 이상일 때

// if (조건식) 필수
/*
if (조건식1) {
      참 결과1
    } else if (조건식2) {
      참 결과2
    } else if
    ...
      else {
        그외 결과
    }
*/

/*
경품 추천
1. 운동화
3. 화장품
5. 구두
9. 상품권
그외 꽝
*/

public class If11 {
  public static void main(String[] args) {
    int x = 3;

    if (x == 1) {
      System.out.println("운동화");
    } else if (x == 3) {
      System.out.println("화장품");
    } else if (x == 5) {
      System.out.println("구두");
    } else if (x == 9) {
      System.out.println("상품권");
    } else {
      System.out.println("꽝");
    }

    int age = 20;
    if (age < 8) {
      System.out.println("미취학");
    } else if (age < 13) {
      System.out.println("초등학생");
    } else if (age < 16) {
      System.out.println("중학생");
    } else if (age < 18) {
      System.out.println("고등학생");
    } else {
      System.out.println("성인");
    }

    int age2 = 13;
    String result;
    if (age2 <= 7) {
      result = "미취학";
    } else if (age2 >= 8 && age2 <= 13) {
      result = "초등학생";
    } else if (age2 >= 14 && age2 <= 16) {
      result = "중학생";
    } else if (age2 >= 17 && age2 <=19) {
      result = "고등학생";
    } else {
      result = "성인";
    }
    System.out.println("결과 : " + result);
  }
}
