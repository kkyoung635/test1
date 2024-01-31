package condition;

// if ~ else
public class If6 {
  public static void main(String[] args) {
    // 점수 변수의 값이 80 이상이면 합격,
    // 점수 변수의 값이 80 미만이면 불합격
    int score = 75;
    if (score >= 80) {
      System.out.println("합격");
    } else {
      System.out.println("불합격");
    }

    // 나이가 18이상이면 성년, 아니면 미성년

    int age = 18;
    if (age >= 18) {
      System.out.println("성년");
    } else {
      System.out.println("미성년");
    }
  }
}
