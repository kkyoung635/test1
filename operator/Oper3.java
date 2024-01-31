package operator;

// 대입(복합) 연산자
public class Oper3 {
  public static void main(String[] args) {
    int x, y;
    x = 10;
    y = 20;

    // x = x + y;
    x += y ;
    System.out.println("합 : " + x);

    // 값 30에서 진행
    // x = x - y;
    x -= y;
    System.out.println("차 : " + x);

    // 값 10에서 진행
    // x = x * y;
    x *= y;
    System.out.println("곱 : " + x);

    // 값 200에서 진행
    // x = x / y;
    x /= y;
    System.out.println("몫 : " + x);

    // 값 10에서 진행
    x = x % y;
    System.out.println("나누기 : " + x);

  }
}
