package condition;

// 삼항 연산자
// 형식 : (조건) ? 참 결과 : 거짓 결과
// if ~ else 삼항으로 수정 가능
public class Con1 {
  public static void main(String[] args) {
    int age = 4;
    String result = (age >= 16) ? "성년" : "미성년";
    System.out.println(result);

    int x = 3; // 짝수, 홀수
    String result2 = (x % 2 == 0) ? "짝수" : "홀수";
    System.out.println(result2);

    int score = 85; // 합격, 불합격
    String result3 = (score >= 90) ? "합격" : "불합격";
    System.out.println(result3);

    // a = 10, b = 20, max = 0
    // 최대값 구하기
    // if, if ~ else, 삼항

    int a = 10;
    int b = 20;

    if (a > b) {
      System.out.println(a);
    }
    if (a < b) {
      System.out.println(b);
    }

    if (a > b) {
      System.out.println(a);
    } else {
      System.out.println(b);
    }

    int max = a > b ? a : b;
    System.out.println(max);
  }
}


