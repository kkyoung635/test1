package condition;

// 삼항 연산자
// 형식 : (조건) ? 참 결과 : 거짓 결과
// if ~ else 삼항으로 수정 가능
public class Con2 {
  public static void main(String[] args) {

    int a = 10;
    int b = 20;
    int max ;

    if (a > b) {
      max = a;
      System.out.println("최대값 : " + max);
    }
    if (a < b) {
      max = b;
      System.out.println("최대값 : " + max);
    }

    if (a > b) {
      max = a;
      System.out.println("최대값 : " + max);
    } else {
      max = b;
      System.out.println("최대값 : " + max);
    }

    max = a>b ? a : b;
    System.out.println("최대값 : " + max);

  }
}


